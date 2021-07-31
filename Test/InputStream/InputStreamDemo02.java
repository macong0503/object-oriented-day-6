package com.hqyj.mc.Test.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
字节输入流一次读取多个字节的方法：
public int read(byte[] b)throws IOException从输入流读取一些字节数，并将它们存储到缓冲区b 。
public int read(byte[] b,int off,int len)throws IOException从输入流读取len字节的数据到一个字节数组。
明确两件事情：
1.方法的参数byte[]的作用？
起到了缓冲的作用，存储每次读取到的多个字节
数组的长度一般定义为1024或者1024的整数倍
2.方法的返回值int是什么？
每次读取到的有效字节个数
 */
public class InputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("b.txt");
        byte[] bytes = new byte[1024];//存储读到的多个字节
        int len = 0;//每次读取到的有效字节个数
        while ((len = fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}
