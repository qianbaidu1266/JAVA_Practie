package springboot_mybatis;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot_mybatis.domain.User;
import springboot_mybatis.mapper.UserMapper;

import java.util.List;



@SpringBootTest(classes = SpringbootMybatisApplication.class)

public class MybatisTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<User> users=userMapper.queryUserList();
        System.out.println(users);
    }


}
