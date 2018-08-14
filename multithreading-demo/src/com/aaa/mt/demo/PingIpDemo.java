package com.aaa.mt.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wz
 * @date 2018/8/14 8:52
 */
public class PingIpDemo {

    public static void pingIpMethod(String ip) {
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("ping "+ip);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String readline = null;
            boolean isConnection = false;

            while ((readline = bufferedReader.readLine()) != null) {
                if (readline.contains("TTL")) {
                    isConnection = true;
                    break;
                }
            }
            if (isConnection) {
                System.out.println(ip+"畅通无阻");
            } else {
                System.out.println(ip+"排泄不便");
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            pingIpMethod("192.168.1."+i);
        }
    }
}
