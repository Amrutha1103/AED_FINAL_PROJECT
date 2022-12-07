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
public class PharmacyOrganization extends Organization{
    
private ArrayList<PharmaInventory> medList;
public PharmacyOrganization()
 {
super(Organization.OrganizationType.Pharmacy.getValue());
medList=new ArrayList<PharmaInventory>();
}


    
    
    
}
