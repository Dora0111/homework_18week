package com.test_06;

public class Demo {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("加肥猫", 9);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

    }
}
