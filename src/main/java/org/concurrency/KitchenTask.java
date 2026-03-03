package org.concurrency;

public class KitchenTask implements Runnable{
    private String chefName;
    private String taskName;

    public KitchenTask(String chefName, String taskName) {
        this.chefName = chefName;
        this.taskName = taskName;
    }
    @Override
    public void run() {
        System.out.println( chefName + " bắt đầu: " + taskName);

        try {
            // Giả lập thời gian nấu ăn mất từ 1 đến 3 giây
            int cookingTime = (int) (Math.random() * 3000) + 1000;
            Thread.sleep(cookingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(chefName + " ĐÃ XONG: " + taskName);
    }
}
