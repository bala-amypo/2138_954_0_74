package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public StudentEntity save(@RequestBody StudentEntity student) {
        return service.savedata(student);
    }

    @GetMapping("/{id}")
    public StudentEntity getById(@PathVariable Long id) {
        return service.getidval(id);
    }

    @GetMapping("/all")
    public List<StudentEntity> getAll() {
        return service.getall();
    }

    @PutMapping("/update/{id}")
    public StudentEntity update(
            @PathVariable Long id,
            @RequestBody StudentEntity student) {
        return service.update(id, student);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Student deleted successfully";
    }
}
