package com.example.demo.srevice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DynamicDataExportDTO {

    private List<List<String>> head;

    private List<List<String>> data;

    private Map<Integer, Integer> columnWidthMap;

    public DynamicDataExportDTO(List<List<String>> head, List<List<String>> data) {
        this.head = head;
        this.data = data;
    }

}