package com_hspedu_pkg;

public class Encamp {
    public static void main(String[] args) {
        person p=new person();
        p.setName("韩宇");
        p.setAge(20);
        p.setSalary(30000);
        System.out.println(p.info());
    }
}

class person{
    public String name;//名字公开
    private int age;//姓名隐私
    private double salary;//工资绝对不能透露哎
    //这个时候用快捷键搞 set 和 get （alt+insert) F12旁边的那个，全选的时候按住 ctrl 然后鼠标点击

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String info(){
        return "信息为 " + name + "age = " + age + "月薪 = " + salary;
    }
}