package com.hqyj.mc.Test.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
字节输入流一次读取一个字节的方法：
java.io.InputStream
此类是一个抽象类，表示输入字节流的所有类的超类
定义一些子类共性的成员方法：
public abstract int read()throws IOException从输入流读取数据的下一个字节。
public int read(byte[] b)throws IOException从输入流读取一些字节数，并将它们存储到缓冲区b 。
public int read(byte[] b,int off,int len)throws IOException从输入流读取len字节的数据到一个字节数组。

public int available()throws IOException返回从该输入流中可以读取（或跳过）的字节数的估计值
public long skip(long n)throws IOException跳过并丢弃来自此输入流的n字节数据。

public class FileInputStream extends InputStream
作用：把写入到硬盘文件中的数据读出来到内存中
 */
public class InputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("b.txt");
        int len = 0;//记录读到的字节
        while ((len=fis.read()) != -1){
            System.out.println(len);
        }
        fis.close();
    }
}
