package com.hqyj.mc.Test.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        /**
         * public void write(byte[] b)throws IOException
         * 将b.length字节从指定的字节数组写入此输出流。
         * 如果写的正数(0~127),就会查询ASCII码表，显示对应的字母
         * 如果写的负数，那么第一个和第二个字节会组成一个中文，就会查询系统默认编码表（GBK）
         */
        FileOutputStream fos = new FileOutputStream("b.txt");
        byte[] bytes = {67,68,69,70};
        fos.write(bytes);
        /**
         * public void write(byte[] b,int off,int len)throws IOException
         * 从指定的字节数组写入len字节，从偏移off开始输出到此输出流。
         */
        fos.write(bytes,1,2);
        fos.close();
    }
}
