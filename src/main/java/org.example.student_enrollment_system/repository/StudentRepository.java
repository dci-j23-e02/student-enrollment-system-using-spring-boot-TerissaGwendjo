package org.example.student_enrollment_system.repository;

import org.example.student_enrollment_system.model.StudentEnrollmentSystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <StudentEnrollmentSystem, Long> {

}
