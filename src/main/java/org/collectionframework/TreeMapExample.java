package org.collectionframework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String,Double> revenueMap = new TreeMap<>();
        revenueMap.put("2026-02-01",10000.00);
        revenueMap.put("2026-02-03",15000.00);
        revenueMap.put("2026-02-02",20000.00);

        //Duyet qua map : in doanh thu theo ngay => ket qua theo thu tu theo key
        for(Map.Entry<String,Double> entry:revenueMap.entrySet()){
            System.out.println(entry.getKey()+"->$"+entry.getValue());
        }




    }
}
