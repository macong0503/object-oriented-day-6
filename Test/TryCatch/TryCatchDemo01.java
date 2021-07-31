package com.hqyj.mc.Test.TryCatch;

import java.io.FileWriter;
import java.io.IOException;
/*
在JDK1.7之前使用try...catch...finally处理流中的异常和释放资源
格式：
try{
可能出现异常的代码
}cath(异常类型 变量名){
 异常的处理逻辑
}finally{
释放资源
}
 */
public class TryCatchDemo01 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("f.txt", false);
            for (int i = 1; i <= 10; i++) {
                fw.write("我是嫩爹" + i + "\r\n");
            }
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}