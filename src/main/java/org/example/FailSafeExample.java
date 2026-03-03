package org.example;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
    public static void main(String[] args) {
        // Class này hỗ trợ cơ chế Fail-Safe
        List<String> students = new CopyOnWriteArrayList<>();
        students.add("An");
        students.add("Bình");
        students.add("Chi");

        for (String name : students) {
            System.out.println("Đang xem: " + name);
            if (name.equals("Bình")) {
                students.add("Dũng");
                System.out.println("--> Đã âm thầm thêm Dũng vào danh sách gốc.");
            }
        }

        System.out.println("\nDanh sách cuối cùng: " + students);//kết quả Danh sách cuối cùng: [An, Bình, Chi, Dũng]
    }
}
