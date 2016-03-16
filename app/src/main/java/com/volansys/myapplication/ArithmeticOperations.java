package com.volansys.myapplication;

/**
 * Created by pratik on 15/3/16.
 */
public class ArithmeticOperations {

    int a;
    int b;

    public ArithmeticOperations(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addNumber(){
        return a+b;
    }

    public int diffNumber(){
        return Math.abs(a-b);
    }

    public float devideNumber(){
        return (float)(a/b);
    }
    public int multiplyNumber(){
        return a*b;
    }

    @Override
    public String toString() {
        return "ArithmeticOperations{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
