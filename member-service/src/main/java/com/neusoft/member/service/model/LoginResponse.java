package com.neusoft.member.service.model;

import lombok.Data;

/**
 * Created by zhengcheng on 2017/3/24.
 * 登录响应消息体
 */
@Data
public class LoginResponse {

    private Integer id;
    private String account;
    private String token;
    private String realName;
    private String phone;
    private Integer superAdmin;

}
