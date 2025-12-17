package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.StudentEntity;

public interface StudentService {
    StudentEntity savedata(StudentEntity student);
    StudentEntity getidval(Long id);
    List<StudentEntity> getall();
    StudentEntity update(Long id, StudentEntity student);
    void delete(Long id);
}
