package com.codeup.speak;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String allPosts() {
        return "Now showing all posts";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String viewPost(@PathVariable int id) {
        return "now showing post with id " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPostForm() {
        return "Please enter the details of your post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "created your really cool post";
    }
}
