package org.collectionframework;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Khởi tạo LinkedList
        LinkedList<String> taskQueue = new LinkedList<>();

        // Thêm phần tử
        taskQueue.add("Task 1");
        taskQueue.add("Task 2");

        // Cung cấp các method đặc thù để chèn vào đầu/cuối rất tiện lợi
        taskQueue.addFirst("Urgent Task");
        taskQueue.addLast("Low Priority Task");

        for(String task:taskQueue){
            System.out.println("Task is: "+task);
        } //
        // ket qua la :
        // Task is: Urgent Task
//        Task is: Task 1
//        Task is: Task 2
//        Task is: Low Priority Task


        // Truy xuất phần tử (Chậm hơn ArrayList)
        // Hệ thống phải duyệt từ đầu (hoặc cuối) đến vị trí index 2
        String task = taskQueue.get(2);
        System.out.println("Task tại index 2: " + task); // In ra: Task 2

        // Xóa phần tử ở đầu/cuối rất nhanh
//        taskQueue.removeFirst();
    }
}
