package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Khai báo Map (Key: String, Value: Double)
        Map<String,Double> studentGrades = new HashMap<>();
        // 1. Thêm dữ liệu (put)
        studentGrades.put("SV001", 8.5);
        studentGrades.put("SV002", 9.0);
        studentGrades.put("SV003", 7.0);

        // 2. Truy xuất dữ liệu (get)
        System.out.println("Điểm của SV002: " + studentGrades.get("SV002"));

        // 3. Kiểm tra sự tồn tại
        if (studentGrades.containsKey("SV001")) {
            System.out.println("Đã có điểm cho SV001");
        }

        // 4. Duyệt Map
        studentGrades.forEach((id, grade) -> {
            System.out.println("Mã SV: " + id + " - Điểm: " + grade);
        });


    }
}
