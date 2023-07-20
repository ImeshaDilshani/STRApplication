package com.example.strapplication.controller;

import com.example.strapplication.dto.StudentDTO;
import com.example.strapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value ="/api/v1/student" )
@CrossOrigin // Allow cross-origin requests (for frontend hosted on different domains
public class StudentController {
    @Autowired
    private StudentService studentService;

    // Handle HTTP POST request to save a student
    @PostMapping("/saveStudent")
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
        // Call the StudentService to save the student and return the saved student data
        return studentService.saveStudent(studentDTO);
    }


}
