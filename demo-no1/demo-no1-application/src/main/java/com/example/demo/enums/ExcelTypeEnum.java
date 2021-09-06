package com.example.demo.enums;

public enum ExcelTypeEnum {
    EXCEL(0),
    DBF(1);

    int value;

    public int value() {
        return this.value;
    }

    private ExcelTypeEnum(int value) {
        this.value = value;
    }
}
