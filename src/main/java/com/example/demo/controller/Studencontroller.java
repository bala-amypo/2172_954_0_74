package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    // ADD
    @PostMapping("/add")
    public StudentEntity addStudent(@RequestBody StudentEntity student) {
        return service.addStudent(student);
    }

    // GET ALL
    @GetMapping("/all")
    public List<StudentEntity> getAllStudents() {
        return service.getAllStudents();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public StudentEntity updateStudent(
            @PathVariable Long id,
            @RequestBody StudentEntity student) {
        return service.updateStudent(id, student);
    }
}