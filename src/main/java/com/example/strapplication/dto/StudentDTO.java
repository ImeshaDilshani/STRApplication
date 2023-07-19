package com.example.strapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO {
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private int teleNo;
    //private String dob;

}
