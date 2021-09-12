package com.lhint.springdemo2.response;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.lhint.springdemo2.model.Registration;

import javax.persistence.*;

public class CourseResponse {

    private Integer id;

    private String name;

    private String description;

   private RegistrationResponse registrations;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RegistrationResponse getRegistrations() {
        return registrations;
    }

    public void setRegistrations(RegistrationResponse registrations) {
        this.registrations = registrations;
    }

    @Override
    public String toString() {
        return "CourseResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", registrations=" + registrations +
                '}';
    }
}
