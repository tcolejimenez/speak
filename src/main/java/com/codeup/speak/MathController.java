package com.codeup.speak;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{a}/and/{b}")
    @ResponseBody
    public String add(@PathVariable int a,@PathVariable int b) {
        String template = "The sum of %d and %d is %d";
        return String.format(template, a, b, a+b);
    }

    @GetMapping("/subtract/{a}/from/{b}")
    @ResponseBody
    public String subtract(@PathVariable int a, @PathVariable int b) {
        String template = "The result of %d subtracted from %d is %d";
        return String.format(template, a, b, b-a);
    }

    @GetMapping("/multiply/{a}/by/{b}")
    @ResponseBody
    public String multiply(@PathVariable int a, @PathVariable int b) {
        String template = "The result of %d by %d is %d";
        return String.format(template, a, b, a*b);
    }

    @GetMapping("/divide/{a}/by/{b}")
    @ResponseBody
    public String divide(@PathVariable int a, @PathVariable int b) {
        String template = "The quotient of %d divided by %d is %d";
        return String.format(template, a, b, a / b);
    }
}
