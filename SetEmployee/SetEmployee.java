package com.blogspot.terminaltion.firstprogram;

import java.util.Locale;
import java.util.Scanner;

class SetEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee[] employee = new Employee[3];

        for (int i = 0; i < employee.length; i++) {
            employee[i] = new Employee();
            System.out.println("Set the data of employee #"+i);
            System.out.print("Write the name: ");
            employee[i].setName(sc.nextLine());
            System.out.print("Write the age: ");
            employee[i].setAge(sc.nextInt());
            System.out.print("Write the salary: ");
            employee[i].setSalary(sc.nextDouble());
            sc.nextLine();
            System.out.println();
        }

        double media = 0;
        for (Employee value : employee) {
            media += value.getSalary();
        }
        media /= employee.length;

        System.out.println("Average salary of employees: " + media);
        sc.close();
    }
}