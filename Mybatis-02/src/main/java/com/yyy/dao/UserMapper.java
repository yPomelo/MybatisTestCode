package com.yyy.dao;

import com.yyy.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    User getUserByID(int id);
    int InsertUser(User user);
    int UpdateUser(User user);
    int DeleteUser(int id);
}
