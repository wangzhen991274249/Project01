package com.aaa;

import java.util.ArrayList;

public class HelloWorld {

    public static final int NUM = 1;

    public static void main(String[] args) {
        System.out.print("dasdas3d");
        System.out.print("dasdas3d");
        System.out.println();
        System.out.println("args = [" + args + "]");
        int num1 = 10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        String[] strings = new String[] {"a", "b", "c",};

        //for i 循环
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        //iter增强for循环
        for (String string : strings) {
            System.out.println(string);
        }
        //itar  for循环   
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
        }

        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);

        //list.for
        for (Object o : arrayList) {
            
        }

        //list.fori
        for (int i = 0; i < arrayList.size(); i++) {
            
        }

        //list.forr逆序循环
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            
        }

        //ifn
        if (arrayList == null) {
            
        }

        //inn
        if (arrayList != null) {
            
        }

        //list.nn
        if (arrayList != null) {

        }

        //list.null
        if (arrayList == null) {

        }










    }
}
