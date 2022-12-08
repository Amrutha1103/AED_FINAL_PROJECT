/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Employee;

/**
 *
 * @author amruthaedara
 */
public class Employee {
    private String EmployeeName;
    private int EmployeeId;
    private static int count = 1;
    
    
    public Employee() {
        EmployeeId = count;
        count++;
    }
    
    public int getEmployeeId(){
        return EmployeeId;
    }
    public void setName (String EmployeeName){
        this.EmployeeName=EmployeeName;
        }
    public String getEmployeeName(){
        return EmployeeName;
        }
    
    @Override
    public String toString(){
        return EmployeeName;
    }
    
}
