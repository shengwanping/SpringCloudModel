package com.example.demo.model.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel
public class ExcelDynamicExportConfigDTO {

    private Long id;

    private String property;

    private String basicInfo;

    private String code;

    private Integer columnWidth;

    private String tableColumn;

    private String defaultProperty;

}