package com.example.springbootmybatis2.service;

import com.example.springbootmybatis2.entity.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> getPostsByUserId(String id) {
        return Arrays.asList(new Post(101L, "user1", "Post title1", new Date()),
                new Post(102L, "user1", "Post title2", new Date()),
                new Post(103L, "user1", "Post title3", new Date()));

    }
}
