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
public class Organization {
    
private String name;
private WorkQueue workQueue;
private EmployeeDirectory employeeDirectory;
private UserAccountDirectory userAccountDirectory;
private int organizationID;
private static int counter;


private HealthcareEquipmentWorkRequest medreq;
private ArrayList<DoctorPrescription> pList;

public enum OrganizationType{
Admin("Admin Organization"), Doctor("Doctor Organization"),Operations("Operations Organization"),
Pharmacy("Pharmacy Organization"),Supplier("Supplier Organization"),MedicalEquipment("Equipment Organization"),
Transport("Transportation Organization");

private String value;

private OrganizationType(String value) {
this.value = value;
    }

public String getValue() {
return value;
    }
}
public Organization(String name) {
this.name = name;
workQueue = new WorkQueue();
employeeDirectory = new EmployeeDirectory();
userAccountDirectory = new UserAccountDirectory();
organizationID = counter;
pList=new ArrayList<DoctorPrescription>();
++counter;
}


public abstract ArrayList<Role> getSupportedRole();
public UserAccountDirectory getUserAccountDirectory() {
return userAccountDirectory;
}

public int getOrganizationID() {
return organizationID;
}

public EmployeeDirectory getEmployeeDirectory() {
return employeeDirectory;
}
public String getName() {
return name;
}
public WorkQueue getWorkQueue() {
return workQueue;
}
public void setName(String name) {
this.name = name;
}
public void setWorkQueue(WorkQueue workQueue) {
this.workQueue = workQueue;
}


@Override
public String toString() {
return name;
}
    
}
