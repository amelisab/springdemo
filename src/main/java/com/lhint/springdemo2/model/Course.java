package com.lhint.springdemo2.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Course")
public class Course implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "course_name")
    private String name;

    @Column(name = "course_description")
    private String description;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="registration_id")
    private Registration registration;

    @ManyToMany(mappedBy = "courses")
    private List<User> users;

    public Course(){}

    public Course(String name, String description, Registration registration) {
        this.name = name;
        this.description = description;
        this.registration = registration;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", decription='" + description + '\'' +
                ", registrations=" + registration +
                '}';
    }
}
