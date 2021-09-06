package com.example.demo.entity;

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
@Accessors(chain = true)
@ApiModel
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1903236519513043621L;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("性别")
    private Number sex;

    @ApiModelProperty("日期")
    private Date date;

}
