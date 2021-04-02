package com.example.test;

import com.example.test.bean.UserBean;
import com.example.test.service.UserService;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.Runwith;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Autowired
    UserService userService;
    @Test
    public void contextLoads() {
        UserBean userBean=userService.loginIn("a","123");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

}
