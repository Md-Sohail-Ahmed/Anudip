package com.inheritance;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your employee id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        Employee e = new Employee(id, name);

        System.out.println("Enter your salary:");
        int salary = sc.nextInt();

        System.out.println("Your annual salary is :"+e.calculateAnnualSalary(salary));
    }
}