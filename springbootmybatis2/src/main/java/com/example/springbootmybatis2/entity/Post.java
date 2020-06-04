package com.example.springbootmybatis2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private Long id;
    private String userId;
    private String contents;
    private Date createdAt;
}
