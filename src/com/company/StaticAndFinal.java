package com.company;
class Test{
    final String name= "final";
    static int a = 10;
    int b;
    void show(){
        System.out.println(a+" "+b);
    }

//    static void display(){
//        System.out.println(b);
//    }
}

public class StaticAndFinal {

    public static void main(String[] args) {
        Test test = new Test();
        test.show();
        test.a=40;
        test.show();
        Test test1 = new Test();
        test1.show();

    }
}


//  YARATILAN TÜM TEST OBJELERİ AYNI STATİC VARİABLE IN ADRESİNİ GÖRDÜĞÜ İÇİN BİRİNDEKİ DEĞİŞİKLİK HEPSİNİ ETKİLER
//  STATİC METODLAR SADECE STATİC OLAN MEMBERLARI KULLANABİLİR O YÜZDEN DİSPLAY ÇALIŞMAZ
//  STATİC CLASSLAR EXTEND EDİLEMEZ
//  STATİC METDOLAR OBJE CREATE EDİLMEDEN ULAŞILABİLİR
//  STATIC METODLAR OVERRIDE EDİLEMEZ
//  FINAL VALUELAR DEĞİŞTİRELEMEZ
//  FINAL METODLAR OVERRİDE EDİLEMEZ
//  FINAL CLASSLAR EXTEND EDİLEMEZ
