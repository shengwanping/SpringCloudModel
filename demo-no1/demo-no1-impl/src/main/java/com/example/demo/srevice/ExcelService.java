package com.example.demo.srevice;


import com.example.demo.model.condition.DynamicSearchStudentExportCondition;
import com.example.demo.model.dto.DynamicDataExportDTO;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author shengwanping
 * @Filename ExcelService
 * @description
 * @Version 1.0
 * @History <li>Author: shengwanping</li>
 * <li>Date: 2021/8/3 18:43</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Validated
public interface ExcelService {

    DynamicDataExportDTO exportDynamicByCondition(@Valid DynamicSearchStudentExportCondition condition);
}
