package springboot_mybatis.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot_mybatis.domain.User;
import springboot_mybatis.mapper.UserMapper;

import java.util.List;

@Controller
public class MybatisController {

    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/hello")
    @ResponseBody
    public List<User> queryUserList(){

        List<User> users=userMapper.queryUserList();
        return users;
    }

}
