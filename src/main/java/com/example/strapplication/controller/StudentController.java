package com.example.strapplication.controller;

import com.example.strapplication.dto.StudentDTO;
import com.example.strapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value ="/api/v1/student" )
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
        return studentService.saveStudent(studentDTO);
    }


}
