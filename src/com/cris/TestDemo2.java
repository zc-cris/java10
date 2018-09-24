package com.cris;

import java.util.*;

/**
 * TODO
 *
 * @author zc-cris
 * @version 1.0
 **/
public class TestDemo2 {

    public static void main(String[] args) {
        var list = new ArrayList<Stu>() {
            {
                add(new Stu(12, "cris"));
                add(new Stu(15, "james"));
                add(new Stu(22, "paul"));
            }
        };
        var list2 = List.copyOf(list);
        /// 可以发现，copyOf 后的集合无法进行增，删，改操作，但是可以通过查来改变其中的可变类型元素的属性值
//        list2.add("cris");
//        list2.remove(2);
//        list2.set(1, "cris");

        Stu stu = list2.get(2);
        stu.setAge(25);
        stu.setName("harden");
        list.forEach(System.out::println);
        System.out.println("-----------------");
        list2.forEach(System.out::println);

        // 注意：set的copyOf 不是按照放入顺序，而是按照迭代顺序来拷贝的
        var set = new HashSet<String>() {
            {
                add("cris");
                add("simida");
                add("tokyo");
            }
        };
        set.forEach(System.out::println);
        var set2 = Set.copyOf(set);
        set.forEach(System.out::println);

        var map = new HashMap<Integer, String>() {
            {
                put(1, "lebron");
                put(2, "aili");
                put(3, "aivirl");
            }
        };
        var map2 = Map.copyOf(map);
//        map2.put(3, "rose");
        map2.forEach((k, v) -> System.out.println(String.format("k=%s,v=%s", k, v)));
    }
}


class Stu {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Stu{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Stu() {
    }

    public Stu(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
