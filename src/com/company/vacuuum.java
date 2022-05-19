package com.company;

import java.io.*;
import java.util.*;

public class vacuuum {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/ysr/Downloads/example_big.in");
        PrintWriter writer = new PrintWriter("result.out", "UTF-8");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int numberOfTestCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < numberOfTestCases; i++) {
            int numberOfDictionaryLength = Integer.parseInt(br.readLine());
            List<Set<String>> setList = new ArrayList<>();
            for (int j = 0; j < numberOfDictionaryLength; j++) {
                st = br.readLine();
                String[] splitStr = st.split(" ");
                String word1=splitStr[0].toLowerCase();
                String word2=splitStr[1].toLowerCase();
                if (setList.size()==0){
                    Set<String> set = new HashSet<>();
                    set.add(word1);
                    set.add(word2);
                    setList.add(set);
                }
                else{
                    boolean w1=false;
                    boolean w2=false;
                    int indexw1=0;
                    int indexw2=0;
                    for (int k = 0; k < setList.size(); k++) {
                        if (setList.get(k).contains(word1) && !setList.get(k).contains(word2)){
                            indexw1=k;
                            w1=true;
                        }
                        else if (!setList.get(k).contains(word1) && setList.get(k).contains(word2)){
                            indexw2=k;
                            w2=true;

                        }
                        else if (setList.get(k).contains(word1) && setList.get(k).contains(word2)){
                            w1=true;
                            w2=true;
                        }
                        else if (!setList.get(k).contains(word1) && !setList.get(k).contains(word2) && k==setList.size()-1 && w1==false && w2==false){
                            Set<String> set = new HashSet<>();
                            set.add(word1);
                            set.add(word2);
                            setList.add(set);
                            k=setList.size()+3;
                        }
                    }
                    if (w1==true && w2==true && indexw1!=indexw2){
                        setList.get(indexw1).addAll(setList.get(indexw2));
                        setList.remove(indexw2);
                    }
                    else if (w1==false && w2==true){
                        setList.get(indexw2).add(word1);
                    }
                    else if (w1==true && w2==false){
                        setList.get(indexw1).add(word2);
                    }
                }

            }
            int numberOfQuery = Integer.parseInt(br.readLine());
            for (int j = 0; j < numberOfQuery; j++) {
                String str;
                str = br.readLine();
                String[] splitStr = str.split(" ");
                String word1=splitStr[0].toLowerCase(Locale.ENGLISH);
                String word2=splitStr[1].toLowerCase(Locale.ENGLISH);
                String result = new String();
                if (word1.equals(word2)){
                    result = "synonyms";
                }
                else{
                    for (int k = 0; k < setList.size(); k++) {
                        result = "different";
                        if (!setList.get(k).contains(word1) && !setList.get(k).contains(word2)){
                            ;
                        }
                        else if (setList.get(k).contains(word1) && !setList.get(k).contains(word2)){
                            result = "different";
                            break;
                        }
                        else if (setList.get(k).contains(word1) && !setList.get(k).contains(word2)){
                            result = "different";
                            break;
                        }
                        else if (setList.get(k).contains(word1) && setList.get(k).contains(word2)){
                            result = "synonyms";
                            break;
                        }
                    }
                }
                writer.println(result);
            }
        }
        writer.close();
    }
}


