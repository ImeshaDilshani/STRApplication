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
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper;


    public StudentDTO saveStudent(StudentDTO studentDTO){
        studentRepository.save(modelMapper.map(studentDTO,Student.class));
        return studentDTO;
    }


}
