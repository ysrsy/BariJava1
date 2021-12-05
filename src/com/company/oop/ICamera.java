package com.company.oop;

public interface ICamera {
    final static int x = 10;
    void recordVideo();
    void takePhoto();
    static void statMethod(){
        System.out.println("I am static");
    }
    default void defaultMethod(){
        System.out.println("ı am default");
    }
}

//      WE CAN ACCESS STATIC MEMBERS

//      INTERFACES CAN BE EXTENDED ANOTHER INTERFACE

//      STATIC METHOD CAN NOT OVERRIDED

//      DEFAULT METHOD CAN OVERRIDE

//      PRIVATE METHOD TANIMLAYABİLİRİZ ANCAK BUNA SADECE INTERFACE KENDİ İÇİNDE ULAŞIR DEFAULT METODU VARSA ONUN İÇİNDE KULLANMAK İÇİN

//      MEMBERS ARE ALWAYS FİNAL