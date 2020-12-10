package com.jiang.pattern.factory;

import com.jiang.pattern.util.*;

/**
 * @description: 简单工厂类，创建算法算
 * @author: Mr.Jiang
 * @date: 2020/12/10 11:11
 * @version: 1.0
 *
 * 1.将每个算法分开，修改互不影响。
 * 2.需要增加算法，则新建类，继承算法类，并在工厂中添加他，每次可以生产
 **/
public class OperationFactory {


    // 工厂只需要造一次，只需要执行一次。根据对应的参数，造出，对应的算法类
    public static Operation createOperation(String operation){
        Operation oper = null;
        switch (operation){
            // 加法程序
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return  oper;
    }
}
