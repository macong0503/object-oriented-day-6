package com.hqyj.mc.Test.Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
java.io.Reader
    java.io.InputStreamReader
        java.io.FileReader
public FileReader(String fileName)throws FileNotFoundException

public int read()throws IOException
spublic int read(char[] cbuf)throws IOException将字符读入数组。
 */
public class ReaderDemo01 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("b.txt");
        int len = 0;
        while ((len = fr.read())!=-1){
            System.out.println((char) len);
        }
        fr.close();
    }
}
