/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class MainModel {
      private String Name;
      private int EmployeeID;
      private int Age;    
      private String Gender;
      private String HospitalName;
      private String DoctorName;
      private String PersonName;
      private String PersonId;
      private String PersonPass;
      private String PersonRole;
      
      private long HospitalContact;
      private String HospitalAddress;
      private String Level;
      private String City;
      private String Team_Info;
      private String Position_title;
      private Long Cell_phone_number;  //2
      private String Email_address;
      private String Photo;
      private ArrayList<MainModel> hospitalArray = new ArrayList();
      private ArrayList<MainModel> DoctorArray = new ArrayList();
      private ArrayList<MainModel> PersonArray = new ArrayList();


   
    public MainModel addNewHospital(){
        MainModel mainModel = new MainModel();
        this.hospitalArray.add(mainModel);
        return mainModel;
    }
    public ArrayList<MainModel> getHospitalArray() {
        return hospitalArray;
    }
    public MainModel addNewPerson(){
        MainModel mainModel = new MainModel();
        this.PersonArray.add(mainModel);
        return mainModel;
    }
    public ArrayList<MainModel> getPersonArray() {
        return PersonArray;
    }
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }
    public void setPersonRole(String PersonRole) {
        this.PersonRole = PersonRole;
    }
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }
    public void setPersonPassword(String PersonPass) {
        this.PersonPass = PersonPass;
    }
    public String getPersonName() {
        return PersonName;
    }
    public String getPersonRole() {
        return PersonRole;
    }
    public String getPersonUserId() {
        return PersonId;
    }
    public String getPersonUserPass() {
        return PersonPass;
    }
    public MainModel addNewDoctor(){
        MainModel mainModel = new MainModel();
        this.DoctorArray.add(mainModel);
        return mainModel;
    }
    public ArrayList<MainModel> getDoctorArray() {
        return DoctorArray;
    }
    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }
    public String getDoctorName() {
        return DoctorName;
    }
    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
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
    public void setCity(String City) {
        this.City = City;
    }
    public String getCity() {
        return City;
    }


}
