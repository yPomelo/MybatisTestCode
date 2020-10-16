package com.yyy.dao;

import com.yyy.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User getUserByID(int id);
    List<User> getUserByLimit(Map<String,Integer> map);
}
