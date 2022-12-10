/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Enterprise;

import Schema.Organization.Organization;
import Schema.Organization.OrganizationDirectory;

/**
 *
 * @author asr
 */
public abstract class Enterprise extends Organization {
private EnterpriseType enterpriseType;
private OrganizationDirectory organizationDirectory;
private String zipcode;

public Enterprise(String name, EnterpriseType type) {
super(name);
this.enterpriseType = type;
organizationDirectory = new OrganizationDirectory();
}

public enum EnterpriseType{
Hospital("Hospital"),
Supplier("Supplier"),
Logistics("Logistics"),
Pharmacy("Pharmacy"),
MedicalEquipmentWareHouse("MedicalEquipmentWareHouse");

private String value;

private EnterpriseType(String value) {
this.value = value;
}

public String getValue() {
return value;
}

@Override
public String toString() {
return value;
}
}

public EnterpriseType getEnterpriseType() {
return enterpriseType;
}

public OrganizationDirectory getOrganizationDirectory() {
return organizationDirectory;
}

public String getZipcode() {
return zipcode;
}

public void setZipcode(String zipcode) {
this.zipcode = zipcode;
}

}

