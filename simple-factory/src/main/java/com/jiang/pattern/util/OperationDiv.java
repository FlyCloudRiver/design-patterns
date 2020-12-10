package com.jiang.pattern.util;

import java.math.BigDecimal;

/**
 * @description:
 * @author: Mr.Jiang
 * @date: 2020/12/10 14:11
 * @version: 1.0
 **/
public class OperationDiv extends Operation{

    public Double getResult(){
        if(getNumber2()== 0){
            try {
                throw new Exception("除数不能为零");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        BigDecimal b   =   new   BigDecimal(getNumber1()/getNumber2());
        return  b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
