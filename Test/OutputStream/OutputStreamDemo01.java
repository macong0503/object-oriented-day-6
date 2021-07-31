package com.hqyj.mc.Test.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
java.io.OutputStream
此类是一个抽象类，表示输出字节流的所有类的超类
定义一些子类共性的成员方法：
public void close()throws IOException关闭此输出流并释放与此流相关联的任何系统资源
public void flush()throws IOException刷新此输出流并强制任何缓冲的输出字节被写出。
public void write(byte[] b)throws IOException将b.length字节从指定的字节数组写入此输出流。
public void write(byte[] b,int off,int len)throws IOException从指定的字节数组写入len字节，从偏移off开始输出到此输出流。
public abstract void write(int b)throws IOException将指定的字节写入此输出流。

java.io.FileOutputStream  extends OutputStream
作用：把内存的数据写入到硬盘文件中
构造方法：
public FileOutputStream(File file)throws FileNotFoundException创建文件输出流以写入由指定的File对象表示的文件
public FileOutputStream(String name)throws FileNotFoundException创建文件输出流以指定的名称写入文件。
写入数据的原理：
java程序——>JVM(Java虚拟机）——>OS(操作系统）——>OS调用写入数据的方法——>把数据写入到文件中
字节输出流的使用步骤：
1.调用构造方法，创建字节输出流对象
2.调用write方法，把数据写入到文件中
3.释放资源（流在使用的时候会占用内存，使用完毕要清空内存，可以提高程序的效率）
4.处理异常
注意：
flush()在字节输出流中可以不使用，可以不刷新
 */
public class OutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        fos.write(97);
        fos.close();
    }
}
