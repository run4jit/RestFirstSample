package com.krishna.firstSpringBootApp.Repositories;

import com.krishna.firstSpringBootApp.Entities.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private List<Student> students = new ArrayList<>();

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public List<Student> getStudentById(int rollNumber) {
        return students
                .stream()
                .filter(student -> student.getIdentityNumber() == rollNumber)
                .toList();
    }

    public boolean deleteStudentById(int id) {
        List<Student> delStudent = students
                .stream()
                .filter(student -> student.getIdentityNumber() == id)
                .toList();
        if (delStudent!= null && !delStudent.isEmpty()) {
            students.remove(delStudent.indexOf(0));
            return true;
        }
        return false;
    }

    public boolean updateStudentById(int id, Student student) {
        List<Student> stds = students
                .stream()
                .filter(s -> s.getIdentityNumber() == id)
                .toList();
        if (stds != null && !stds.isEmpty()) {
            stds.get(0).updateMe(student);
            return true;
        }
        return false;
    }
}
