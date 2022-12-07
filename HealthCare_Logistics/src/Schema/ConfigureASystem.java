/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema;

/**
 *
 * @author amruthaedara
 */
public class ConfigureASystem {
    public static EcoSystem Configure(){
        EcoSystem system = EcoSystem.getInstance();
        Employee employee = system.getEmployeeDirectory().createEmployee("YGS");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("neu","neu",employee,new SysAdminRole());
        return system;
    }
    
}
