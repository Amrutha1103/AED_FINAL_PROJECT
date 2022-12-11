/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Network;

import Schema.Enterprise.EnterpriseDirectory;


/**
 *
 * @author amruthaedara
 */
public class Network {

private String name;
private EnterpriseDirectory enterpriseDirectory;

public Network(){
    enterpriseDirectory = new EnterpriseDirectory();
}

    public String getName() {
    
        return name;
    }

    public void setName(String name) {
    
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
    
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
    
    
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    
    @Override
    public String toString() {
        return name;
    }
}


    
}

