package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author shengwanping
 * @Filename UserEntity
 * @description
 * @Version 1.0
 * @History <li>Author: shengwanping</li>
 * <li>Date: 2021/7/29 19:01</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
@ApiModel
@TableName(value = "user") //mybatis-plus注解
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1903236519513043621L;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

}
