package com.example.tuto002.controllers;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.example.tuto002.models.Student;
import com.example.tuto002.services.StudentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/estudiante")
public class StudentController {

    @Autowired // crear instancia de la clase StudentService
    private StudentService studentService;

    @GetMapping // Crear el Metodo GET para Obtener Todos los Estudiantes
    public ResponseEntity<ArrayList<Student>> GetAll() {
        return ResponseEntity.ok(studentService.getAll());
    }

    @PostMapping // Crear el Metodo POST para Guardar un Estudiante
    public ResponseEntity<Student> save(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.save(student));
    }

    @PutMapping // Crear el Metodo PUT para Actualizar un Estudiante
    public ResponseEntity<Student> update(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.update(student));
    }

    @DeleteMapping // Crear el Metodo para Eliminar un Estudiante por Id
    public ResponseEntity<String> delete(@RequestBody Student student) {
        studentService.delete(student.getId());
        return ResponseEntity.ok("Estudiante Eliminado");
    }

}
