package com.example.strapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor // Lombok annotation to generate a constructor with all arguments
@NoArgsConstructor // Lombok annotation to generate a default constructor
@Data  // Lombok annotation to generate getters, setters, toString, hashCode, and equals methods
public class StudentDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private String address;
}
