package com.one.demo.WhatINeed;

public class Student {
    private int id;

    public Student() {
    }

    private String name;
    private String description;
    private String phoneNumber;
    private String emailAddress; // email
    private boolean isActive; // active state

    public Student(int i, String string, String string2, String string3, String string4, boolean b) {
        super();
        this.id = i;
        this.name = string;
        this.emailAddress = string4;
        this.isActive = b;
        this.description = string2;
        this.phoneNumber = string3;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id != other.id)
            return false;
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", description=" + description + ", phoneNumber=" + phoneNumber
                + ", emailAddress=" + emailAddress + ", isActive=" + isActive + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

}
