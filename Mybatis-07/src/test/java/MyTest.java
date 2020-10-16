import com.yyy.dao.StudentMapper;
import com.yyy.dao.TeacherMapper;
import com.yyy.pojo.Student;
import com.yyy.pojo.Teacher;
import com.yyy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void MyTest() {
        SqlSession sqlSessoion = MybatisUtils.getSqlSessoion();
        TeacherMapper mapper = sqlSessoion.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSessoion.close();
    }
}
