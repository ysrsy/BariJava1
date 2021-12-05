package com.company.oop;

public abstract class Shape {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void printName();
}

//      ABTRACT 0 YA DA DAHA FAZLA ABSTRACT METOD İÇERMELİ

//      ABSTRACT INSTANTIATE EDILEMEZ AMA REFERENCE OLARAK KULLANILABİLİR

//      ÇÜNKÜ UNKNOWN BİŞEY VAR O YÜZDEN CREATE EDEMİYORUZ HEAP TE

//      ABSTRACTI EXTEND EDEN SUBCLASS ABSTRACT METODU OVERRİDE ETMEZSE O SUBCLASS DA ABSTRACT OLUR

//      EĞER METODUN SIGNATURE SADECE YAZILIYSA ÖETOD ABSTRACT OLMALI

//      ABSTRACT OLAN CLASS YADA METOD FINAL OLAMAZ ÇÜNKÜ OVERRRİDE EDİLMESİ LAZIM OVERİDE EDİLECEK ŞEYDE DEĞİŞTİRİLEMEZ OLMAMALI

//      ABSTRACT OLAN CLASS YADA METOD STATIC OLAMAZ ÇÜNKÜ NE OLDUĞU BELLİ DEĞİL NASIL OLUŞTURSUN

//      ABSTRACT CLASS IN AMACI POLYMORFİZME ZORLAMAK


