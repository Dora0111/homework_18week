package com.test_02;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();

        array.add("java");
        array.add("hello");
        array.add("happy");

        array.add(1,"element");
        array.add("element");

        //输出
        System.out.println(array);
    }
}
