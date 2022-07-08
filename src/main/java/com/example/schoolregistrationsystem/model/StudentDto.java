package com.example.schoolregistrationsystem.model;

import com.example.schoolregistrationsystem.entity.StudentCourseRegistration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;


@Builder
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Student Api model documentation", description = "Model")
public class StudentDto {
    @ApiModelProperty(value = "Unique id field of course object")
    private Long id;

    @ApiModelProperty(value = "First Name field of Student object")
    private String firstName;

    @ApiModelProperty(value = "Last Name field of Student object")
    private String lastName;

    @ApiModelProperty(value = "Last Name field of Student object")
    private String address;

    @ApiModelProperty(value = "LastUpdate field of course object")
    private LocalDateTime lastUpdate;

    @ApiModelProperty(value = "List of Registrations field of Student object")
    Set<StudentCourseRegistration> studentCourseRegistrations;





}
