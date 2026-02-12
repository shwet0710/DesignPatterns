package org.example;

import org.example.Student.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = Student.builder().setName("shwet").setAge(25).setRollnumber(62).build();
        student.display();
    }
}