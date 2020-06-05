package com.example.springbootmybatis2.controller;

import com.example.springbootmybatis2.entity.Post;
import com.example.springbootmybatis2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostService service;

    @GetMapping(value = "/posts/{id}")
    public List<Post> getUser(@PathVariable String id) {
        List<Post> posts = service.getPostsByUserId(id);

        return posts;
    }
}
