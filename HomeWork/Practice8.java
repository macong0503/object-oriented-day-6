package com.hqyj.mc.HomeWork;

import com.sun.jnlp.ClipboardServiceImpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Practice8 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("score.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            String s1 = prop.getProperty(s);
            if (s.equals("lisi")){
                s1 = "100";
                prop.setProperty(s,s1);
                prop.store(new FileWriter("score.txt"),"haha");
            }

            System.out.println(s+"="+s1);

        }
    }
}
