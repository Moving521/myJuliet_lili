package com.neo;

import com.neo.service.user.UserInfoServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by MrSpin on 2017/8/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class BaseTest {

    @Autowired
    UserInfoServiceImpl userInfoService;//注入Simple

    @Test
    public void testGetName() {
        userInfoService.login("MrSpin","Moving521");
    }

}
