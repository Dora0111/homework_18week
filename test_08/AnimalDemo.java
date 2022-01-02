package com.test_08;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.setName("加肥猫");
        a.setAge(5);
        System.out.println(a.getName()+a.getAge());
        a.eat();

        a=new Cat("加肥",7);
        System.out.println(a.getName()+a.getAge());
        a.eat();
    }
}
