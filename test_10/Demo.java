package com.test_10;

public class Demo {
    public static void main(String[] args) {
        Jumpping j=new Cat();
        j.jump();
        System.out.println("--------");

        Animal a= new Cat();
        a.setName("加肥");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
//        a.jump();


    }
}
