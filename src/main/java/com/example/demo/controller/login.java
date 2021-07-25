package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class login {

    @GetMapping("/login")

    public String login() throws IOException {

            return "success";



    }



}
