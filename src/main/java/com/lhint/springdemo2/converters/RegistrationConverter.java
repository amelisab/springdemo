package com.lhint.springdemo2.converters;

import com.lhint.springdemo2.model.Course;
import com.lhint.springdemo2.model.Registration;
import com.lhint.springdemo2.response.CourseResponse;
import com.lhint.springdemo2.response.RegistrationResponse;

import java.util.ArrayList;
import java.util.List;

public class RegistrationConverter {

//    private static CourseConverter courseConverter = new CourseConverter();
//
//    public RegistrationResponse convert(Registration registration){
//
//        RegistrationResponse response = new RegistrationResponse();
//        response.setId(registration.getId());
//        response.setName(registration.getName());
//
//        List<CourseResponse> courseResp = new ArrayList<>();
//        for(Course c : registration.getCourses()) {
//            courseResp.add(courseConverter.convert(c));
//        }
//        response.setCourses(courseResp);
//        return  response;
//    }
}
