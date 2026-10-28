package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingEmployee {
    public static void main(String[] args) {
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("employees.csv"));

            String input;

            while ((input = bufReader.readLine()) != null ) {
                String[] employeeSplit = input.split("\\|");

                String empID = employeeSplit[0];
                String empName = employeeSplit[1];
                double empHoursWorked = Double.parseDouble(employeeSplit[2]);
                double empPayrate = Double.parseDouble(employeeSplit[3]);

                Employee employee = new Employee(empID,empName,empHoursWorked,empPayrate);

                System.out.printf("Employee ID: %s Employee Name: %s Gross Pay: %.2f \n",employee.getEmployeeId(),employee.getName(), employee.getGrossPay());
            }

        }
        catch (IOException e) {
           e.printStackTrace();

        }
    }
}
