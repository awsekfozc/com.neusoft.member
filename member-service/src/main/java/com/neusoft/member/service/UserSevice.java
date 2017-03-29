package com.neusoft.member.service;

import com.neusoft.member.service.model.LoginResponse;
import com.neusoft.member.vo.UserVo;

/**
 * Created by zhengcheng on 2017/3/24.
 */
public interface UserSevice {

    LoginResponse login(UserVo vo)  ;

    LoginResponse logout(UserVo vo) ;

    public boolean addUser(UserVo vo);

}
