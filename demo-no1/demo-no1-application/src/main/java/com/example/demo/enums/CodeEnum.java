

package com.example.demo.enums;

import java.util.ArrayList;
import java.util.List;

public enum CodeEnum implements CommonResponseEnum {
    SUCCESS(0, "成功"),
    UNAUTHORIZED(401, "未认证"),
    FORBIDDEN(403, "权限不足"),
    SERVICE_UNAVAILABILITY(1000, "服务不可用"),
    PARAMETER_CHECK_FAIL(2000, "参数校验失败"),
    BUSINESS_FAIL(4000, "业务处理失败"),
    TRANSACTION_NOT_EXIST(4001, "交易不存在"),
    REQUEST_METHOD_NOT_SUPPORTED(4005, "不合法的请求方法"),
    NO_HANDLER_FOUND(4004, "请求资源不存在"),
    JSON_PARSE_ERROR(4009, "不合法的请求JSON格式"),
    MISSING_PATH_VARIABLE(4006, "缺少请求URL路径参数"),
    MISSING_REQUEST_PARAMETER(4007, "缺少请求query参数"),
    MEDIA_TYPE_NOT_SUPPORTED(4008, "不合法的请求Content-Type"),
    METHOD_ARGUMENT_TYPE_MIS_MATCH(45003, "不合法的请求参数类型"),
    ERROR(5000, "系统内部异常");

    private final int code;
    private final String message;

    private CodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public int code() {
        return this.code;
    }

    @Override
    public String message() {
        return this.message;
    }

    public static CodeEnum getByCode(int code) {
        CodeEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            CodeEnum _enum = var1[var3];
            if (_enum.getCode() == code) {
                return _enum;
            }
        }

        return null;
    }

    public List<CodeEnum> getAllEnum() {
        List<CodeEnum> list = new ArrayList();
        CodeEnum[] var2 = values();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            CodeEnum _enum = var2[var4];
            list.add(_enum);
        }

        return list;
    }

    public List<Integer> getAllEnumCode() {
        List<Integer> list = new ArrayList();
        CodeEnum[] var2 = values();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            CodeEnum _enum = var2[var4];
            list.add(_enum.code());
        }

        return list;
    }
}
