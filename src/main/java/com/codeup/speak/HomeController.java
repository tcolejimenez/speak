package com.codeup.speak;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String landing() {
        return "This is the landing page! Tres cool no?";
    }

    @GetMapping("/posts")
    @ResponseBody
    public String showPosts() {
        return "posts index page. look at all the posts";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String showPost() {
        return "Look at this one nice post!";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showCreatePost() {
        return "Wow. So Form. Much create.";
    }

    @PostMapping("posts/create")
    @ResponseBody
    public String createPost() {
        return "ya did it! new form confirmed";
    }
}
