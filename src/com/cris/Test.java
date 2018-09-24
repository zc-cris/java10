package com.cris;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * java 10 的新特性只类型推断
 *
 * @author zc-cris
 * @version 1.0
 **/
class TestDemo {

    @Test
    void var() {
        System.out.println("hello, java10");
        var var = 12;
        System.out.println("var = " + var);
    }

    @Test
    void test() {
        var a = 10;
        var b = "string";
        var list = new ArrayList<Integer>();
        var map = new HashMap<String, String>();
        var set = new HashSet<String>();
        list.add(12);
        list.add(13);
        map.put("key", "value");
        set.add("cris");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        list.forEach(System.out::println);

        System.out.println("--------");
        set.forEach(System.out::println);
        System.out.println("--------");

        map.forEach((k, v) -> System.out.println(String.format("k=%s,v=%s", k, v)));
    }
}
