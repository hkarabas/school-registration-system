package com.example.schoolregistrationsystem.exception;

public class CourseNotFoundException  extends  RuntimeException {
    public static final String COURSE_NOT_FOUND_MESSAGE = "Course %d not found";

    public CourseNotFoundException(Long id) {
        super(String.format(COURSE_NOT_FOUND_MESSAGE, id));
    }

    public CourseNotFoundException() {
        super(COURSE_NOT_FOUND_MESSAGE);
    }
}
