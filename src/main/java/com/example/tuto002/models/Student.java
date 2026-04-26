package com.example.tuto002.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Student {
    
    @Id
    private int id;
    private String names;
    private String lastNames;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNames() {
        return this.names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return this.lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }



}
