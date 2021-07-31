package com.hqyj.mc.Test.Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
java.util.Hashtable<Object,Object>
    java.util.Properties
1.Properties表示一个持久的属性集，Properties 可以保存在流中或者从流中加载
2.Properties 集合唯一一个和IO流相关的集合
3.Properties 集合中的store方法，把集合中临时数据，持久化写入到硬盘存储
4.Properties 集合中的load方法，把硬盘中保存的文件（键值对），读取到集合中使用

注意1：是个双列集合，key和value都是String类型
注意2：
1）存储键值对的文件中，建和值的连接符号可以使用=，空格（其他符号）
2）存储键值对的文件中，可以使用#进行注释，被注释的键值对不会再被读取了
3）存储键值对的文件中，键和值默认都是都是字符串，不用再加上引号
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        show3();
    }
    public static void show1(){
        Properties prop = new Properties();
        prop.setProperty("张艺兴","breaking");
        prop.setProperty("王一博","poping");
        prop.setProperty("王嘉尔","hip-hop");
        prop.setProperty("钟汉良","urban");
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            String s1 = prop.getProperty(s);
            System.out.println(s+"="+s1);
        }
    }
    public static void show2() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("张艺兴","breaking");
        prop.setProperty("王一博","poping");
        prop.setProperty("王嘉尔","hip-hop");
        prop.setProperty("钟汉良","urban");
        prop.store(new FileWriter("f.txt"),"hahaha");
    }
    public static void show3() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("f.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            String s1 = prop.getProperty(s);
            System.out.println(s+" "+s1);
        }

    }
}
