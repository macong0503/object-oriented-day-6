package com.hqyj.mc.HomeWork;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字
//将学生信息保存到D盘下面的stu.txt文件中，一个学生信息占据一行数据。
//当用户输入end时停止输入。
public class Practice10 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\Idea\\华清代码\\j210701\\面向对象编程\\day06\\src\\com\\hqyj\\mc\\HomeWork\\stu.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号和学生姓名(格式为：学号-学生名字，输入完毕请输入end)： ");
        while (true) {
            String s = sc.next();
            if (s.equals("end")){
                break;
            }
            fw.write(s+"\r\n");
        }
        fw.flush();
        fw.close();
    }
}
