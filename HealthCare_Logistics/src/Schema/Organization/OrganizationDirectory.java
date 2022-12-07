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
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    public OrganizationDirectory () {
    organizationList = new ArrayList<>();
    }
    
    
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization createOrganization(Organization.OrganizationType type){
Organization organization = null;
if (type.getValue().equals(Organization.OrganizationType.Doctor.getValue())){
organization = new DoctorOrganization();
organizationList.add(organization);
}

else if (type.getValue().equals(Organization.OrganizationType.Pharmacy.getValue())){
organization=new PharmacyOrganization();
organizationList.add(organization);
}

else if (type.getValue().equals(Organization.OrganizationType.Supplier.getValue())){
organization=new SupplierOrganization();
organizationList.add(organization);
}

else if (type.getValue().equals(Organization.OrganizationType.MedicalEquipment.getValue())){
organization=new EquipmentHandlingOrganization();
organizationList.add(organization);
}
else if (type.getValue().equals(Organization.OrganizationType.Transport.getValue())){
organization=new TransportOrganization();
organizationList.add(organization);
}
return organization;
}
    
}
