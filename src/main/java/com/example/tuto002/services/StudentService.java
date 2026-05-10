package com.example.tuto002.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tuto002.models.Student;
import com.example.tuto002.repositories.IStudentRepository;

@Service
public class StudentService {
    
    @Autowired
    private IStudentRepository studentRepository;

   // obtener todos
    public ArrayList<Student> getAll(){
        // SELECT * FROM estudiante;
        return (ArrayList<Student>) studentRepository.findAll();
    }

    // crear
    public Student save(Student student){
        // insert into estudiante (x,xx,x) values(x,x,x,) 
        return studentRepository.save(student);
    }

    // actualizar
    public Student update(Student student){
        return existeEstudiante(student.getId()) ? studentRepository.save(student) : null;
    }

    public void delete(){
        //estudiante exista
        // si existe vamos a borrar  , sino retorna novedad
    }

    private boolean existeEstudiante(int id){
        return studentRepository.findById(id).isEmpty() == true ? false : true;
    }

}
