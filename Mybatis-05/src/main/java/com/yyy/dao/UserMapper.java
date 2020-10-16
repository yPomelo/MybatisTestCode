package com.yyy.dao;

import com.yyy.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();
    @Select("select * from user where id = #{id} and name = #{name}")
    User getUserById(@Param("id") int id,@Param("name") String name);
    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);
    @Update("update user set name = #{name} ,pwd = #{password} where id = #{id}")
    int updateUser(User user);
    @Delete("delete from user where id = #{id}")
    int deleteUser(int id);
}
