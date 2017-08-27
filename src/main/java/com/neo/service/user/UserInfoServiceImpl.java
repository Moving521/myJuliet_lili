package com.neo.service.user;

import org.springframework.stereotype.Service;

/**
 * Created by MrSpin on 2017/8/27.
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {


    @Override
    public void login(String userNo, String pwd) {
        System.out.println("用户编号 \t "+userNo+"\t  密码 \t "+pwd);
    }
}
