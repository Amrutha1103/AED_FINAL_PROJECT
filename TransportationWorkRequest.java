/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Schema.WorkQueue;

import Schema.UserAccount.UserAccount;

/**
 *
 * @author asr
 */
public class TransportationWorkRequest  extends WorkRequest {
    private String senderName;
    private String time;
    private String timezone;
    private String vehicleNumber;
    private String hospitalName;
    private String message;
    private String urgency;
    private String equipmentinfo;
    private int uniqueId;
    private static int count=11001;
    private int requestId;

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getEquipmentinfo() {
        return equipmentinfo;
    }

    public void setEquipmentinfo(String equipmentinfo) {
        this.equipmentinfo = equipmentinfo;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        TransportationWorkRequest.count = count;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }
    
    
    
    public TransportationWorkRequest(){
        count++;
        uniqueId=count;
    }
    
    @Override
    public String toString(){
        return this.senderName;
    }
    
    
}
