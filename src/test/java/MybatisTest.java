import com.wf.dao.EmployeeMapper;
import com.wf.dao.LoginMapper;
import com.wf.pojo.Employee;
import com.wf.pojo.Login;
import com.wf.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

/**
 * @author wf
 * @create 2022-02-15 20:54
 */
public class MybatisTest {
    @Test
    public void test() throws IOException {


        // 通过SqlSessionFactory创建SqlSession
        SqlSession openSession = mybatisUtils.getSqlSession();
        LoginMapper mapper = openSession.getMapper(LoginMapper.class);
        Login wf = mapper.selectBy("wf");
        System.out.println(wf);
        System.out.println(mapper.getClass());
    }
}
