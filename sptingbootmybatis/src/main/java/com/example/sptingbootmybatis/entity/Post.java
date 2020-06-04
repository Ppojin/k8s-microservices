package com.example.sptingbootmybatis.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Post {
    private Long id;
    private String userId;
    private String contents;
    private Date createdAt;
}
