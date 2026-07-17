package com.inheritance;
import java.util.Scanner;
public class Employee extends User{
    Employee(int id, String name) {
        super(id, name);
    }
    double calculateAnnualSalary(int salary){
        return salary*12;
    }
}
