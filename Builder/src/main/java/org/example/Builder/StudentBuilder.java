package org.example.Builder;

import org.example.Student.Student;

public class StudentBuilder {
    public String name;
    public int rollnumber;
    public int age;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setRollnumber(int rn) {
        this.rollnumber = rn;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
