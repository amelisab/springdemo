package com.lhint.springdemo2.converters;

import com.lhint.springdemo2.dto.CourseDTO;
import com.lhint.springdemo2.model.Course;
import com.lhint.springdemo2.model.Registration;
import com.lhint.springdemo2.response.CourseResponse;
import com.lhint.springdemo2.response.RegistrationResponse;

import java.util.ArrayList;
import java.util.List;

public class CourseConverter {

    public CourseDTO convert(Course course){
        CourseDTO response = new CourseDTO();

        response.setCourseName(course.getName());

        return response;
    }

}
