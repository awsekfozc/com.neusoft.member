package com.neusoft.member.service.impl;

import com.neusoft.member.service.UserSevice;
import com.neusoft.member.service.model.LoginResponse;
import com.neusoft.member.vo.UserVo;
import org.springframework.stereotype.Service;

/**
 * Created by zhengcheng on 2017/3/24.
 */
@Service
public class UserServiceImpl implements UserSevice {
    @Override
    public LoginResponse login(UserVo vo){
        return null;
    }

    @Override
    public LoginResponse logout(UserVo vo) {
        return null;
    }

    @Override
    public boolean addUser(UserVo vo) {
        return false;
    }
}
