package com.test_05;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catMouse() {
        System.out.println("猫抓老鼠");
    }
}
