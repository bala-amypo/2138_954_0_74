package com.example.practice.controller;

import java.util.List;
import .jvautil.Optional;

@RestController
public class Studentcontroller{
    @Autowired
    Studentservice studentservice;

    @PostMapping("/add")
    public StudentEntity
    post(@RequestBody StudentEntity student){
        return
        studentservice.saveData(student);
    }
    @GetMapping("/get")
    public List<StudentEntity>
    getAllstudents(){
        return 
        studentservice.getAllStudentEntity(;
    }
    @GetMapping("/get/{id}")
    public
    Optional<studentEntity>
    get(@pathVariable int id) {
        return 
        studentservice.getStudentById(id);
    }
    @PutMapping("/update{id}")
    public String
    update(@RequestBody StudentEntity student,@{PathVariable int id){
        Optional<StudentEntity>
        existingStudent=studentservice.getStudentById(id);
        if
        (existingStudent.isPresent()){
            student.setId(id);
            studentservice.insertStudent(student);
            return "Student updated successfully";
        }
        else{
            return "Student not found";
        }

        };
        @DeleteMapping("/delete/{id}")
        public string 
        delete(@PathVariable int id){
            Optional<StudentEntity>
            student=studentservice.getStudentById(id);
            if(student.isPresent()){
                studentservice.deleteStudent-ById(id);
                return"Student deleted successfully";
            }
            else{
                return "Student not found";
            }
            
        }

        }

        }
    }
}