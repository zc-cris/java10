package com.cris;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UserTest {

    static User user = null;

    @BeforeAll
    static void create() {
        user = new User();
        System.out.println("user = " + user);
    }

    @AfterAll
    static void destroy() {
        System.out.println("user has been destroyed");
    }
    
/*
    @BeforeEach
    void create(){
        user = new User();
    }

    @AfterEach
    void destroy(){
        System.out.println("user = " + user);
    }*/


    @Test
    void getAge() {
        int age = user.getAge();
        System.out.println("age = " + age);
    }

    @Test
    void func1() {
        user.func1();
    }
}