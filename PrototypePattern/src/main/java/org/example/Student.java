package org.example;

public class Student implements StudentPrototype {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public StudentPrototype clone() {
        return new Student(age, name);
    }

    public void display() {
        System.out.println("name "+name+" age "+age);
    }
}
