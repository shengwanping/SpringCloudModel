package com.example.demo.srevice.impl;

import com.example.demo.model.condition.DynamicSearchStudentExportCondition;
import com.example.demo.model.dto.DynamicDataExportDTO;
import com.example.demo.srevice.ExcelService;
import org.springframework.stereotype.Service;

/**
 * @author shengwanping
 * @Filename test1
 * @description
 * @Version 1.0
 * @History <li>Author: shengwanping</li>
 * <li>Date: 2021/8/26 17:36</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Service("excelService")
public class test1 implements ExcelService {
    @Override
    public DynamicDataExportDTO exportDynamicByCondition(DynamicSearchStudentExportCondition condition) {
        return null;
    }
}
