package com.company;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a;
//        float b;
//        String c;
//        String d;
//        a = scanner.nextInt();
//        System.out.println(a);
//        b = scanner.nextFloat();
//        System.out.println(b);
//        c = scanner.next();
//        System.out.println(c); //EĞER c space içeriyorsa spaceten sonrasını yeni input olarak görür
//        Scanner scanner1 = new Scanner(System.in);
//        d = scanner1.nextLine();
//        System.out.println(d);  // kaçlık taban olarak gireceğine karar verirouz
//        scanner1.useRadix(36);  // max 36 lık alıyor üstünde exception çakar
//        int r = scanner1.nextInt();
//        System.out.println(r);
        long ln = 234l;
        System.out.println(ln);
        float f =3455.2222f;
        double d = 454545.4545;
        System.out.println(f);
        System.out.println(d);
        char c = 'a';
        System.out.print(c);
    }
}
