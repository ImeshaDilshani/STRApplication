package com.example.strapplication.service;

import com.example.strapplication.dto.StudentDTO;
import com.example.strapplication.model.Student;
import com.example.strapplication.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
// The StudentService class is a service component responsible for handling business logic related to students.
public class StudentService {
    @Autowired
    StudentRepository studentRepository;//injects the StudentRepository instance into this service, allowing interaction with the database.

    @Autowired
    private ModelMapper modelMapper;//injects the ModelMapper instance, which is used to map between StudentDTO and Student entities.

    // The saveStudent method is used to save a student to the database. It takes a StudentDTO as input,
    // maps it to a Student entity using the modelMapper, and then saves the entity to the database using the studentRepository.
    public StudentDTO saveStudent(StudentDTO studentDTO){
        studentRepository.save(modelMapper.map(studentDTO,Student.class));
        return studentDTO;// Returns the input StudentDTO as it is after saving (not modified).
    }
}
