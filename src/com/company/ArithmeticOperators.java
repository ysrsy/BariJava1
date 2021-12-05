package com.company;

public class ArithmeticOperators {
    public static void main(String[] args){
        byte b =75 ;
        short s = 456;
        int i = 3;
        long l = 12123422334l;
        float f = 100.89f;
        double d = 89.12;
        System.out.println("byte + byte -> int, example " + (b+b));
        System.out.println("byte + short -> int, example " + (b+s));
        System.out.println("byte + int -> int, example " + (b+i));
        System.out.println("short + short -> int, example " + (s+s));
        System.out.println("short + int -> int, example " + (s+i));
        System.out.println("int + int -> int, example " + (i+i));
        System.out.println("long + int -> long, example " + (l+i));
        System.out.println("long + long -> long, example " + (l+l));
        System.out.println("float + short -> float, example " + (f+s));
        System.out.println("float + long -> float, example " + (f+l));
        System.out.println("float + double -> double, example " + (f+d));

    }
}
