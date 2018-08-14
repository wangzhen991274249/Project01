package com.aaa.ticket;

/**
 * @author wz
 * @date 2018/8/14 10:00
 */
public class SaleTicketThread extends Thread {
    private int tickets = 20;
    private String name;

    public SaleTicketThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (tickets>0) {
            System.out.println(name+"卖票,剩余票数:"+tickets--+"张");
        }
    }
}
