package com.nineleaps;



import com.nineleaps.impl.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
        // write your code
            Scanner sc2=new Scanner(System.in);
            List<Employee> employeeList= new ArrayList<>();
            add10Employees(employeeList);

            System.out.println("do u want to add an employee?? press y or n");
            while(sc2.next().equals("y")){
                addNew(sc2, employeeList);
                System.out.println("do u want to add an employee?? press y or n");
            }

            System.out.println("The list of employees is");
            printAllEmployees(employeeList);

    }

    public static void add10Employees(List<Employee> employeeList){
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=10;i++){
            System.out.println("Enter Employee : "+ (i));
            String name= sc.nextLine();
            employeeList.add(new Employee(Integer.toString(i),name));
        }

    }

    public static void addNew(Scanner sc2, List<Employee> employeeList){
        System.out.println("Enter the new employee details");
        String id= String.valueOf(employeeList.size());
        String name= sc2.next();
        Employee newEmployee = new Employee(id, name);
        employeeList.add(newEmployee);
        System.out.println("the new number of employee is "+employeeList.size());
    }

    public static void printAllEmployees(List<Employee> employeeList){
        for (Employee employee : employeeList){
            System.out.println(employee.getEmpId() + " "+ employee.getEmpName());
        }
    }
}
