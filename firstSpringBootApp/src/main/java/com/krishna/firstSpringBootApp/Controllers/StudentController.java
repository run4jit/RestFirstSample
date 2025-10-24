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
        service.addStudent(student);
        return student;
    }

    @GetMapping("/{roll}")
    public Student getStudentById(@PathVariable int roll) {
        List<Student> students = service.getStudentById(roll);
        if (students != null && students.isEmpty()) {
            return students.get(0);
        }
        return null;
    }

    @DeleteMapping("/")
    public boolean deleteStudentById(int roll) {
        return service.deleteStudentById(roll);
    }

    @PutMapping("/{id}")
    public boolean updateStudent(@RequestBody Student student, @PathVariable int roll) {
        return service.updateStudent(roll, student);
    }
}
