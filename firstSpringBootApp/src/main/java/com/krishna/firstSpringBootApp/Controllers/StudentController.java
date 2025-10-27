package com.krishna.firstSpringBootApp.Controllers;

import com.krishna.firstSpringBootApp.Entities.Student;
import com.krishna.firstSpringBootApp.Services.StudentService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/")
    public List<Student> getAllStudent() {
        return service.getAllStudent();
    }

    @PostMapping("/")
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @GetMapping("/{roll}")
    public Student getStudentById(@PathVariable Long roll) {
        return service.getStudentById(roll);
    }

    @DeleteMapping("/")
    public boolean deleteStudentById(Long roll) {
        return service.deleteStudentById(roll);
    }

    @PutMapping("/{id}")
    public boolean updateStudent(@RequestBody Student student, @PathVariable Long roll) {
        return service.updateStudent(roll, student);
    }
}
