package com.example.demo.controller;

import com.example.demo.config.CodecUtil;
import com.example.demo.entity.UserEntity;
import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFWriter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shengwanping
 * @Filename User
 * @description
 * @Version 1.0
 * @History <li>Author: shengwanping</li>
 * <li>Date: 2021/7/29 15:46</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RestController
@RequestMapping(value = "/api/v2/user", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = "用户管理")
public class User {

    @GetMapping
    public void getDbf(HttpServletResponse response) {
        // haaaaaaaaaaaaaaaa
        String fileName = "表名.dbf";
        response.setContentType("application/x-dbf");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + CodecUtil.encode(fileName));
        try {
            // 定义DBF文件字段
            DBFField[] fields = new DBFField[3];
            // 分别定义各个字段信息，setFieldName和setName作用相同,
            // 只是setFieldName已经不建议使用
            fields[0] = new DBFField();
            // fields[0].setFieldName("emp_code");
            fields[0].setName("ch_name");
            fields[0].setDataType(DBFField.FIELD_TYPE_C);
            fields[0].setFieldLength(10);
            fields[1] = new DBFField();
            // fields[1].setFieldName("emp_name");
            fields[1].setName("en_name");
            fields[1].setDataType(DBFField.FIELD_TYPE_C);
            fields[1].setFieldLength(20);
            fields[2] = new DBFField();
            // fields[2].setFieldName("salary");
            fields[2].setName("salary");
            fields[2].setDataType(DBFField.FIELD_TYPE_N);
            fields[2].setFieldLength(12);
            fields[2].setDecimalCount(2);
            // 定义DBFWriter实例用来写DBF文件
            DBFWriter writer = new DBFWriter(response.getOutputStream());
            // 把字段信息写入DBFWriter实例，即定义表结构
            writer.setFields(fields);
            // 一条条的写入记录
            for(int i = 0;i < 10000000;i ++){
                Object[] rowData = new Object[3];
                rowData[0] = "小万";
                rowData[1] = "XiaoWan";
                rowData[2] = new Double(5000.00);
                writer.addRecord(rowData);
            }
            // 写入数据
            writer.write();

            if(writer != null){
                writer.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
