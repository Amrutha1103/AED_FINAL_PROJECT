/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.WorkQueue;

/**
 *
 * @author asr
 */
public class HealthcareEquipmentWorkRequest extends WorkRequest {
    private float actualprice;
    private float loanedprice;
    private String equipmentName;
    private String expectedArrivalTime;
    private String urgencyLevel;
    private String hospitalName;
    private int quantity;
    private String network;
    private String transportrequestStatus;

    public float getActualprice() {
        return actualprice;
    }

    public void setActualprice(float actualprice) {
        this.actualprice = actualprice;
    }

    public float getLoanedprice() {
        return loanedprice;
    }

    public void setLoanedprice(float loanedprice) {
        this.loanedprice = loanedprice;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    public void setExpectedArrivalTime(String expectedArrivalTime) {
        this.expectedArrivalTime = expectedArrivalTime;
    }

    public String getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getTransportrequestStatus() {
        return transportrequestStatus;
    }

    public void setTransportrequestStatus(String transportrequestStatus) {
        this.transportrequestStatus = transportrequestStatus;
    }
    
    @Override
    public String toString(){
        return this.equipmentName;
    }
    
}
