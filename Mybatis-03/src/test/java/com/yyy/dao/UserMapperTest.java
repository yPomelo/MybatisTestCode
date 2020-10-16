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
        User userByID = userMapper.getUserByID(1);
        System.out.println(userByID);
        sqlSessoion.close();
    }



}
