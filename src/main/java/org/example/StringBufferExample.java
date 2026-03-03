package org.example;

public class StringBufferExample {
    public static void main(String[] args) throws InterruptedException {
        // StringBuffer dùng chung cho tất cả các luồng
        StringBuffer sharedLogs = new StringBuffer("System Logs:\n");

        // Tạo 2 luồng ghi log cùng lúc
        Runnable loggerTask = () -> {
            for (int i = 0; i < 5; i++) {
                sharedLogs.append(Thread.currentThread().getName())
                        .append(" checked in at ")
                        .append(i).append("\n");
            }
        };

        Thread thread1 = new Thread(loggerTask, "Thread-A");
        Thread thread2 = new Thread(loggerTask, "Thread-B");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        // Kết quả sẽ đầy đủ và không bị đè mất dữ liệu
        System.out.println(sharedLogs.toString());
    }
}
