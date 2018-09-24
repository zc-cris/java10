package com.cris;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * java 10 新特性之：printWriter和printStream 新增加的针对字符集的构造方法
 *
 * @author zc-cris
 * @version 1.0
 **/
public class TestDemo4 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        String string = "cris,你很帅！";
//        PrintWriter writer1 = new PrintWriter("C:/File/a.txt", "utf-8");
//        PrintWriter writer = new PrintWriter("C:\\File\\b.txt", "utf-8");
        // 通过修改字符集编码将字符串输出到当前项目的根路径下的文件（文件不存在可自动创建）
        PrintWriter writer = new PrintWriter("c.txt", "gbk");
        writer.print(string);
        writer.flush();
        writer.close();
    }
}
