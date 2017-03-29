package com.neusoft.api;


import com.neusoft.member.service.UserSevice;
import com.neusoft.member.vo.UserVo;
import com.neusoft.model.LoginReq;
import com.neusoft.model.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * Created by zhangcheng on 2017/3/24.
 */
@RestController
@Slf4j
@Api(tags = "会员登录接口")
@RequestMapping(value = "")
public class LoginService {

    @Autowired
    UserSevice userSevice ;

    @ApiOperation(value = "登录" )
    @PostMapping(value = "/login")
    public ResultData<UserVo> login(@Valid @RequestBody LoginReq param, @RequestHeader HttpHeaders headers, HttpServletResponse httpServletResponse)throws Exception{
        System.out.println("iiiiiiiiiiiiiiiiiiiiiiii=" + param);
        return null;
    }

    @ApiOperation(value = "登出" )
    @PostMapping(value = "/logout")
    public ResultData<UserVo> logout(@Valid @RequestBody LoginReq param,  @RequestHeader HttpHeaders headers, HttpServletResponse httpServletResponse)throws Exception{
        return null;
    }

}
