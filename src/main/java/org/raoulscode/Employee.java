package org.raoulscode;

public class Employee {
    private int employeeeId;
    private String name;
    private String department;
    private String email;
    private int age;
    private int leaveBalance = 20;


    public Employee(int employeeeId, String name, String department, String email, int age) {
        this.employeeeId = employeeeId;
        this.name = name;
        this.department = department;
        this.email = email;
        this.age= age;
    }

    public int getEmployeeeId() {
        return employeeeId;
    }

    public void setEmployeeeId(int employeeeId) {
        this.employeeeId = employeeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLeaveBalance() {
        return leaveBalance;
    }

    public void setLeaveBalance(int leaveBalance) {
        if (leaveBalance >= 0) {
            this.leaveBalance = leaveBalance;
        } else {
            System.out.println("Leave balance cannot be negative.");
        }
    }
}