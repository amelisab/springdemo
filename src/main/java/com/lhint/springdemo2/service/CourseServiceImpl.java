package com.lhint.springdemo2.service;

import com.lhint.springdemo2.converters.CourseConverter;
import com.lhint.springdemo2.dto.CourseDTO;
import com.lhint.springdemo2.model.Course;
import com.lhint.springdemo2.repository.CourseRepository;
import com.lhint.springdemo2.response.CourseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    CourseConverter courseConverter = new CourseConverter();

    @Override
    public Course saveOrUpdate(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void delete(Integer id) {
        courseRepository.delete(find(id));
    }

    @Override
    public Course find(Integer id) {
        return courseRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Id is invalid"));
    }

    @Override
    public List<CourseDTO> listAll() {
        List<CourseDTO> dto = new ArrayList<>();
        List<Course> courses = courseRepository.findAll();
        for (Course c : courses) {
            dto.add(courseConverter.convert(c));
        }
        return dto;
    }
}
