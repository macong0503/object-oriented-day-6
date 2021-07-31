package com.hqyj.mc.Test.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
续写和换行：
public FileWriter(String fileName,boolean append)throws IOException
append参数值：
true:创建对象不会覆盖源文件，继续在文件末尾追加写入数据
false:创建一个新文件，覆盖源文件

换行：写换行符号
windows:\r\n
Linux: /n
mac: /r
 */
public class WriterDemo03 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("e.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("我是嫩爹"+i+"\r\n");
        }
        fw.flush();
        fw.close();
    }
}
