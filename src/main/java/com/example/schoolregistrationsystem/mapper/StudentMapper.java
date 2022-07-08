package com.example.schoolregistrationsystem.mapper;


import com.example.schoolregistrationsystem.entity.Student;
import com.example.schoolregistrationsystem.model.StudentDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    private final static ModelMapper modelmapper = new ModelMapper();

    public Student toStudent(StudentDto studentDto) {
        if (studentDto == null) {
            return null;
        }
        return modelmapper.map(studentDto, Student.class);
    }

    public StudentDto toStudentDto(Student student) {
        if (student == null) {
            return null;
        }
        return modelmapper.map(student, StudentDto.class);
    }
}
