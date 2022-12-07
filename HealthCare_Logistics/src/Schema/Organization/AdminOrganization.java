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
public class AdminOrganization extends Organization {
    
    public String getOrganizationName() {
        return organizationName;
    }

    
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
    
    public AdminOrganization(){
        super(OrganizationType.Admin.getValue());
    }
    
    
    @Override
    
     public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
    
    
}
