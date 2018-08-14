package com.aaa.mt.demo;

/**
 * @author wz
 * @date 2018/8/14 9:44
 */
public class PingIpTest {
    public static void main(String[] args) {
        //继承的时thread
       /* for (int i = 0; i < 50; i++) {
            PingIpExtendThread pingIpExtendThread = new PingIpExtendThread("192.168.1." + i);
            pingIpExtendThread.start();
        }*/

       //实现runnable
        for (int i = 0; i < 50; i++) {
            PingIpRunnable pingIpRunnable = new PingIpRunnable("192.168.1." + i);
            new Thread(pingIpRunnable).start();
        }

    }
}
