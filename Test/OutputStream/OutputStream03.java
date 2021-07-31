package com.hqyj.mc.Test.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
public FileOutputStream(String name,boolean append)throws FileNotFoundException创建文件输出流以指定的名称写入文件。
public FileOutputStream(File file,boolean append)throws FileNotFoundException
append参数值：
true:创建对象不会覆盖源文件，继续在文件末尾追加写入数据
false:创建一个新文件，覆盖源文件

换行：写换行符号
windows:\r\n
Linux: /n
mac: /r
 */
public class OutputStream03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("c.txt",false);
        for (int i = 0; i <10 ; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
    }
}
