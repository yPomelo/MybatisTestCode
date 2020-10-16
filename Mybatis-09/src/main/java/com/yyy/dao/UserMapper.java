package com.yyy.dao;

import com.yyy.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> queryUserById(@Param("id")int id);

}
