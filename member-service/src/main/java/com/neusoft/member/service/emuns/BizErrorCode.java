package com.neusoft.member.service.emuns;


/**
 * Created by zhengcheng on 2017/3/24.
 */
public enum BizErrorCode {

    SUCCESS("0000","请求成功"),
    UNKNOWN_EXCEPTION("9999","系统未知错误"),
    REQUEST_PARAM_ILLEGAL("0001","请求参数非法"),
    REQUEST_SIGNED_INVALID("0002","验签异常"),
    NOT_LOGIN("1000","无token信息"),
	LOGIN_INVALID("1001","token信息过期，登录失败"),
	LOGIN_ILLEGAL("1002","token信息不合法，登录失败"),
	NOT_ACCOUNT("1003","账号不存在，登录失败"),
	PASSWORD_INVALID("1004","帐号密码不一致，登录失败"),
	PHONE_ILLEGAL("1005","手机号码非法"),
	NO_PERMISSION("1006","用户无该权限");


    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    /** 操作代码 */
    private final String code;

    /** 描述 */
    private final String msg;

    private BizErrorCode(String code, String msg){
        this.code = code;
        this.msg = msg;
    }


    /**
     * 通过枚举<code>code</code>获得枚举
     *
     * @param code
     * @return
     */
    public static BizErrorCode getByCode(String code) {
        for (BizErrorCode status : values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;
    }
}
