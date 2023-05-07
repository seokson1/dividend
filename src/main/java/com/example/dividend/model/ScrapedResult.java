package com.example.dividend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor //data 포함되지 안흠. 모든 필드를 초기화하는 생성자 만듬
public class ScrapedResult {
    private Company company;
    private List<Dividend> dividends;
    public ScrapedResult() {
        this.dividends = new ArrayList<>();
    }
}
