package org.concurrency;

public class ConcurrencyExample {
    public static void main(String[] args) {
        System.out.println("BẮT ĐẦU CHUẨN BỊ BỮA TRƯA ");

        // Tạo 3 luồng (3 bác đầu bếp)
        Thread chef1 = new Thread(new KitchenTask("Bác A", "Nấu cơm"));
        Thread chef2 = new Thread(new KitchenTask("Bác B", "Kho thịt"));
        Thread chef3 = new Thread(new KitchenTask("Bác C", "Rửa rau nấu canh"));

        // Phát lệnh cho cả 3 bắt đầu làm việc CÙNG LÚC
        chef1.start();
        chef2.start();
        chef3.start();

        // Luồng chính (Main Thread - Bếp trưởng) cứ việc chạy tiếp
        System.out.println("☕ Bếp trưởng đi uống trà trong lúc chờ 3 bác kia nấu...\n");
    }

}
