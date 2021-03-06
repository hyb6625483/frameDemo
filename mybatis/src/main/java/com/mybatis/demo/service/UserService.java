package com.mybatis.demo.service;

import com.mybatis.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserListByExample(String loginName);

    User getUserByExample(Integer userId);
}
