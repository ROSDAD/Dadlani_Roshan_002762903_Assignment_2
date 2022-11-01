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
  
    
      private String PersonName;
      private String PersonId;
      private String PersonPass;
      private String PersonRole;
      private String PersonAddress;
      private String PersonContact;
      private String PersonDob;
      private String PersonGender;
      private String PersonCity;
      
      private String SessionPass;
      private String SessionRole;
      private String SessionId;
      private String SessionName;
      private String SessionGender;
      private String SessionAddress;
      private String SessionContact;
      private String SessionDob;
      

      
      private String City;
      
      private ArrayList<HospitalAction> hospitalArray = new ArrayList();

      private ArrayList<MainModel> PersonArray = new ArrayList();
      private ArrayList<MainModel> sessionArray = new ArrayList();

      


   public MainModel addNewSession(){
        MainModel mainModel = new MainModel();
        this.sessionArray.add(mainModel);
        return mainModel;
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
   public void setSessionAddress(String SessionAddress) {
        this.SessionAddress = SessionAddress;
    }
   public String getSessionAddress() {
        return SessionAddress;
    }
   public void setSessionContact(String SessionContact) {
        this.SessionContact = SessionContact;
    }
   public String getSessionContact() {
        return SessionContact;
    }
   public void setSessionDob(String SessionDob) {
        this.SessionDob = SessionDob;
    }
   public String getSessionDob() {
        return SessionDob;
    }
   public void setSessionGender(String SessionGender) {
        this.SessionGender = SessionGender;
    }
   public String getSessionGender() {
        return SessionGender;
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
    public HospitalAction addNewHospital(){
        HospitalAction mainModel = new HospitalAction();
        this.hospitalArray.add(mainModel);
        return mainModel;
    }
    public ArrayList<HospitalAction> getHospitalArray() {
        return hospitalArray;
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
    public void setPersonAddress(String PersonAddress) {
        this.PersonAddress = PersonAddress;
    }
    public String getPersonAddress() {
        return PersonAddress;
    }
    public void setPersonContact(String PersonContact) {
        this.PersonContact = PersonContact;
    }
    public String getPersonContact() {
        return PersonContact;
    }
    public void setPersonCity(String PersonCity) {
        this.PersonCity = PersonCity;
    }
    public String getPersonCity() {
        return PersonCity;
    }
    public void setPersonDob(String PersonDob) {
        this.PersonDob = PersonDob;
    }
    public String getPersonDob() {
        return PersonDob;
    }
    public void setPersonGender(String PersonGender) {
        this.PersonGender = PersonGender;
    }
    public String getPersonGender() {
        return PersonGender;
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

    public void setCity(String City) {
        this.City = City;
    }
    public String getCity() {
        return City;
    }




}
