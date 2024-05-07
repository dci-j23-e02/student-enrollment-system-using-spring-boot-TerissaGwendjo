package org.example.student_enrollment_system.controller;

import org.example.student_enrollment_system.model.StudentEnrollmentSystem;
import org.example.student_enrollment_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping ("/")
    public String showHomePage (Model model) {
        List<StudentEnrollmentSystem> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "index";
    }

    @GetMapping ("/add")
    public String showForm(Model model){
        model.addAttribute("student", new StudentEnrollmentSystem());
        return "add_student";
    }

    @PostMapping ("/save")
    public String saveStudent (@ModelAttribute ("student") StudentEnrollmentSystem student) {
        studentService.saveStudent(student);
        return "redirect:/";
    }
}
