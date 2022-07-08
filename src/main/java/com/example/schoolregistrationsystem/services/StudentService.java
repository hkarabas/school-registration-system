package com.example.schoolregistrationsystem.services;

import com.example.schoolregistrationsystem.handler.Loggable;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
@Loggable
public class StudentService {
    @Value("${registration.student.max}")
    private final int maxStudent;

}
