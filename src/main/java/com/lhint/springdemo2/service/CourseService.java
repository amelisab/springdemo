package com.lhint.springdemo2.service;

import com.lhint.springdemo2.dto.CourseDTO;
import com.lhint.springdemo2.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    Course saveOrUpdate(Course course);

    void delete(Integer id);

    Course find(Integer id);

    List<CourseDTO> listAll();

}
