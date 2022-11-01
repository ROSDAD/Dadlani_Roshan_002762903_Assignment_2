/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aedassignment2;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author LENOVO
 */
public class FieldsValidation {
    
     String nums[] = {"0","1","2","3","4","5","6","7","8","9"};
     String symbols[] = {",","<",">",".","?","/","\"",":",";","'","{","[","}","]","!","@","#","$","%","^","&","*","(",")","-","_","+","=","~","`"};
    
     
    public boolean verifyName(String name){
       for (String n : nums) 
        { 
            if( name.contains(n)){
                return false;
            }
        }   
        for (String s : symbols) 
        { 
            if( name.contains(s)){
                return false;
            }
        }               
        return true;
    }
    
    public boolean verifyContact(String num){
           
        //verifying cell phone number
        if(num.matches("[0-9]+") && num.length() == 10){       
                return true;
        }               
            return false;
    }
    
    public boolean verifyAdress(String address){
        for (String s : symbols) 
        { 
            if( address.contains(s)){
                return false;
            }
        }  
        return true;        
    }
    
    public boolean verifyDate(String address){
        for (String s : symbols) 
        { 
            if( address.contains(s)){
                return false;
            }
        }  
        return true;        
    }
    
    public boolean verifyBloodPressure(String bp){
        if (bp.matches("[0-9]+")){       
                return true;
        }               
            return false;     
    }
    
    public boolean verifyDOB(String dob){
        System.out.println("******DATE:" + dob + "********");
        String dateFormat = "M-dd-yyy";
        LocalDate localDate = LocalDate.now(ZoneId.systemDefault());

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);
	LocalDate inputDate = LocalDate.parse(dob, dtf);
        System.out.println("******inputDate:" + inputDate + "********");
        System.out.println("******localDate:" + localDate + "********");
        
	System.out.println("******" + inputDate.isAfter(localDate) + "************");
        
        return inputDate.isAfter(localDate);
    }
    
}
