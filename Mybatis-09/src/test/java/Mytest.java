import com.yyy.dao.UserMapper;
import com.yyy.pojo.User;
import com.yyy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytest {
    @Test
    public void mytest(){
        SqlSession sqlSessoion = MybatisUtils.getSqlSessoion();
        UserMapper mapper = sqlSessoion.getMapper(UserMapper.class);
        List<User> users = mapper.queryUserById(1);
        List<User> users2 = mapper.queryUserById(1);
        System.out.println(users);
        System.out.println("==========");
        System.out.println(users2);
        System.out.println(users==users2);
        sqlSessoion.close();
    }
}
