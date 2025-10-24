package com.krishna.firstSpringBootApp.Services;

import com.krishna.firstSpringBootApp.Entities.Student;
import com.krishna.firstSpringBootApp.Repositories.StudentRepo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StudentService {
    @Autowired
    private StudentRepo repo;

    public List<Student> getAllStudent() {
        return repo.getAllStudents();
    }

    public List<Student> getStudentById(int roll) {
        return repo.getStudentById(roll);
    }

    public boolean deleteStudentById(int roll) {
        return repo.deleteStudentById(roll);
    }

    public Student addStudent(Student student) {
        repo.addStudent(student);
        return student;
    }

    public boolean updateStudent(int roll, Student student) {
        return repo.updateStudentById(roll, student);
    }
}
