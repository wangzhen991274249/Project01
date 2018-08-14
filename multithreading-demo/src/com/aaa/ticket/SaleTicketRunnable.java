package com.aaa.ticket;

/**
 * @author wz
 * @date 2018/8/14 10:23
 */
public class SaleTicketRunnable implements Runnable {
    private int tickets = 20;
    @Override
    public void run() {
        while (tickets>0) {
            System.out.println(Thread.currentThread().getName() + "卖票,剩余票数:" + tickets-- + "张");

        }
    }
}
