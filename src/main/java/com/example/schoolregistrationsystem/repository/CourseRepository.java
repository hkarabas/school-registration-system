package com.example.schoolregistrationsystem.repository;

import com.example.schoolregistrationsystem.entity.Course;
import com.example.schoolregistrationsystem.handler.Loggable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Loggable
@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
    Optional<Course> getCourseById(Long id);
}
