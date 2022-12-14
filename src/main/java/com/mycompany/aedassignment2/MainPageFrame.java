/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.aedassignment2;

import java.util.ArrayList;
import model.DoctorAction;
import model.HospitalAction;
import model.MainHistory;
import model.MainModel;

/**
 *
 * @author rosha
 */
public class MainPageFrame extends javax.swing.JFrame {
    MainHistory history;
    String[] cityarray = {"Boston","New York","Los Angeles"};
    String[] userId = {"admin","patient1","patient2","doctor1","doctor2","community1","community2"};
    String[] userName = {"admin","patient1","patient2","doctor1","doctor2","community1","community2"};
    String[] userPass = {"12345","12345","12345","12345","12345","12345","12345"};
    String[] userRole = {"SystemAdmin","Patient","Patient","Doctor","Doctor","CommunityAdmin","CommunityAdmin"};
    String[] HospitalArray = {"Fortis Hospital","Apollo Hospital","Leelavati Hospital"};
    String[] HospitalAddress = {"Left","Right","Top"};
    
    String[] doctorCityArray = {"Boston","New York"};
    String[] doctorHospitalArray = {"Fortis Hospital","Apollo Hospital"};
    String[] userAddress = {"Left","Right","Left","Right","Left","Right","Left"};
    String[] userDob = {"20/2/2010","25/1/2000","22/2/2008","20/5/2010","20/2/2007","2/2/2002","5/6/2011"};
    String[] userContact = {"1234567980","1237894560","7894561230","8973214560","6542317890","1237890456","7564891230"};
    String[] userGender = {"Male","Female","Male","Female","Male","Male","Female"};
    String[] userCity = {"Boston","New York","Los Angeles","Boston","New York","Los Angeles","Boston"};
    
    /**
     * Creates new form MainLoginPage
     */
    public MainPageFrame() {
        initComponents();
        history = new MainHistory();
        
        for(int i=0; i < cityarray.length;i++){
            MainModel mainM = history.addNewCity();
            
            mainM.setCity(cityarray[i]);
//            
//            System.out.println(mainM);
        }
        int Hospitaladmincount = 1;
        for(int i = 0 ; i< HospitalArray.length ; i++){
            ArrayList<MainModel> MainMo = history.getHistory();
            HospitalAction mainmodel = MainMo.get(i).addNewHospital();
            mainmodel.setHospitalName(HospitalArray[i]);
            mainmodel.setHospitalAddress(HospitalAddress[i]);

            
        }
        int DoctorCount = 0;
        for(int i = 0;i<userId.length;i++){
            ArrayList<MainModel> MainMo = history.getHistory();
            MainModel MainMod = history.addNewPerson();
            MainMod.setPersonId(userId[i]);
            MainMod.setPersonName(userName[i]);
            MainMod.setPersonPassword(userPass[i]);
            MainMod.setPersonRole(userRole[i]);
            MainMod.setPersonCity(userCity[i]);
            MainMod.setPersonAddress(userAddress[i]);
            MainMod.setPersonDob(userDob[i]);
            MainMod.setPersonContact(userContact[i]);
            MainMod.setPersonGender(userGender[i]);

            if(userRole[i] == "Doctor"){
                
                int z = findIndex(cityarray,doctorCityArray[DoctorCount]);
                for(int t = 0;t<MainMo.get(z).getHospitalArray().size();t++ ){
                    if(MainMo.get(findIndex(cityarray,doctorCityArray[DoctorCount])).getHospitalArray().get(t).getHospitalName().equals(doctorHospitalArray[DoctorCount])){
                DoctorAction mainmodel = MainMo.get(findIndex(cityarray,doctorCityArray[DoctorCount])).getHospitalArray().get(t).addNewDoctor();
                mainmodel.setDoctorName(userName[i]);
                mainmodel.setDoctorUserId(userId[i]);
//                mainmodel.setDoctorContact(long.parseLong(userContact[i]));
                mainmodel.setDoctorAddress(userAddress[i]);
                DoctorCount ++ ;
                }
                }
                
            }
            
            
        }
      
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("HOSPITAL MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(455, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("WELCOME");

        jButton3.setText("SIGN IN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("SIGN UP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SignupPane obj = new SignupPane(history, jSplitPane1,cityarray.length);
        jSplitPane1.setLeftComponent(obj);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        LoginPane obj = new LoginPane(history,jSplitPane1,cityarray.length);
        jSplitPane1.setLeftComponent(obj); 
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
//        jSplitPane1.setLeftComponent(obj);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
public static int findIndex(String[] arr, String t)
    {
  
        // if array is Null
        if (arr == null) {
            return -1;
        }
  
        // find length of array
        int len = arr.length;
        int i = 0;
  
        // traverse in the array
        while (i < len) {
  
            // if the i-th element is t
            // then return the index
            if (arr[i].equals(t)) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
}
