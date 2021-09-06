package com.example.demo.enums;

public enum ExcelResponseEnum implements CommonResponseEnum {
    DYNAMIC_EXPORT_COLUMN_ERROR(300001, "动态导出字段错误"),
    DYNAMIC_EXPORT_COLUMN_READ_ERROR(300002, "动态导出字段读取错误"),
    GET_EXCEL_HEAD_ERROR(300003, "获取excel表头失败"),
    EXCEL_DO_WRITE_PROPERTY_ERROR(300004, "excel导出参数错误"),
    EXCEL_DO_READ_PROPERTY_ERROR(300005, "excel导入参数错误");

    private int code;
    private String message;

    private ExcelResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }
}