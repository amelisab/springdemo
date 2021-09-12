package com.lhint.springdemo2.response;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.lhint.springdemo2.model.Course;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class RegistrationResponse {

    private Integer id;

    private String name;

    private List<CourseResponse> courses = new ArrayList<CourseResponse>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseResponse> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseResponse> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "RegistrationResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
