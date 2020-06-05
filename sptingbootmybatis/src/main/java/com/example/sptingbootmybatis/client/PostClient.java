package com.example.sptingbootmybatis.client;

import com.example.sptingbootmybatis.entity.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient(url="http://rest-post-app-service:8082", name="rest-post-app-service")
public interface PostClient {

    @GetMapping("/posts/{id}")
    List<Post> getPosts(@PathVariable String id);

}
