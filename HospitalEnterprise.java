/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Enterprise;
import Schema.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author asr
 */

public class HospitalEnterprise extends Enterprise {
    public HospitalEnterprise(String name){
        super (name, EnterpriseType.Hospital);
        
    }
    @Override
    public ArrayList<Role> getSupportedRole(){
        return null;
    }
}