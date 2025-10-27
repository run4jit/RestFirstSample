package com.krishna.firstSpringBootApp.Repositories;

import com.krishna.firstSpringBootApp.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
