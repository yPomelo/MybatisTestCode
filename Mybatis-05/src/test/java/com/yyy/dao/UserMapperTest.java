package com.yyy.dao;

import com.yyy.pojo.User;
import com.yyy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class UserMapperTest {
    @Test
    public void test(){
//        第一步，获取sqlSession对象
        SqlSession sqlSessoion = MybatisUtils.getSqlSessoion();
//        方式一 getMapper
        UserMapper userMapper = sqlSessoion.getMapper(UserMapper.class);
        List<User> users = userMapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSessoion.close();
    }
    @Test
    public void getUserByIdTest(){
        SqlSession sqlSessoion = MybatisUtils.getSqlSessoion();
        UserMapper mapper = sqlSessoion.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1,"yyy");
        System.out.println(userById);
    }
    @Test
    public void addUserTest(){
        SqlSession sqlSessoion = MybatisUtils.getSqlSessoion();
        UserMapper mapper = sqlSessoion.getMapper(UserMapper.class);
        for (int i = 6; i <11 ; i++) {
            int addUser = mapper.addUser(new User(i, "yyy"+i, "123333"));
        }
    }
    @Test
    public void updateUserTest(){
        SqlSession sqlSessoion = MybatisUtils.getSqlSessoion();
        UserMapper mapper = sqlSessoion.getMapper(UserMapper.class);
        int i = mapper.updateUser(new User(3, "lb","123456"));
    }
    @Test
    public void deleteUserTest(){
        SqlSession sqlSessoion = MybatisUtils.getSqlSessoion();
        UserMapper mapper = sqlSessoion.getMapper(UserMapper.class);
        int i = mapper.deleteUser(10);
    }

}
