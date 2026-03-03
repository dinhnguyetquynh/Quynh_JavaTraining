package org.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> userAgeMap = new HashMap<>();

        //Them cac cap key - value
        userAgeMap.put("Alice",20);
        userAgeMap.put("Bob",22);
        userAgeMap.put("Charlie",25);

        //Lay value dua vao key (Truy xuat cuc nhanh)
        Integer age = userAgeMap.get("Bob");
        System.out.println("Tuoi cua Bob la:"+age);

        //Kiem tra xem Key co ton tai khong
        if(userAgeMap.containsKey("Alice")){
            System.out.println("Co thong tin cua Alice trong he thong");
        }

        //Duyet qua toan bo Map => khong theo thu tu
//        for(Map.Entry<String,Integer> entry:userAgeMap.entrySet()){
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }

        //Duyet vong lap for dung foreach => Lambda Expression
        userAgeMap.forEach((key,value)->{
            System.out.println(key+":"+value);
        });


    }
}
