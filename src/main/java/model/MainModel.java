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
    MainHistory history;
    
      private String Name;
      
      private int Age;    
      private String Gender;
      private String HospitalName;
      private String DoctorName;
      private String doctorUserId;
      private String DoctorAddress;
      private long DoctorContact;
      private String PersonName;
      private String PersonId;
      private String PersonPass;
      private String PersonRole;
      private String SessionPass;
      private String SessionRole;
      private String SessionId;
      private String SessionName;
      private String appointmentUserId;
      private String appointmentName;
      private String appointmentDob;
      private String appointmentContact;
      private String appointmentDate;
      private String appointmentAddress;
      private String appointmentReason;
      private String appointmentComment;
      
      private long HospitalContact;
      private String HospitalAddress;
      private String HospitalAdmin;
      
      private String City;
      
      private ArrayList<MainModel> hospitalArray = new ArrayList();
      private ArrayList<MainModel> DoctorArray = new ArrayList();
      private ArrayList<MainModel> PersonArray = new ArrayList();
      private ArrayList<MainModel> sessionArray = new ArrayList();
      private ArrayList<MainModel> appointmentArray = new ArrayList();
      


   public MainModel addNewSession(){
        MainModel mainModel = new MainModel();
        this.sessionArray.add(mainModel);
        return mainModel;
    }
   public MainModel addNewAppointment(){
        MainModel mainModel = new MainModel();
        this.appointmentArray.add(mainModel);
        return mainModel;
    }
   public ArrayList<MainModel> getAppointmentArray() {
        return appointmentArray;
    }
   public void setAppointmentUserId(String appointmentUserId) {
        this.appointmentUserId = appointmentUserId;
    }
   public void setAppointmentName(String AppointmentName) {
        this.appointmentName = AppointmentName;
    }
   public void setAppointmentDob(String AppointmentDob) {
        this.appointmentDob = AppointmentDob;
    }
   public void setAppointmentContact(String AppointmentContact) {
        this.appointmentContact = AppointmentContact;
    }
   public void setAppointmentDate(String AppointmentDate) {
        this.appointmentDate = AppointmentDate;
    }
   public void setAppointmentAddress(String AppointmentAddress) {
        this.appointmentAddress = AppointmentAddress;
    }
   public void setAppointmentReason(String AppointmentReason) {
        this.appointmentReason = AppointmentReason;
    }
   public void setAppointmentComment(String AppointmentComment) {
        this.appointmentComment = AppointmentComment;
    }
   public String getAppointmentUserId() {
        return appointmentUserId;
    }
   public String getAppointmentDate() {
        return appointmentDate;
    }
   public String getAppointmentName() {
        return appointmentName;
    }
   public String getAppointmentContact() {
        return appointmentContact;
    }
   public String getAppointmentAddress() {
        return appointmentAddress;
    }
   public String getAppointmentReason() {
        return appointmentReason;
    }
   public String getAppointmentComment() {
        return appointmentComment;
    }
   public String getAppointmentDob() {
        return appointmentDob;
    }
   public void setSessionName(String SessionName) {
        this.SessionName = SessionName;
    }
   public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }
   public void setSessionPass(String SessionPass) {
        this.SessionPass = SessionPass;
    }
   public void setSessionRole(String SessionRole) {
        this.SessionRole = SessionRole;
    }
   public String getSessionName() {
        return SessionName;
    }
    public String getSessionRole() {
        return SessionRole;
    }
    public String getSessionId() {
        return SessionId;
    }
    public String getSessionPassword() {
        return SessionPass;
    }
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
    public String getPersonId() {
        return PersonId;
    }
    public String getPersonPassword() {
        return PersonPass;
    }
    public MainModel addNewDoctor(){
        MainModel mainModel = new MainModel();
        this.DoctorArray.add(mainModel);
        return mainModel;
    }
    public ArrayList<MainModel> deleteDoctor(int i, int j, int k, MainHistory history){
        this.history = history;
        ArrayList<MainModel> mainModel = history.getHistory();
        mainModel.get(i).getHospitalArray().get(j).getDoctorArray().remove(mainModel);
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
    public void setCity(String City) {
        this.City = City;
    }
    public String getCity() {
        return City;
    }


}
