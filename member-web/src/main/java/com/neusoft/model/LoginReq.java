package com.neusoft.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by zhengcheng on 2017/3/24.
 * 登录请求体
 */
@Data
public class LoginReq {
    @ApiModelProperty("帐号")
    String account;
    @ApiModelProperty("密码")
    String password;
}
