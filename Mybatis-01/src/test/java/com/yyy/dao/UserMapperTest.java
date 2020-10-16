package com.yyy.dao;

import com.yyy.pojo.User;
import com.yyy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test(){
//        第一步，获取sqlSession对象
        SqlSession sqlSessoion = MybatisUtils.getSqlSessoion();
//        方式一 getMapper
        UserMapper userMapper = sqlSessoion.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for (User user :
                userList) {
            System.out.println(user);
        }
        sqlSessoion.close();
    }
    @Test
    public void getUserByIDTest(){
        SqlSession sqlSessoion = MybatisUtils.getSqlSessoion();
//        相当于原来的new UserMapperImlp
        UserMapper mapper = sqlSessoion.getMapper(UserMapper.class);
        User userByID = mapper.getUserByID(1);
        System.out.println(userByID);
        sqlSessoion.close();
    }
    @Test
    public void InsertUserTest(){
        SqlSession sqlSessoion = MybatisUtils.getSqlSessoion();
        UserMapper mapper = sqlSessoion.getMapper(UserMapper.class);
        int insertUser = mapper.InsertUser(new User(4, "哥们4", "111111"));
        sqlSessoion.commit();
        System.out.println(insertUser);
        sqlSessoion.close();
    }
    @Test
    public void UpdateUserTest(){
        SqlSession sqlSessoion = MybatisUtils.getSqlSessoion();
        UserMapper mapper = sqlSessoion.getMapper(UserMapper.class);
        int updateUser = mapper.UpdateUser(new User(4, "gemen4", "000000"));
        sqlSessoion.commit();
        System.out.println(updateUser);
        sqlSessoion.close();

    }
    @Test
    public void DeleteUserTest(){
        SqlSession sqlSessoion = MybatisUtils.getSqlSessoion();
        UserMapper mapper = sqlSessoion.getMapper(UserMapper.class);
        int deleteUser = mapper.DeleteUser(4);
        sqlSessoion.commit();
        System.out.println(deleteUser);
        sqlSessoion.close();

    }
    @Test
    public void getUserLikeTest(){
        SqlSession sqlSessoion = MybatisUtils.getSqlSessoion();
        UserMapper mapper = sqlSessoion.getMapper(UserMapper.class);
        List<User> userLike = mapper.getUserLike("'%yyy%'");
        for (User user :
                userLike) {
            System.out.println(user);
        }
        sqlSessoion.close();

    }

}
