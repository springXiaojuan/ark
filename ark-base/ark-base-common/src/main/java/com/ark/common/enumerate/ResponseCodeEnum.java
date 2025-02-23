package com.ark.common.enumerate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCodeEnum {
    OK(0, "成功"),

    PHONE_PASSWORD_AUTH_FAIL(401, "用户名手机号认证失败"),

    ATTRIBUTE_INVAILD(1, "属性值不合法"),
    SERVICE_RULE_NO_ALLOWED(2, "业务校验失败"),
    SERVER_ERROR(3, "系统错误");

    private Integer errCode;
    private String msg;
}
