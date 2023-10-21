package com.one.demo.WhatINeed;

import org.springframework.stereotype.Service;

@Service
public class CheckValidateUser {
    public boolean CheckValidateUser1(String name, String password) {
        if (name.equals("kamal123") && password.equals("123123")) {
            return true;
        } else {
            return false;
        }
    }

}
