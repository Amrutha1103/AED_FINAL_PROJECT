/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Role;

import Schema.EcoSystem;
import Schema.Organization.Organization;
import Schema.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author amruthaedara
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"), 
        Doctor("Doctor"),
        Logistics("Logistics"), 
        Pharmacist("Pharmacist");
        
        private String value;
        private RoleType(String value){
            this.value = value;
            }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override 
        public String toString(){
            return value;
        }
    }
    
    public abstract JPanel createWorkArea (JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network);
    @Override
    public String toString(){
        return this.getClass().getName();
    }
    
 
    
}
