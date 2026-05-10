package com.example.tuto002.controllers;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.example.tuto002.models.Student;
import com.example.tuto002.services.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/estudiante")
public class StudentController {

    @Autowired
    private StudentService studentService;
    
    @GetMapping
    public ResponseEntity<ArrayList<Student>> GetAll(){
        return ResponseEntity.ok(studentService.getAll());
    }

    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student student){
        return ResponseEntity.ok(studentService.save(student));
    }

    @PutMapping
    public ResponseEntity<Student> update(@RequestBody Student student){
        return ResponseEntity.ok(studentService.update(student));
    }

    // Crear el Metodo para Eliminar un Estudiante por Id


    
}
