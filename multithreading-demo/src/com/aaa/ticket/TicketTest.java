package com.aaa.ticket;

/**
 * @author wz
 * @date 2018/8/14 10:11
 */
public class TicketTest {
    public static void main(String[] args) {
        //继承thread
        /*for (int i = 1; i <=5 ; i++) {
            new SaleTicketThread("窗口"+i).start();
        }*/

        //实现runnable
        SaleTicketRunnable saleTicketRunnable = new SaleTicketRunnable();
         for (int i = 1; i <=5 ; i++) {
            new Thread(saleTicketRunnable,"窗口"+i).start();
        }

    }
}
