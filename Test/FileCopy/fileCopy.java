package com.hqyj.mc.Test.FileCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
图片文件复制：一边读一边写
数据源：d:\\1.jpg
数据的目的地：e:\\1.jpg
文件复制的步骤：
1.创建一个字节输入流对象，构造方法中要绑定要读取的数据源
2.创建一个字节输出流对象，构造方法中要绑定要写入的数据的目的地
3.使用read()和write()方法，一边读一边写
4.释放资源

复制文件共消耗：3毫秒
 */
public class fileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\1.jpg");
        FileOutputStream fos = new FileOutputStream("F:\\1.jpg");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
