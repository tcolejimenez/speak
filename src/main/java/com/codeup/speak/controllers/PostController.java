package com.codeup.speak.controllers;

import com.codeup.speak.models.Post;
import com.codeup.speak.services.PostService;
import com.codeup.speak.services.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final PostService postService;
    private final UserRepository userRepo;

    public PostController(PostService postService, UserRepository userRepo) {
        this.postService = postService;
        this.userRepo = userRepo;
    }

    //show all posts
    @GetMapping("/posts")
    public String allPosts(Model m) {
        m.addAttribute("posts", postService.findAll());
        return "posts/index";
    }

    //show individual post
    @GetMapping("/posts/{id}")
    public String viewPost(@PathVariable int id, Model m) {
        Post post = postService.findOne(id);
        post.setAuthor(userRepo.findById(1L).get());
        m.addAttribute("post", post);
        return "posts/show";
    }

    //create post methods
    @GetMapping("/posts/create")
    public String showCreateForm(Model m) {
        m.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post) {
        postService.save(post);
        return "redirect:/posts";
    }

    //edit post methods
    @GetMapping("/posts/{id}/edit")
    public String showEditForm(Model m, @PathVariable long id) {
        m.addAttribute("post", postService.findOne(id));
        return "/posts/create";
    }

}
