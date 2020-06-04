package com.example.sptingbootmybatis.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String id;
    private String name;
    private String pwd;

    private List<Post> posts;
}
