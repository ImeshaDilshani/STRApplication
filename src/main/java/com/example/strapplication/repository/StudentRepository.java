package com.example.strapplication.repository;

import com.example.strapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

// The StudentRepository interface extends JpaRepository, providing CRUD(Create, Read, Update, and Delete) operations for the Student entity
public interface StudentRepository extends JpaRepository<Student,Long> {

}
