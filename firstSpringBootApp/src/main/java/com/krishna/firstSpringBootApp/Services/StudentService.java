package com.krishna.firstSpringBootApp.Services;

import com.krishna.firstSpringBootApp.Entities.Student;
import com.krishna.firstSpringBootApp.Repositories.StudentRepo;
import com.krishna.firstSpringBootApp.Repositories.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudent() {
        return repo.findAll();
    }

    public Student getStudentById(Long roll) {
        Optional<Student> std = repo.findById(roll);
        return std.orElse(null);
    }

    public boolean deleteStudentById(Long roll) {
        if (repo.findById(roll).isPresent()) {
            repo.deleteById(roll);
            return true;
        }
        return false;
    }

    public Student addStudent(Student student) {
            repo.save(student);
            return student;
    }

    public boolean updateStudent(Long roll, Student student) {
        Optional<Student> std = repo.findById(roll);
        if (std.isPresent() ) {
            Student student1 = std.get();
            student1.updateMe(student);
            repo.save(student1);
            return true;
        }
        return false;
    }
}