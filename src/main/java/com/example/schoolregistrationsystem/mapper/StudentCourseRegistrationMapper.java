package com.example.schoolregistrationsystem.mapper;


import com.example.schoolregistrationsystem.entity.Student;
import com.example.schoolregistrationsystem.entity.StudentCourseRegistration;
import com.example.schoolregistrationsystem.model.StudentCourseRegistrationDto;
import com.example.schoolregistrationsystem.model.StudentDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentCourseRegistrationMapper {

    private final static ModelMapper modelmapper = new ModelMapper();

    public StudentCourseRegistration toStudentCourseRegistration(StudentCourseRegistrationDto studentCourseRegistrationDto) {
        if (studentCourseRegistrationDto == null) {
            return null;
        }
        return modelmapper.map(studentCourseRegistrationDto, StudentCourseRegistration.class);
    }

    public StudentCourseRegistrationDto toStudentCourseRegistrationDto(StudentCourseRegistration studentCourseRegistration) {
        if (studentCourseRegistration == null) {
            return null;
        }
        return modelmapper.map(studentCourseRegistration, StudentCourseRegistrationDto.class);
    }

}
