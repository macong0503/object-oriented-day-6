package com.hqyj.mc.HomeWork;

public class Student {
    private String name;
    private String xuehao;
    private String  age;

    public Student() {
    }

    public Student(String name, String xuehao, String  age) {
        this.name = name;
        this.xuehao = xuehao;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String  age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", xuehao='" + xuehao + '\'' +
                ", age=" + age +
                '}';
    }
}
