package com.example.schoolregistrationsystem.exception;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SchoolRegistrationError implements Serializable {

    private static final long serialVersionUID = -3882051562444875848L;

    private Integer code;
    private String message;
    private String cause;
    private LocalDateTime timestamp;
}
