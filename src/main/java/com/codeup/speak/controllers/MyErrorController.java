package com.codeup.speak.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyErrorController implements ErrorController {

    @GetMapping("/error")
    @ResponseBody
    public String error() {
        return "Ut-oh. Something went wrong. Check your URL and try again.";
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
