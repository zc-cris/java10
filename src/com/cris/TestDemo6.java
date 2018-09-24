package com.cris;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * java10 新特性：scanner 对文件按照指定的字符集进行读取
 *
 * @author zc-cris
 * @version 1.0
 **/
public class TestDemo6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("c:/File/a.txt"), "gbk");
        /// 还可以指定分割符
//        scanner.useDelimiter(",");
        //next():默认按照空格和换行符分割文本；nextLine():默认按照换行符分割文本
        while (scanner.hasNext()) {
            System.out.println("scanner = " + scanner.next());
        }
    }
}
