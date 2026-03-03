package org.collectionframework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>();
        //Them lon xon
        scores.add(85);
        scores.add(100);
        scores.add(50);
        scores.add(40);

        //Them trung lap => bi bo qua
        scores.add(100);

        //In danh sach (treeset tu dong sap xep tu be -> lon)[40, 50, 85, 100]
        System.out.println("Diem so duoc sap xep: "+scores);


    }
}
