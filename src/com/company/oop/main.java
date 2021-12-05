package com.company.oop;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Circle c1 = new Circle(13);

        System.out.println("Area: "+c1.calculateArea());
        System.out.println("Circumference: " +c1.calculateCircumference());
        c1.printName();
        System.out.println("----------------------------------------");
//      SUBCLASS INSTANTIATE EDİLDİĞİNDE ÖNCE SUPERCLASS IN CONSTRUCTOR I ÇAĞRILIR.
        Cylinder c2 = new Cylinder(10,20);
        System.out.println("Area: "+c2.calculateArea());
        System.out.println("Circumference: " +c2.calculateCircumference());
        System.out.println("Volume: "+c2.calculateVolume());
        c2.printName();
        System.out.println("----------------------------------------");
//      CYLINDERIN KENDI İÇİNDE 2 CONSTRUCTORINI ÇAĞIRMA THIS ILE YAPILIR
        Cylinder c3 = new Cylinder(12,34, "iron");
        c3.printName();
        System.out.println("----------------------------------------");
//      ALTTAKİ SATIRDA REFERENCE CIRCLE OLDUPU İÇİN CYLINDER METHODLARI ÇAĞRILAMIYOR ANCAK CAST EDEREK ÇAĞIRABİLİRİZ
//      SUBCLASS IN SADECE KENDİNDEN OLAN METODLARINA ULAŞAMADIK
        Circle cylinder = new Cylinder(12,12);
        System.out.println(((Cylinder) cylinder).calculateVolume());
        cylinder.printName();
        System.out.println("----------------------------------------");
//      İLGİNÇ OLAN SUBCLASS IN METHODLARINA ULAŞAMZKEN ULAŞTIĞIMIZ SUPER CLASS IN METHODLARI OVERRIDE EDİLMİŞ ŞEKİLDE ÇALIŞIR YANI SUBCLASS A GÖRE ÇALIŞIR
//      BUNA DYNAMİC METHOD DISPATCH DENİR  RUN TIME POLYMORPHISM DIR BU
//      REFERENCE SUPER CLASS OBJECT SUBCLASS OLARAK YARATILIYOR SUPER CLASS OLAN METODLARI SUBCLASSTAKİ HALİ İLE ÇAĞIRABİLİRİZ
//      HEAP TE DYNAMıC OLARAK OLUŞAN OBJENİN METODU NEW İLE ALINAN ŞEY YANİ CYLINDER NEW LENDI ADI DA O YUZDEN DYNAMIC METHOD DISPATCH
        Circle c4 = new Cylinder(10,20);
        System.out.println("override: "+c4.calculateArea());
        c4.printName();

//      FINAL YADA STATIC METHOS-DLAR OVERRIDE EDILEMEZ
//      SUPER DE PUBLIC OLAN SUB DA PRIVATE OLARAK OVERRIDE EDILEMEZ


//        String[] array = {"banana","apple","lemon","armut","armut","banana","apple","apple","elma","elma","sirke","sirke"};
//        HashMap<String, Integer> result = orderedResult(array);


    }

    public static HashMap<String ,Integer> orderedResult(String[] transactions){
        HashMap<String ,Integer> result = new HashMap<>();
        for(String transaction: transactions){
            if(result.containsKey(transaction)){
                Integer value =result.get(transaction);
                result.replace(transaction,++value);
            }
            else{
                result.put(transaction,1);
            }
        }
        List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>(result.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(
                    Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });
        entries = getMax(entries);

        entries.forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        return result;

    }

    public static List<Map.Entry<String, Integer>> getMax(List<Map.Entry<String, Integer>> map){

        List<Map.Entry<String, Integer>> result = new ArrayList<>();
        for (int i=map.size()-1;i>0;i--) {
            for(int j=i-1;j>= 0 ;j--){
                if (map.get(i).getValue()>map.get(j).getValue()){
                    result.add(map.get(i));
                    j=-1;

                }
                else {
                    if (map.get(i).getKey().compareTo(map.get(j).getKey())<0){
                        result.add(map.get(i));
                        j=-1;
                    }
                    else{
                        result.add(map.get(j));
                        result.add(map.get(i));
                        j=-1;
                        i--;
                    }
                }
            }

        }
        result.add(map.get(0));
        return result;
    }
}
