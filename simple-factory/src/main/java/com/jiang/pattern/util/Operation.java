package com.jiang.pattern.util;

import lombok.Data;

/**
 * @description: 运算类，所有的具体的运算都继承该类
 * @author: Mr.Jiang
 * @date: 2020/12/10 11:13
 * @version: 1.0
 **/

@Data
public class Operation {

    private Double number1;
    private Double number2;

    public Double getResult(){
        return 0D;
    }
}

