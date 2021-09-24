package com.example.demo.srevice.model.condition;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;


/**
 * @author dataofx
 */
@Data
@ApiModel
public class DynamicSearchStudentExportCondition implements Serializable {
    private static final long serialVersionUID = 5952285313729332860L;

    @ApiModelProperty(value = "导出属性")
    @NotEmpty(message = "导出属性不能为空")
    private List<String> exportProperty;

    @ApiModelProperty(hidden = true)
    private List<String> tableColumns;

    @ApiModelProperty("导出类型;0:excel;1:dbf")
    private int fileType = 0;

}