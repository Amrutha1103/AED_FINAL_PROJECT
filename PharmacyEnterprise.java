/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schema.Enterprise;
import Schema.Role.Role;
import Schema.WorkQueue.WorkQueue;
import Schema.WorkQueue.WorkRequest;
import java.util.ArrayList;


/**
 *
 * @author asr
 */
public class PharmacyEnterprise extends Enterprise {
    private WorkQueue equipmentworkqueue;
    public PharmacyEnterprise(String name){
        super(name, Enterprise.EnterpriseType.Pharmacy);
        equipmentworkqueue=new WorkQueue();
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        return null;
    }
}
