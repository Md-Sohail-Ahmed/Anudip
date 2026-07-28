package functionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class EmployeeInfo{
    String name;
    String dept;
    double salary;

    public EmployeeInfo(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

public class Employee {
    public static void main(String[] args) {
        List<EmployeeInfo> l= List.of(new EmployeeInfo("Sohail","Engineer",5000),
                new EmployeeInfo("mayur","Eingineer",40000),
                new EmployeeInfo("surajit","HR",70000)
                );


        l.stream()
                .filter(e->e.salary>=70000)
                .map(e->e.name)
                .forEach(System.out::println);


        EmployeeInfo highest=l.stream()
                .max(Comparator.comparingInt(e-> (int) e.salary))
                .get();
        System.out.println("highest pay:"+highest.salary);

        double total=l.stream()
                .mapToDouble(e->e.salary)
                .sum();
        System.out.println("total:"+total);
    }
}
