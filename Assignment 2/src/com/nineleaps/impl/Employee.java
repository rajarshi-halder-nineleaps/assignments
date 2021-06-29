package com.nineleaps.impl;

public class Employee {

    String empId, empName;

    public Employee(String id, String Name) {
        this.empId = id;
        this.empName = Name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Employee() {

    }

    void addEmployee(String id,String Name) {
        this.empId=id;
        this.empName=Name;
    }
}


