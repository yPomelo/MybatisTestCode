package com.yyy.dao;

import com.yyy.pojo.User;
import com.yyy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class UserMapperTest {
    static Logger logger = Logger.getLogger(UserMapperTest.class);

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
    @Test
    public void log4jTest(){
        logger.info("---info进入Log4j---");
        logger.debug("---debug进入Log4j---");
        logger.error("---error进入Log4j---");
    }
    @Test
    public void getUserByLimitTest(){
        SqlSession sqlSessoion = MybatisUtils.getSqlSessoion();
        UserMapper mapper = sqlSessoion.getMapper(UserMapper.class);
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();
        stringIntegerHashMap.put("startIndex",1);
        stringIntegerHashMap.put("pageSize",2);
        List<User> userByLimit = mapper.getUserByLimit(stringIntegerHashMap);
        for (User user :
                userByLimit) {
            System.out.println(user);
        }
    }


}
