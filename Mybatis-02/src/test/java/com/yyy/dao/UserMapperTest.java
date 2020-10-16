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



}
