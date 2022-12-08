/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Employee;

import java.util.ArrayList;

/**
 *
 * @author amruthaedara
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;
   
    public EmployeeDirectory (){
        employeeList = new ArrayList<>();
        }
    
    
    public ArrayList<Employee> getEmployeeList(){
        return employeeList;
    }
    
    public Employee createEmployee(String EmployeeName) {
        Employee employee = new Employee();
        employee.setName(EmployeeName);
        employeeList.add(employee);
        return employee;
    }
    
}
