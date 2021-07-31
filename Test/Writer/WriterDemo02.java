package com.hqyj.mc.Test.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
flush方法和close方法的区别：
flush方法：刷新缓冲区，流对象是可以继续使用的
close方法：先刷新缓冲区，然后通知系统释放资源。流对象不可以继续使用的。
 */
public class WriterDemo02 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d.txt");
        fw.write(69);
        fw.flush();//刷新流
        fw.write(67);
        fw.flush();
        fw.close();

         /*
        以下代码报异常
        Exception in thread "main" java.io.IOException: Stream closed
        fw.close();
        fw.write(99);
        fw.flush();*/
    }
}
