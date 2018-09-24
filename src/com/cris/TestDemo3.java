package com.cris;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/**
 * java 10新特性之：可指定字符集的toString 方法
 *
 * @author zc-cris
 * @version 1.0
 **/
public class TestDemo3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String string = "java10，你好！";
        // 默认使用utf-8 进行字符-->字节的编码
        ByteArrayInputStream in = new ByteArrayInputStream(string.getBytes("gbk"));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        var len = 0;
        while ((len = in.read()) != -1) {
            out.write(len);
        }
        // 默认使用utf-8 对字节-->字符进行解码
        System.out.println("out.toString() = " + out.toString());
        System.out.println("out.toString(\"gbk\") = " + out.toString("gbk"));
    }
}
