package com.example.demo.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "Student")
public class StudentEntity {
    @Id
    @GeneratedValue(startegy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "should not contain spaces")
    @Column(unique=true)
    private String name;
    @NotBlank(message = "not spaces")
    @Email(message = "invalid format")
    private String email;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public NewfileEntity(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public NewfileEntity() {
    }
    
}
