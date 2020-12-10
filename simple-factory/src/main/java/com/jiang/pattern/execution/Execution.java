package com.jiang.pattern.execution;

import com.jiang.pattern.factory.OperationFactory;
import com.jiang.pattern.util.Operation;

/**
 * @description:
 * @author: Mr.Jiang
 * @date: 2020/12/10 11:36
 * @version: 1.0
 **/
public class Execution {

    public static void main(String[] args) {
        Operation oper;
        oper = OperationFactory.createOperation("/");
        oper.setNumber1(32.5D);
        oper.setNumber2(14.3D);
        double result = oper.getResult();
        System.out.println("result==="+result);
    }
}
