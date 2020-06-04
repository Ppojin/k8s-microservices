package com.example.sptingbootmybatis.service;

import com.example.sptingbootmybatis.client.PostClient;
import com.example.sptingbootmybatis.entity.Post;
import com.example.sptingbootmybatis.entity.User;
import com.example.sptingbootmybatis.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    UserMapper mapper;
    PostClient client;

    @Autowired
    public UserService(UserMapper mapper, PostClient client) {
        this.mapper = mapper;
        this.client = client;
    }

    public User getUserById(String id) {
//        ResponseEntity<List<AlbumResponseModel>> albumsListResponse =
//                restTemplate.exchange(albumUrl, HttpMethod.GET, null,
//                     new ParameterizedTypeReference<List<AlbumResponseModel>>() {});
//
//        List<AlbumResponseModel> albumsList = albumsListResponse.getBody();

        List<Post> posts = client.getPosts(id);

        User user = mapper.selectUserById(id);
        user.setPosts(posts);

        return user;
    }

    public void createUser(User user) {
        mapper.insertUser(user);
    }
}
