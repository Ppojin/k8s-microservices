package com.example.sptingbootmybatis.repository;

import com.example.sptingbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User selectUserById(String id);

    void insertUser(User user);
}
