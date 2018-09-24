package com.cris;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * java 10 新增API 之：transferTo(Writer out),注意，源文件是什么字符编码，读取的时候就要用对应的字符编码去读，
 * 写出的时候也要用对应的字符编码去写，否则极易出现乱码问题
 *
 * @author zc-cris
 * @version 1.0
**/
public class TestDemo5 {
    public static void main(String[] args) throws IOException {
        // 超级简单的字符串文件拷贝
        var reader = new InputStreamReader(new FileInputStream("c:/File/a.txt"), "utf-8");
        var writer = new PrintWriter("c:/File/b.txt", "utf-8");
        reader.transferTo(writer);
        reader.close();
        writer.close();
    }
}
