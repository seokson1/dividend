package com.example.dividend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // 겟터, 셋터, 투 스트링 등 포함하는 어노테이센
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    private String ticker;
    private String name;

}
