package com.example.schoolregistrationsystem.repository;

import com.example.schoolregistrationsystem.entity.Student;
import com.example.schoolregistrationsystem.handler.Loggable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Loggable
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    Optional<Student> getStudentsById(Long id);
}
