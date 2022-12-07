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
public class TransportOrganization extends Organization{
    public TransportOrganization(){
super(Organization.OrganizationType.Transport.getValue());
    
}
    
@Override
public ArrayList<Role> getSupportedRole(){
    ArrayList<Role> roles = new ArrayList<>();
    roles.add(new TransportationRole());
    return roles;
}
    
    
}
