package org.threadsafe;

public class ViewCounter {
    private int views = 0;

    // TỪ KHÓA QUAN TRỌNG: synchronized
    // Nó đảm bảo tại 1 thời điểm, chỉ có 1 Thread được phép chạy vào hàm này
    public synchronized void increaseView() {
        views++; // Hành động Tăng lượt xem (Ghi/Sửa đổi dữ liệu)
    }

    public int getViews() {
        return views;
    }
}
