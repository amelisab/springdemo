package com.lhint.springdemo2.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="registration")
public class Registration {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="registration_name")
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "registration", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Course> courses = new ArrayList<Course>();

    public Registration() {
    }

    public Registration(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        if (this.courses == null){
            this.courses = courses;
        } else {
            this.courses.addAll(courses);
        }
    }

    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
