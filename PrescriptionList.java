/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.Doctor;

import java.util.ArrayList;

/**
 *
 * @author amruthaedara
 */
public class PrescriptionList {
    
    
    private ArrayList<DoctorPrescription> prescriptionlist;
    public ArrayList<DoctorPrescription> getPrescriptionlist() {
        return prescriptionlist;
    }
    
    public void setPrescriptionlist(ArrayList<DoctorPrescription> prescriptionlist) {
        this.prescriptionlist = prescriptionlist;
    }
    
    
    public DoctorPrescription addDoctorPrescription(){
        DoctorPrescription prescription = new DoctorPrescription();
        prescriptionlist.add(prescription);
        return prescription;
    }
    
    
    
}
