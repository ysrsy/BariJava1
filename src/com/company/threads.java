package com.company;

public class threads extends Thread{
    public void run() {
        int i = 0;
        while(i<100){
            System.out.println("hello "+i);
            i++;
        }
    }

    public static void main(String[] args) {
        threads threads = new threads();
        threads.start();
        int i=0;
        while (i<100){
            System.out.println(" world " + i);
            i++;
        }
    }
}
