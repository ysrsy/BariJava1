package com.company;

public class loops {
//    DO WHILE LOOP

    public static void main(String[] args) {
//        WHILE LOOP
        int i=0;
        while(i<0){
            System.out.println(i);
            i++;
        }
//        DO WHILE LOOP   actually it is same but main difference may be you can not do anything in while loop because condition mey be not true
//        but in do while loop at least 1 time you can do process even if condition is not true
        do {
            System.out.println(i);
        }while (i<0);

//        FOR LOOP
        for (int j=0;j<10 && i<45;i++,j++){
            System.out.println(i + " "+j);
//          initialization condition and update is not must but in this case it will enter an infinite loop
//          also we can not give more than 1 parameter in for loop
        }
    }
}
