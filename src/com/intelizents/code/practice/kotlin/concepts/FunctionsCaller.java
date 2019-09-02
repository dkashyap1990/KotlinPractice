package com.intelizents.code.practice.kotlin.concepts;

public class FunctionsCaller {
    public static void main(String[] args) {
        int a=100,b=200;
        int result = FunClass.add(a,b);
        System.out.println(a+"+"+b+"="+result);

        double capital=100.0, interestRate=5.0;
        FunClass.calAmount(capital);
        FunClass.calAmount(capital,interestRate);
    }
}
