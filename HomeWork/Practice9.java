package com.hqyj.mc.HomeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice9 {
    public static void main(String[] args) throws IOException {
        FileInputStream fr = new FileInputStream("D:\\Idea\\华清代码\\j210701\\面向对象编程\\day06\\src\\com\\hqyj\\mc\\HomeWork\\test.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        int count = 0;
        while ((len = fr.read())!=-1){
            if ((char) len == 'a'){
                count++;
            }
        }
        System.out.println("a的个数为："+count);
        fr.close();
    }
}
