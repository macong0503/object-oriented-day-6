package com.hqyj.mc.Test.TryCatch;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
JDK1.7新特性：
在try的后面可以增加一个小括号（）,在小括号中定义流对象，那么这个流对象的作用域就在try中有效，
try中的代码执行完毕，会自动把流对象释放，就不用再写finally了

格式:
try(定义流对象1 定义流对象2...）{
可能出现异常的代码
}cath(异常类型 变量名){
 异常的处理逻辑
}
 */
public class TryCatchDemo03 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("D:\\1.jpg"); FileOutputStream fos = new FileOutputStream("F:\\1.jpg")){
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes))!=-1){
                fos.write(bytes);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
