package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class udemy {
    public static void main(String[] args) {
        int k=3;
        List<Integer> arrival=new ArrayList<>();
//        arrival.add(1);
//        arrival.add(2);
//        arrival.add(3);
//        arrival.add(4);
//        arrival.add(5);
        arrival.add(1);
        arrival.add(2);
        arrival.add(12);
        arrival.add(5);
        arrival.add(6);
        arrival.add(30);
        arrival.add(32);
        List<Integer> load = new ArrayList<>();
//        load.add(6);
//        load.add(3);
//        load.add(4);
//        load.add(4);
//        load.add(4);
        load.add(15);
        load.add(10);
        load.add(10);
        load.add(10);
        load.add(10);
        load.add(15);load.add(10);

        List<Integer> result = new ArrayList<>();
        result = loadBalancing(k,arrival,load);
        List<String> commands = new ArrayList<>();
        commands.add("GGGGR");
        doesCircleExist(commands);

    }


//    public static int moves(List<Integer> arr){
//        int numberOfSwap = 0;
//        int startIndex = 0;
//        int lastIndex = arr.size()-1;
//        while(startIndex<lastIndex){
//            while(arr.get(startIndex)%2==0 & startIndex<lastIndex ){
//                startIndex++;
//            }
//            while(arr.get(lastIndex)%2==1 & startIndex<lastIndex ){
//                lastIndex--;
//            }
//            if (startIndex < lastIndex)
//            {
//                int temp = arr.get(startIndex);
//                arr.set(startIndex,arr.get(lastIndex));
//                arr.set(lastIndex,temp);
//                startIndex++;
//                lastIndex--;
//                numberOfSwap++;
//            }
//        }
//        return numberOfSwap;
//    }

    static class Server{
        boolean busy;
        int start;
        int end;
        int total;
        Server(boolean busy,int start,int end){
            this.busy = busy;
            this.start = start;
            this.end = end;
            this.total = 0;
        }
    }
    public static List<Integer> loadBalancing(int k, List<Integer> arrivals, List<Integer> loads) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i <arrivals.size() ; i++) {
            map.put(arrivals.get(i),loads.get(i));
        }
        List<Map.Entry> entryList = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
        List<Integer> arrival = new ArrayList<>();
        List<Integer> load = new ArrayList<>();
        for (int i = 0; i < arrivals.size(); i++) {
            arrival.add((Integer)entryList.get(i).getKey());
            load.add((Integer)entryList.get(i).getValue());
        }
        Server[] servers = new Server[k];
        for (int i = 0; i < k; i++) {
            servers[i] = new Server(true,0,0);
        }
        for (int i = 0; i < arrival.size(); i++) {
            for (int l = 0; l <k ; l++) {
                if(servers[l].end< arrival.get(i)){
                    servers[l].busy=true;
                }
            }
            for(int j=0;j<k;j++){
                if (servers[j].busy==true){
                    servers[j].busy=false;
                    servers[j].start=arrival.get(i);
                    servers[j].end= arrival.get(i)+ load.get(i)-1;
                    servers[j].total+=load.get(i);
                    j=k;
                }
            }
        }
        List<Integer> result = new ArrayList<>(k);
        int max =0;
        for (Server server: servers) {
            if(server.total>max){
                max = server.total;
            }
        }
        for (int i = 0; i < servers.length ; i++) {
            if (servers[i].total==max){
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer>  getMinimumDifference(){
        return null;
    }

    public static List<String> doesCircleExist(List<String> commands) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < commands.size(); i++) {
            int x = 0, y = 0;
            String directions = "North";
            for (int j = 0; j < commands.get(i).concat(commands.get(i)).concat(commands.get(i)).concat(commands.get(i)).length(); j++) {

                char move = commands.get(i).concat(commands.get(i)).concat(commands.get(i)).concat(commands.get(i)).charAt(j);

                if (move == 'R') {
                    if (directions.equals("North"))
                        directions = "East";
                    else if (directions.equals("East"))
                        directions = "South";
                    else if (directions.equals("South"))
                        directions = "West";
                    else directions = "North";
                }
                else if (move == 'L'){
                    if (directions.equals("North"))
                        directions = "West";
                    else if (directions.equals("West"))
                        directions = "South";
                    else if (directions.equals("South"))
                        directions = "East";
                    else directions = "North";
                }
                else
                {
                    if (directions.equals("North"))
                        y += 1;
                    else if (directions.equals("South"))
                        y -= 1;
                    else if(directions.equals("East"))
                        x += 1;
                    else
                        x -= 1;
                }
            }
            if (x == 0 && y == 0) {
                result.add("YES");
            } else {
                result.add("NO");
            }
        }
        return result;
    }

    class Solution {
        public String returnDuplicates(String my_input) {
            int[] lookup = new int[26];
            for (char c : my_input.toCharArray()) {
                lookup[c - 'a']++;
            }
            for (int i = 0; i < lookup.length; i++) {
                if (lookup[i] >= 2) {
                    return String.valueOf((char)(i + 'a'));
                }
            }
            return "";
        }
    }




}


