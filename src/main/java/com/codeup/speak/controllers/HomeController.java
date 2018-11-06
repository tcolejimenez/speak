package com.codeup.speak.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String landing() {
        return "This is the landing page! Tres cool no?";
    }

    @GetMapping("/home")
    public String welcome() {
        return "home";
    }

}
