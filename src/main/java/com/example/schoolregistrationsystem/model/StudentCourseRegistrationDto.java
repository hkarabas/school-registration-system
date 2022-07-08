package com.example.schoolregistrationsystem.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


import java.time.LocalDateTime;

@Builder
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Registration Api model documentation", description = "Model")
public class StudentCourseRegistrationDto {

    @ApiModelProperty(value = "Unique id field of Registration object")
    Long id;

    @ApiModelProperty(value = " Student field of Registration object")
    StudentDto student;

    @ApiModelProperty(value = " Course field of Registration object")
    CourseDto course;

    @ApiModelProperty(value = " Registered Date field of Registration object")
    LocalDateTime registeredAt;

}
