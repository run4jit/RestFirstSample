package com.krishna.firstSpringBootApp.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long identityNumber;
    private String name;
    private String stream;
    private int marks;

    public Student(String name, String stream, int marks) {
        this.name = name;
        this.stream = stream;
        this.marks = marks;
    }

    public void updateMe(Student that) {
        this.name = (that.name != null || !that.name.isBlank())  ? that.name : this.name;
        this.stream = (that.stream != null || !that.stream.isBlank())  ? that.stream : this.stream;;
        this.marks = !(that.marks < 1)  ? that.marks : this.marks;
    }
}
