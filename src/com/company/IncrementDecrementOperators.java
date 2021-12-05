package com.company;

public class IncrementDecrementOperators {
    public static void main(String[] args){
        int x = 10;
        System.out.println(x);
        int y = x++;
        System.out.println(y); // POST increment o işi yapar sonra değeri arttır mesele for da i = 0 içerde tüm işlemler yapıldıktan sonra i = 1 olur
        System.out.println(x);
        int z = ++x;
        System.out.println(z); // PRE increment tam tersi direk o anda değeri arttırır sonda kaldığı yerden devam eder
        System.out.println(x);

        // DECREMENT tede aynı şeyler geçerli
        // short byte float hepsinde aynı şekilde çalışır ve data type ı değiştirmez (byte + byte int yapardı ondan bu not)

        int m = 4 ;
        int res = 2*m++ + 5;
        System.out.println(m);
        System.out.println(res);  // dikkat aritmetic opeationın içinde m artmadı o bittikten sonra arttı
    }
}
