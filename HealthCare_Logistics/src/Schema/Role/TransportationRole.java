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
public class TransportationRole extends Role{
    
@Override
public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
return new TransportationWorkAreaJPanel(userProcessContainer,account,organization,business);
}

@Override
public String toString() {
    return "Transportation Role";
}
    
    
}
