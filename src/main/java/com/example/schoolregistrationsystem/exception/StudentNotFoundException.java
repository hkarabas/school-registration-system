package com.example.schoolregistrationsystem.exception;


public class StudentNotFoundException extends RuntimeException {

    public static final String STUDENT_NOT_FOUND_MESSAGE = "Student %d not found";

    public StudentNotFoundException(Long id) {
        super(String.format(STUDENT_NOT_FOUND_MESSAGE, id));
    }

    public StudentNotFoundException() {
        super(STUDENT_NOT_FOUND_MESSAGE);
    }
}
