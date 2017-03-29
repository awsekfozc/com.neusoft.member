package com.neusoft.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by zhengcheng on 2017/3/24.
 */
@Data
@ApiModel
public class AddUserReq {

	/**
	 * 帐号
	 */
	@NotBlank(message = "参数[account]不能为空")
	@ApiModelProperty(value = "用戶帐号", required = true)
	private String account;

	/**
	 * 密码
	 */
	@NotBlank(message = "参数[password]不能为空")
	@ApiModelProperty(value = "密码", required = true)
	private String password;

	/**
	 * 邮件
	 */
	@ApiModelProperty(value = "电子邮箱", required = false)
	private String email;

	/**
	 * 真实名字
	 */
	@ApiModelProperty(value = "真实名字", required = false)
	private String realName;

	/**
	 * 电话
	 */
	@ApiModelProperty(value = "电话", required = false)
	private String phone;

}
