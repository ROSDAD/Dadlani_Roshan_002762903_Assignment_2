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
public class HospitalAction {
    private String HospitalName;
    private long HospitalContact;
      private String HospitalAddress;
      private String HospitalAdmin;
      private ArrayList<DoctorAction> DoctorArray = new ArrayList();
      
    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }
    public void setHospitalAdmin(String HospitalAdmin) {
        this.HospitalAdmin = HospitalAdmin;
    }
    public String getHospitalName() {
        return HospitalName;
    }
    public void setHospitalContact(long HospitalContact) {
        
        this.HospitalContact = HospitalContact;
    }
    public long getHospitalContact() {
        return HospitalContact;
    }
    
    public void setHospitalAddress(String HospitalAddress) {
        
        this.HospitalAddress = HospitalAddress;
    }
    public String getHospitalAddress() {
        return HospitalAddress;
    }
    
    public DoctorAction addNewDoctor(){
        DoctorAction doctorM = new DoctorAction();
        this.DoctorArray.add(doctorM);
        return doctorM;
    }
//    public void deleteDoctor(int i, int j, int k, MainHistory history){
//        
//        ArrayList<MainModel> mainModel = history.getHistory();
//        mainModel.get(i).getHospitalArray().get(j).getDoctorArray().get(k).setDoctorUserId(null);
//        mainModel.get(i).getHospitalArray().get(j).getDoctorArray().get(k).setDoctorName(null);
//        mainModel.get(i).getHospitalArray().get(j).getDoctorArray().get(k).setDoctorAddress(null);
//        
//        
//    }
    public ArrayList<DoctorAction> getDoctorArray() {
        return DoctorArray;
    }
    public void deleteHospital(int i, int j, MainHistory history){
        
        ArrayList<MainModel> mainModel = history.getHistory();
        mainModel.get(i).getHospitalArray().get(j).setHospitalName(null);
        mainModel.get(i).getHospitalArray().get(j).setHospitalAddress(null);
        
        
    }
    
}
