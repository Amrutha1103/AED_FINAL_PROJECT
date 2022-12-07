/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Organization;

import java.util.ArrayList;

/**
 *
 * @author amruthaedara
 */
public class EquipmentHandlingOrganization extends Organization {
    
    public EquipmentHandlingOrganization(){
         super(Organization.OrganizationType.MedicalEquipment.getValue());
    }
    
    
    @Override 
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MedicalEquipmentRole());
        return roles;
    }
    
}
