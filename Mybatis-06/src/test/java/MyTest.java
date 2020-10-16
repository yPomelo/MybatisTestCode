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
        StudentMapper mapper = sqlSessoion.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent2();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSessoion.close();
    }
}
