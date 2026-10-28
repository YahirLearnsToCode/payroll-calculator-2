package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private double hoursWorked;
    private double payrate;

    public Employee(String employeeId, String name, double hoursWorked, double payrate) {
        this.employeeId = employeeId;
        this.payrate = payrate;
        this.hoursWorked = hoursWorked;
        this.name = name;
    }

    public double getGrossPay() {
        return this.hoursWorked * this.payrate;
    }

    //region Getters and setters
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPayrate(double payrate) {
        this.payrate = payrate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getPayrate() {
        return payrate;
    }
    //endregion//
}

