package com.example.schoolregistrationsystem.repository;


import com.example.schoolregistrationsystem.entity.StudentCourseRegistration;
import com.example.schoolregistrationsystem.handler.Loggable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Loggable
@Repository
public interface StudentCourseRegistrationRepository extends JpaRepository<StudentCourseRegistration,Long> {

}
