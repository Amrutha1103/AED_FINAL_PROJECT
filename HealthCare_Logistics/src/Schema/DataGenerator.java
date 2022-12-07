/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema;

import java.util.Random;

/**
 *
 * @author amruthaedara
 */
public class DataGenerator {
    private static String[] equipmentName = {"Oxygen Cylinders","Covid Testing Kits","PulseOxymeters","Stethescope", "Thermometer", "Syringe", "Beds", "BP Kits", "Diabetes Machines"};
    private static String[] medicineName = {"Synthroid", "Crestor", "Ventolin", "esomeprazole", "insulin", "infliximab", "fluticasone", "rosuvastatin"};
    private static String[] network = {"Boston", "Seattle", "Washington DC", "FLORIDA"};
    private static String[] hospitalName = {"AH", "TGH", "General Hospitals", "Smile Hospitals", "Cape cod", "Boston Medical", "Brigham"};
    private static String[] beginning = {"kr", "ca", "Ra", "Ho", "Lj", "pg", "kre", "lop", "mat"};
    private static String[] middle = {"air", "cal", "Pla", "ghdo", "kal", "hkg", "pokre", "lojop", "mploat"};
    private static String[] organisationName = {"Doctor", "Pharmacy", "Supplier", "Transportation", "Equipment"};
    private static String[] vaccinationName = {"Meningococcal", "Tdap", "HPV", "Seasonal Flu", "Varicella", "Hepititis B", "MMR"};
    
    private static Random rand = new Random();
    
    
    public static String generateEquipmentName() {
        return equipmentName[rand.nextInt(equipmentName.length)];
    }

    
    
    public static String generateNetwork() {
        return network[rand.nextInt(network.length)];
    }

    
    
    public static String generateSuppliers() {

        return beginning[rand.nextInt(beginning.length)] + middle[rand.nextInt(middle.length)];
    }

    
    
    public static String generatePaitents() {

        return beginning[rand.nextInt(beginning.length)] + middle[rand.nextInt(middle.length)];
    }

    
    
    public static String generateHospitalName() {
        return hospitalName[rand.nextInt(hospitalName.length)];
    }

    
    
    public static String generationOrganisationName() {
        return organisationName[rand.nextInt(organisationName.length)];
    }

    
    
    public static String generateVaccineName() {
        return vaccinationName[rand.nextInt(vaccinationName.length)];

    }

    
    
    public static String generateMedicine() {

        return medicineName[rand.nextInt(medicineName.length)];
    }
    
    
    
    public static HealthcareEquipmentWorkRequest InitMedicalRequest() {
        HealthcareEquipmentWorkRequest request = new HealthcareEquipmentWorkRequest();
        request.setEquipmentName(generateEquipmentName());
        request.setNetwork(generateNetwork());
        return request;
    }

    
    
    public static PharmacyWorkRequest InitSupplierInfo() {
        PharmacyWorkRequest request = new PharmacyWorkRequest();
        request.setSupplierName(generateSuppliers());
        request.setNetwork(generateNetwork());
        return request;
    }

    
    public static DoctorWorkRequest InitPaitenceInfo() {
    DoctorWorkRequest request = new DoctorWorkRequest();
    request.setHospitalName(generateHospitalName());
    request.setPatientName(generatePaitents());
    return request;
    }

    
    public static AdminOrganization InitOrgName() {
    AdminOrganization request = new AdminOrganization();
    request.setOrganizationName(generationOrganisationName());
    return request;
    }

    
    public static Product InitVaccineName() {
    Product request = new Product();
        request.setNameOfVaccine(generateVaccineName());
        request.setNameOfHospital(generateHospitalName());
        return request;
    }

    
    
    public static Product InitMedicineName() {
     Product request = new Product();
       request.setNameOfMedicine(generateMedicine());
       return request;
    }
    }
    

