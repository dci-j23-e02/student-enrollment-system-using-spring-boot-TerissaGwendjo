package org.example.student_enrollment_system.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class StudentEnrollmentSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    // Constructor
    public StudentEnrollmentSystem() {
    }
    public StudentEnrollmentSystem(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Getters and setters
    public Long getId() {
        return id;
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




}
