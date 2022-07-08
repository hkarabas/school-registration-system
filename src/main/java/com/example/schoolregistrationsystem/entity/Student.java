package com.example.schoolregistrationsystem.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;


@AllArgsConstructor
@Setter
@Getter
@Builder
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    private String address;

    @Column(name = "lastupdate")
    private LocalDateTime lastUpdate;

    @OneToMany(mappedBy = "student")
    Set<StudentCourseRegistration> studentCourseRegistrations;

}
