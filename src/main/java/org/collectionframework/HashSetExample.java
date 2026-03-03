package org.collectionframework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Khởi tạo HashSet
        Set<String> userRoles = new HashSet<>();

        // Thêm phần tử
        userRoles.add("ADMIN");
        userRoles.add("USER");
        userRoles.add("MANAGER");

        // Cố tình thêm một phần tử trùng lặp
        boolean isAdded = userRoles.add("USER");
        System.out.println("Có thêm được USER lần 2 không? " + isAdded); // In ra: false

        // In danh sách (Thứ tự in ra KHÔNG đảm bảo giống thứ tự lúc thêm vào)
        System.out.println("Các quyền của user: " + userRoles);
        // Ket qua in ra : [MANAGER, ADMIN, USER]

        // Kiểm tra phần tử tồn tại (Rất nhanh)
        if (userRoles.contains("ADMIN")) {
            System.out.println("User này có quyền Admin!");
        }
    }
}
