package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {

    public static void main(String []args){
        List<Employee> employees = new ArrayList<>();
        employees.add(new EmployeeDB("123", "john", "wick", "john@wick.com"));

        //employees.add(new EmployeeLdap("1234", "sam", "manual", "sam@manual.com")); not viable since employeeLdap doesnot implement employee interface
        EmployeeLdap employeeLdap = new EmployeeLdap("1234", "sam", "manual", "sam@manual.com");
        employees.add(new EmployeeLdapAdapter(employeeLdap));
        System.out.print(employees);
    }
}
