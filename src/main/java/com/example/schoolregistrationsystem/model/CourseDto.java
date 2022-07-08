package com.example.schoolregistrationsystem.model;

import com.example.schoolregistrationsystem.entity.StudentCourseRegistration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;


@Builder
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Course Api model documentation", description = "Model")
public class CourseDto {

    @ApiModelProperty(value = "Unique id field of course object")
    private Long id;

    @ApiModelProperty(value = "Name field of course object")
    private String name;

    @ApiModelProperty(value = "LastUpdate field of course object")
    private LocalDateTime lastUpdate;

    @ApiModelProperty(value = "List of Registrations field of course object")
    Set<StudentCourseRegistrationDto> courseRegistrations;


}
