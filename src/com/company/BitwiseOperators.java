package com.company;

public class BitwiseOperators {
    public static void main(String[] args){
        // BITWISE sadece integer short ve byte a uygulanır
        int x = 500000;
        int y = 700000;
        int z = x & y;  // tüm bitler için sırası ile and uygulanır
        System.out.println(z);
        int l = x | y;  // tüm bitler için or uygulanır sırası ile
        System.out.println(l);
        int o = x ^ y;  // tüm bitler için xor uygulanır sırası ile
        System.out.println(o);
        int n = ~-4;  //  tüm  bitler için not uygulanır sırası ile not uygulanır sayı işaret değiştiri ve 1 azalır
        System.out.println(n);

        int leftShift = x<<1;  // tüm bitler n sola kayar sonuçta sayıyı 2'n ile çarpmış oluruz
        System.out.println(leftShift);

        int rightShift = 6>>1;  // tüm bitler n sağa kayar sonuçta sayıyı 2'n ile bölmüş  oluruz  pozitif sayılarda 0 gelir gidenin yerine negatiflerde 1
        System.out.println(rightShift);

        //  swapping 2 numbers a = a^b , b =a^b , a=a^b

        byte a = 9,b = 12;
        byte c;
        c=(byte) (a<<4);
        System.out.println(c);
        c=(byte)(c|b);
        System.out.println(c);
        short ss = (short)(x+y);
        System.out.println(ss);

        int k = -200;
        System.out.println(k>>>2);  // işaret değiştirir sign bit dahil 0 flow yapar

    }
}
