package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository rep;

    public StudentServiceImpl(StudentRepository rep) {
        this.rep = rep;
    }

    @Override
    public StudentEntity savedata(StudentEntity student) {
        return rep.save(student);
    }

    @Override
    public StudentEntity getidval(Long id) {
        return rep.findById(id).orElse(null);
    }

    @Override
    public List<StudentEntity> getall() {
        return rep.findAll();
    }

    @Override
    public StudentEntity update(Long id, StudentEntity student) {
        StudentEntity existing = getidval(id);

        if (existing != null) {
            existing.setName(student.getName());
            existing.setEmail(student.getEmail());
            return rep.save(existing);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        rep.deleteById(id);
    }
}
