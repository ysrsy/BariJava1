package com.company;

import java.io.*;
import java.time.Instant;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) throws IOException {
        Instant now =Instant.now();
        System.out.println(now);
        File file = new File("/home/ysr/Desktop/meyveler.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
        Instant now2 =Instant.now();
        System.out.println(now2);

        System.out.println("---------------------");
        Instant now3 =Instant.now();
        System.out.println(now3);
        File file2 = new File("/home/ysr/Desktop/meyveler.txt");
        Scanner sc = new Scanner(file2);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
        Instant now4 =Instant.now();
        System.out.println(now4);

        PrintWriter writer = new PrintWriter("newcr.txt", "UTF-8");
        writer.println("The first line");
        writer.println("The second line");
        writer.close();
    }
}
