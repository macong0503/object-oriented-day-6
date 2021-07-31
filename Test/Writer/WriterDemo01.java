package com.hqyj.mc.Test.Writer;

import java.io.FileWriter;
import java.io.IOException;
/*
java.io.Writer
    java.io.OutputStreamWriter
        java.io.FileWriter
public void write(int c) throws IOException写一个字符
public void write(char[] cbuf) throws IOException写入一个字符数组。
public abstract void write(char[] cbuf,int off,int len) throws IOException写入字符数组的一部分。
public void write(String str)throws IOException写一个字符串
public void write(String str,int off,int len)throws IOException写一个字符串的一部分。
public abstract void flush()throws IOException刷新流。
public abstract void close()throws IOException关闭流，先刷新

注意：字符输出流是建议刷新，调用flush方法，字节输出流可以不用刷新！！！
 */
public class WriterDemo01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d.txt");
        fw.write(new char[]{'1','2','a','b'},1,2);
        fw.write("gegege",2,3);
        fw.flush();
        fw.close();

    }
}
