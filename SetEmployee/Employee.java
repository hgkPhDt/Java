package com.blogspot.terminaltion.firstprogram;

public class Employee extends People {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{ name=" + getName()+
                " age="+ getAge()+
                " salary=" + salary +
                " }";
    }
}
