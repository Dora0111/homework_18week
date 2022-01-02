package com.test_03;

import java.util.ArrayList;

public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("林清香", 30);
        Student s2 = new Student("苗大美丽", 28);
        Student s3 = new Student("大帅哥", 43);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
