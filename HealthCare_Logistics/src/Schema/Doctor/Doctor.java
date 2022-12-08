/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Doctor;

/**
 *
 * @author amruthaedara
 */
public class Doctor {
    private String Name;
    private PrescriptionList prescriptionlist;
    
    public String getName() {
        return Name;
    }

    
    public void setName(String Name) {
        this.Name = Name;
    }

    
    public PrescriptionList getPrescriptionlist() {
        return prescriptionlist;
    }

    
    public void setPrescriptionlist(PrescriptionList prescriptionlist) {
        this.prescriptionlist = prescriptionlist;
    }
    
    
    public Doctor(){
        prescriptionlist = new PrescriptionList();
    }
    
    
    
}
