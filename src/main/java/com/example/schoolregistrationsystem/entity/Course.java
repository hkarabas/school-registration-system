package com.example.schoolregistrationsystem.entity;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@AllArgsConstructor
@Setter
@Getter
@Builder
@NoArgsConstructor
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "lastupdate")
    private LocalDateTime lastUpdate;

    @OneToMany(mappedBy = "course")
    Set<StudentCourseRegistration> courseRegistrations;

}
