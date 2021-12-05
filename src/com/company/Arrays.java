package com.company;

public class Arrays {
    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0] = "dsfsd";
        strings[1] = "wew";
        strings[2] = "erer";
        strings[3] = "nmnmn";
        strings[4] = "azaz";
        int[] ints = {1,2,3,4};
        char[] chars;
        chars = new char[3];

        for (int i : ints ) {
            System.out.println(++i);
        }

        for (int i : ints ) {
            System.out.println(i);
        }
//      for each can not change content of array because 'i' is not directly array element in my opinion but
//      in for content change because directly take array element

        for (int i=0;i<ints.length;i++){
            System.out.println(ints[i]++);
        }

        for (int i=0;i<ints.length;i++){
            System.out.println(ints[i]++);
        }

        for (String s: strings) {
            System.out.println(s);
        }
        java.util.Arrays.sort(strings);
        for (String s: strings) {
            System.out.println(s);
        }
    }
}
