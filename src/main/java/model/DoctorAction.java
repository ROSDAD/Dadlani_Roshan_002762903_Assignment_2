/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rosha
 */
public class DoctorAction {
        private String DoctorName;
        private String doctorUserId;
        private String DoctorAddress;
        private long DoctorContact;
        private ArrayList<AppointmentArray> appointmentArray = new ArrayList();
    
    public void deleteDoctor(int i, int j, int k, MainHistory history){
        
        ArrayList<MainModel> mainModel = history.getHistory();
        mainModel.get(i).getHospitalArray().get(j).getDoctorArray().get(k).setDoctorUserId(null);
        mainModel.get(i).getHospitalArray().get(j).getDoctorArray().get(k).setDoctorName(null);
        mainModel.get(i).getHospitalArray().get(j).getDoctorArray().get(k).setDoctorAddress(null);
        
        
    }
    
    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }
    public String getDoctorName() {
        return DoctorName;
    }
    public void setDoctorContact(long DoctorContact) {
        this.DoctorContact = DoctorContact;
    }
    public long getDoctorContact() {
        return DoctorContact;
    }
    public void setDoctorAddress(String DoctorAddress) {
        this.DoctorAddress = DoctorAddress;
    }
    public String getDoctorAddress() {
        return DoctorAddress;
    }
    public void setDoctorUserId(String DoctorUserId) {
        this.doctorUserId = DoctorUserId;
    }
    public String getDoctorUserId() {
        return doctorUserId;
    }
    
    
     public AppointmentArray addNewAppointment(){
        AppointmentArray appointmentM = new AppointmentArray();
        this.appointmentArray.add(appointmentM);
        return appointmentM;
    }
   public ArrayList<AppointmentArray> getAppointmentArray() {
        return appointmentArray;
    }
    
}
