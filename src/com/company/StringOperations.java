package com.company;

public class StringOperations {
    public static void main(String[] args) {
        String s1 = new String("constructor1");
        String s4 = new String("CONStructor1");
        char[] arr = {'c','h','a','r',' ','a','r','r','a','y'};
        String s2 = new String(arr);
        byte[] bb={34,45,56,67,89};
        String s3 = new String(bb);
        System.out.printf("%s,%s,%s",s1,s2,s3);
        System.out.println(" ");

        String str = s1.toUpperCase(); // str yeni reference newlwnmediği için bir literalle aynı olursa onun adresini tutar aynı olmazsa yeni adres alır
        System.out.println(str);
        System.out.println(s1==str);
        System.out.println(s1.charAt(4)); // return char at index
        System.out.println(s1.length()); // return length
        System.out.println(s1.substring(2,7)); // return new string begin adn end index
        System.out.println(s1.substring(5)); // return new string from begin index to end of string
        System.out.println(s1.trim()); // trim başta ve sondaki spaceleri siler
        System.out.println(s1.startsWith("ons")); // if s starts return true else false
        System.out.println(s1.endsWith("r1"));
        System.out.println(s1.indexOf("r")); //return 1. index of string founded
        System.out.println(s1.lastIndexOf('o')); //return last founded index
        System.out.println(s1.equals(str));
        System.out.println(s1.equalsIgnoreCase(s4)); // check equality dont care sensitivity
        System.out.println(s1.compareTo(s4));  // ilk farklı karakterde karaterler arası ascii değer farkını verir
        System.out.println(s1.compareToIgnoreCase(s4)); //aynı işi case sensitivity olmadan yapar
        System.out.println(s1.contains("or")); // return true or false if string includes parameter
        System.out.println(s1.concat(s3)); // concat 2 string
        System.out.println(String.valueOf(345)); // convert object to string

    }
}
