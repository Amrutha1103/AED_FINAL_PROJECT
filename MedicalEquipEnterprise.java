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
public class MedicalEquipEnterprise extends Enterprise {
    private WorkQueue equipmentworkqueue;
    public MedicalEquipEnterprise(String name){
        super(name, Enterprise.EnterpriseType.MedicalEquipmentWareHouse);
        equipmentworkqueue=new WorkQueue();
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        return null;
    }
    public WorkQueue getEquipmentworkqueue(){
        return equipmentworkqueue;
    }
    public void setEquipmentworkqueue(WorkQueue equipmentworkqueue) {
        this.equipmentworkqueue = equipmentworkqueue;
    }
}
