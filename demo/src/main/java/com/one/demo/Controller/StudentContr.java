package com.one.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.one.demo.WhatINeed.Student;
import com.one.demo.WhatINeed.StudentServ;
import com.one.demo.config.UserInfoStatus;
import com.one.demo.valiation.CustomValidator;

@Controller
public class StudentContr {

    @Autowired
    StudentServ studentServ;
    @Autowired
    CustomValidator customValidator;
    @Autowired
    ExceptionContr exceptionContr;
    @Autowired
    UserInfoStatus uInfoStatus;

    @GetMapping("/Student")
    public String getStudent(ModelMap modelMap) {
        modelMap.addAttribute("Students", studentServ.reaStudents());
        modelMap.addAttribute("UserName", uInfoStatus.getLoggedName());
        System.out.println(uInfoStatus.isUserLoggedIn());
        return "/Student";
    }

    @GetMapping("/add")
    public String addStudent(ModelMap modelMap) {
        // throw new RuntimeException("test");
        return "/addStudent";
    }

    @PostMapping("/add")
    public String addToStudent(ModelMap modelMap,
            @RequestParam String name, @RequestParam String phoneNumber,
            @RequestParam String emailAddress, @RequestParam String description,
            @RequestParam boolean isActive, Student student) {
        if (!customValidator.checkNameLength(student.getName())) {
            modelMap.addAttribute("errorN", "name les than 3 letters");
            return "/addStudent";
        }
        modelMap.clear();

        studentServ.addStudent(name, description, phoneNumber, emailAddress, isActive);

        return "redirect:" + "/Student";

    }

    @GetMapping("/Del")
    public String deleteStudent(ModelMap modelMap,
            @RequestParam int id) {
        modelMap.clear();

        studentServ.deleteStudent(id);
        modelMap.clear();
        return "redirect:" + "/Student";
    }

    @GetMapping("/edit")
    public String editStudent(ModelMap modelMap, Student student,
            @RequestParam int id) {
        modelMap.addAttribute("student", studentServ.inf(id));

        return "/edit";

    }

    @PostMapping("/update")
    public String updateStudent(ModelMap modelMap, Student student,
            @RequestParam boolean isActive) {
        studentServ.editeStudent(student.getId(),
                student.getName(),
                student.getDescription(),
                student.getPhoneNumber(),
                student.getEmailAddress(),
                isActive);
        return "redirect:" + "/Student";

    }

}