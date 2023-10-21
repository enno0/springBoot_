package com.one.demo.WhatINeed;

import java.util.ArrayList;

import java.util.Iterator;

import org.springframework.stereotype.Service;

@Service
public class StudentServ {
    private static int studentNumber = 4;
    public static ArrayList<Student> stu = new ArrayList<Student>();
    static {
        stu.add(new Student(1, "kamal1", "null1", "10000000000001", "email@email.com1", true));
        stu.add(new Student(2, "kamal2", "null2", "10000000000002", "email@email.com2", true));
        stu.add(new Student(3, "kamal3", "null3", "10000000000003", "email@email.com3", true));
        stu.add(new Student(4, "kamal4", "null4", "10000000000004", "email@email.com4", true));
        System.out.println("done");
        // System.out.println(stu);
    }

    public ArrayList<Student> reaStudents() {
        ArrayList<Student> stu1List = new ArrayList<Student>();
        for (Student qq : stu) {

            stu1List.add(qq);

        }
        return stu1List;

    }

    public void addStudent(int id, String name, String description, String phoneNumber, String emailAddres,
            boolean isActive) {
        stu.add(new Student(0, name, description, phoneNumber, emailAddres, isActive));
    }

    public void deleteStudent(int id) {
        Iterator<Student> iterator = stu.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
            }
        }
    }

    public void addStudent(String name, String description, String phoneNumber, String emailAddres, boolean isActive) {
        stu.add(new Student(++studentNumber, name, description, phoneNumber, emailAddres, isActive));
    }

    public Student inf(int id) {
        for (Student student : stu) {
            if (student.getId() == id) {
                return student;
            }

        }
        return null;
    }

    public void editeStudent(int id, String name, String description, String phoneNumber, String emailAddres,
            boolean isActive) {
        Iterator<Student> iterator = stu.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                student.setId(id);
                student.setName(name);
                student.setDescription(description);
                student.setPhoneNumber(phoneNumber);
                student.setEmailAddress(emailAddres);
                student.setActive(isActive);
            }
        }
    }
}