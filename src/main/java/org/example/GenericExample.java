package org.example;

public class GenericExample {

    public static <T extends Number>  double totalOf2Number(T a, T b){
        return a.doubleValue()+b.doubleValue();
    }

    public static void main(String[] args) {

        System.out.println("Tong 2 so nguyen: "+ totalOf2Number(2,3));
        System.out.println("Tong 2 so thuc: "+ totalOf2Number(2.5,3.5));
        System.out.println("Tong 2 so :"+totalOf2Number(2,7.5));

    }
}
