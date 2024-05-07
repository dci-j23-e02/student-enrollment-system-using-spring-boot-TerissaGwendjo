package org.example.student_enrollment_system.service;

import org.example.student_enrollment_system.model.StudentEnrollmentSystem;
import org.example.student_enrollment_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List <StudentEnrollmentSystem> getAllStudents() {
        return studentRepository.findAll();
    }

    public void saveStudent (StudentEnrollmentSystem student) {
        studentRepository.save(student);
    }

}
