package org.example;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        StringBuilder query = new StringBuilder("SELECT * FROM users ");

        // Giả sử có điều kiện lọc từ Client
        String status = "ACTIVE";
        int minAge = 18;

        // Thêm các điều kiện (Append)
        query.append("WHERE status = '").append(status).append("'");
        query.append(" AND age >= ").append(minAge);

        // Sắp xếp
        query.append(" ORDER BY created_at DESC");

        // Chuyển về String để thực thi
        String finalQuery = query.toString();

        System.out.println("Generated SQL: " + finalQuery);
    }
}
