package com.package2;

import com.package1.A;

/**
 * @author shaohai
 */
public class B {
    public String name;
    private int salary;

    public B(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        A personA = new A("小A", 10000);
        System.out.println(personA.name);               //在不同的包不同的类中,可以访问public属性
        System.out.println(personA.getName());          //在不同的包不同的类中,可以访问public方法
        //System.out.println(personA.salary);           // 不允许访问A的private属性 salary  编译不通过
        System.out.println(personA.getSalary());        //使用类A主动提供的public方法访问 私有的变量salary
    }
}
