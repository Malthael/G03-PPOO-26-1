package com.example.tuto002.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.tuto002.models.Student;

public interface IStudentRepository  extends CrudRepository<Student,Integer> {
    
}
