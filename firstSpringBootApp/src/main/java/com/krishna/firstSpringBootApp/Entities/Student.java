package com.krishna.firstSpringBootApp.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Student {
    private String name;
    private int identityNumber;
    private String stream;
    private int marks;

    public Student(String name, String stream, int marks) {
        this.name = name;
        this.stream = stream;
        this.marks = marks;
        this.identityNumber = Math.round(1000.0f) + 1;
    }

    public void updateMe(Student that) {
        this.name = that.name;
        this.stream = that.stream;
        this.marks = that.marks;
    }
}
