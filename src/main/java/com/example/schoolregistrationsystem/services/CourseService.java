package com.example.schoolregistrationsystem.services;

import com.example.schoolregistrationsystem.entity.Course;
import com.example.schoolregistrationsystem.handler.Loggable;
import com.example.schoolregistrationsystem.mapper.CourseMapper;
import com.example.schoolregistrationsystem.repository.CourseRepository;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Loggable
public class CourseService {

    private CourseRepository courseRepository;
    private CourseMapper courseMapper;

     @Value("${registration.course.max}")
     private final int maxCourse;

     public Course


}
