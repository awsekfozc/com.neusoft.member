package com.neusoft.api;



import com.neusoft.member.service.UserSevice;
import com.neusoft.member.vo.UserVo;
import com.neusoft.model.AddUserReq;
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
@Api(tags = "会员操作接口")
@RequestMapping(value = "/main/user")
public class OperUserService {

    @Autowired
    UserSevice userSevice ;

    @ApiOperation(value = "新增用户" )
    @PostMapping(value = "/addUser")
    public ResultData<UserVo> addUser(@Valid @RequestBody AddUserReq param, @RequestHeader HttpHeaders headers, HttpServletResponse httpServletResponse)throws Exception{
        return null;
    }

    @ApiOperation(value = "修改用户" )
    @PostMapping(value = "/editUser")
    public ResultData<UserVo> editUser(@Valid @RequestBody LoginReq param, @RequestHeader HttpHeaders headers, HttpServletResponse httpServletResponse)throws Exception{
        return null;
    }
}
