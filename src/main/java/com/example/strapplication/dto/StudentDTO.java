package com.example.strapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private int age;
    private String email;
    //private String phoneNo;
    private String address;
}
