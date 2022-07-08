package com.example.schoolregistrationsystem.mapper;

import com.example.schoolregistrationsystem.entity.Course;
import com.example.schoolregistrationsystem.model.CourseDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {
    private final static ModelMapper modelmapper = new ModelMapper();

    public Course toCourse(CourseDto courseDto) {
        if (courseDto == null) {
            return null;
        }
        return modelmapper.map(courseDto, Course.class);
    }

    public CourseDto toCourseDto(Course course) {
        if (course == null) {
            return null;
        }
        return modelmapper.map(course, CourseDto.class);
    }
}
