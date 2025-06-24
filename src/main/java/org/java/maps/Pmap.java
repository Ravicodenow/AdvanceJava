package org.java.maps;
import java.util.*;


public class Pmap {

    public static void main(String[] args){

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // LinkedHashMap maintaining the order of in and have some addition features
        linkedHashMap.put("Sweta", 10);
        linkedHashMap.put("Amiya", 30);
        linkedHashMap.put("Gudly", 20);
        linkedHashMap.put("Ravi",50);
        // traversing through map using for looping
        for(Map.Entry<String ,Integer> mp: linkedHashMap.entrySet()){
            System.out.print(mp.getKey()+":");
            System.out.println(mp.getValue());

        }

        System.out.println("HASH-MAP->");
        //-------- HashMap Not maintaing the order or insertion -------

        Map<String, Integer> hashMap = new HashMap<>(); // maintaining the order of in
        hashMap.put("Sweta", 10);
        hashMap.put("Amiya", 30);
        hashMap.put("Gudly", 20);
        hashMap.put("Ravi",50);
        // traversing through map using for looping
        for(Map.Entry<String ,Integer> mp: hashMap.entrySet()){
            System.out.print(mp.getKey()+":");
            System.out.println(mp.getValue());

        }



    }


}
