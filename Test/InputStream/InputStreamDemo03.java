package com.hqyj.mc.Test.InputStream;

import java.io.*;
/*
使用字节流读取中文文件：
1个中文
GBK：占用两个字节
UTF-8：占用三个字节
注：使用字节流读取文本文件中的数据时，可能会有一个小问题。
就是在遇到中文数据的时候，可能不会显示完整的字符，那是因为一个中文字符可能占用多个字节存储。
所以Java提供了一些字符流类，以字符为单位读写数据，专门用来处理文本文件
 */
public class InputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("b.txt");
        int len = 0;
        while ((len=fis.read())!=-1){
            System.out.println((char)len);
        }
        fis.close();
    }
}
