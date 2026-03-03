package org.threadsafe;

public class ThreadSafeExample {
    public static void main(String[] args) throws InterruptedException {
        ViewCounter counter = new ViewCounter();

        // Tạo một mảng chứa 100 Threads
        Thread[] threads = new Thread[100];

        // Khởi tạo và cấp việc cho 100 Threads
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> {
                // Mỗi Thread sẽ click xem 1000 lần
                for (int j = 0; j < 1000; j++) {
                    counter.increaseView();
                }
            });
            threads[i].start(); // Bắt đầu chạy ngay lập tức
        }

        // Bắt luồng chính (Main Thread) phải chờ cả 100 luồng kia chạy xong
        // (Nếu không chờ, Main Thread sẽ in ra kết quả khi các luồng kia chưa đếm xong)
        for (int i = 0; i < 100; i++) {
            threads[i].join();
        }

        // In kết quả cuối cùng
        System.out.println("Tổng số lượt xem thực tế: " + counter.getViews());
        System.out.println(" Số lượt xem kỳ vọng: 100000");
    }
}
