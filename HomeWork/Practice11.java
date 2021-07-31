package com.hqyj.mc.HomeWork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//从控制台接收3名学员的信息，每条信息存储到一个Student对象中，
// 将多个Student对象存储到一个集合中。
// 输入完毕后，将所有学员信息存储到文件Student.txt中。
// 每名学员信息存储一行，多个属性值中间用逗号隔开。
public class Practice11 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student > list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        FileWriter fr = new FileWriter("Student.txt");
        System.out.println("请输入学生信息(格式为：学生名字-学号-年龄，输入完毕请输入end)");
        while (true){
            String s = sc.next();
            if ("end".equals(s)){
                break;
            }
            String[] str = s.split("-");
            Student stu = new Student(str[0],str[1],str[2]);
            list.add(stu);
        }
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            fr.write(student.getXuehao()+","+student.getName()+","+student.getAge()+"\r\n");
        }
        fr.flush();
        fr.close();
    }
}
