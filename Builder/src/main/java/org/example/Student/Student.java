package org.example.Student;

import org.example.Builder.StudentBuilder;

public class Student {
    private String name;
    private int rollnumber;
    private int age;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.rollnumber = studentBuilder.rollnumber;
        this.age = studentBuilder.age;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public void display() {
        System.out.println("Name is "+name+"age is "+age+"rollnumber is "+rollnumber);
    }
}
