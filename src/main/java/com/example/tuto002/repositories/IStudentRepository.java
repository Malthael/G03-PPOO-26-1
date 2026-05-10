package com.example.tuto002.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.tuto002.models.Student;

@Repository
public interface IStudentRepository  extends CrudRepository<Student,Integer> {
    
}
