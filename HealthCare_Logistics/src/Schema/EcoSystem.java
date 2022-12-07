/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema;

import java.util.ArrayList;


/**
 *
 * @author amruthaedara
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    
public static EcoSystem getInstance() {
if (business == null) {
business = new EcoSystem();
}
return business;
}


public EcoSystem() {
super(null);
networkList = new ArrayList<>();
}



public ArrayList<Network> getNetworkList() {
return networkList;
}



public Network createAndAddNetwork() {
Network network = new Network();
networkList.add(network);
return network;
}

@Override
public ArrayList<Role> getSupportedRole() {
ArrayList<Role> roleList = new ArrayList<>();
roleList.add(new SysAdminRole());
return roleList;
}


public boolean checkIfUsernameIsUnique(String username) {



if (!this.getUserAccountDirectory().checkIFUsernameIsunique(username)) {
return false;
}
return true;
}
    
    
    
    
}
