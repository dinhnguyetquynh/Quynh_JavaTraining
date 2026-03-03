package org.example;

import java.util.ArrayList;
import java.util.List;

public class FailFastExample {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("An");
        students.add("Bình");
        students.add("Chi");

        try {
            for (String name : students) {
                System.out.println("Đang xem: " + name);
                // Thử thêm một người mới khi đang duyệt
                if (name.equals("Bình")) {
                    students.add("Dũng");
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi thay đổi danh sách: " + e.toString());
        }
    }
}
