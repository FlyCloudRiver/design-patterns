package com.jiang.pattern.util;

/**
 * @description:
 * @author: Mr.Jiang
 * @date: 2020/12/10 14:10
 * @version: 1.0
 **/
public class OperationMul extends Operation{
    public Double getResult(){
        return  getNumber1()*getNumber2();
    }
}
