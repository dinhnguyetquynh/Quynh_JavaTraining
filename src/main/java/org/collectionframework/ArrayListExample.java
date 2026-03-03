package org.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Khởi tạo ArrayList
        List<String> userList = new ArrayList<>();

        // Thêm phần tử
        userList.add("Alice"); // index 0
        userList.add("Bob");   // index 1
        userList.add("Charlie"); // index 2

        // Truy xuất phần tử theo index (Rất nhanh)
        String user = userList.get(1);
        System.out.println("User tại index 1: " + user); // In ra: Bob

        // Cập nhật phần tử
        userList.set(1, "Bob Updated");

        // Xóa phần tử
        userList.remove(0); // Xóa "Alice", lúc này "Bob Updated" sẽ bị dời lên index 0

        for(String name : userList){
            System.out.println("Name is:"+name);
        }
    }
}
