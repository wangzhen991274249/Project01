package com.aaa.mt.demo;

/**
 * @author wz
 * @date 2018/8/14 9:48
 */
public class PingIpRunnable implements Runnable {

    private  String ip;

    public PingIpRunnable(String ip) {
        this.ip = ip;
    }

    @Override
    public void run() {
        PingIpDemo.pingIpMethod(ip);
    }
}
