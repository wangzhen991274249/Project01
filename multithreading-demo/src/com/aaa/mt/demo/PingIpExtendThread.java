package com.aaa.mt.demo;

/**
 * @author wz
 * @date 2018/8/14 9:16
 */
public class PingIpExtendThread extends Thread {
    private String ip;

    public PingIpExtendThread(String ip) {
        this.ip = ip;
    }

    @Override
    public void run() {
        PingIpDemo.pingIpMethod(ip);
    }
}
