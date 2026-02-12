package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student(25,"shwet");
        Student student1 = (Student) student.clone();
        student1.setName("ss");
        student1.setAge(23);
        student.display();
        student1.display();
    }
}