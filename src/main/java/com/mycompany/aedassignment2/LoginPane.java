/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.aedassignment2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.MainHistory;
import model.MainModel;

/**
 *
 * @author rosha
 */
public class LoginPane extends javax.swing.JPanel {
    MainHistory history;
    JSplitPane jSplitPane2;
    int cityArraySize;
    /**
     * Creates new form LoginPane
     */
    public LoginPane(MainHistory history, JSplitPane jSplitPane1,int cityArraySize) {
        initComponents();
        this.history = history;
        this.jSplitPane2 = jSplitPane1;
        this.cityArraySize = cityArraySize;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inpUserId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        inpPass = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setText("USER ID:");

        jLabel2.setText("PASSWORD:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("HOSPITAL MANAGEMENT SYSTEM");

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inpUserId, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(inpPass)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inpUserId, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(inpPass))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String UserId = inpUserId.getText();
        int Flag = 0;
        String UserPass = inpPass.getText();
       
        ArrayList<MainModel> mainM = history.getHistory();
        for(int i =0;i<mainM.size();i++){

                if(UserId.equals(mainM.get(i).getPersonId())){
                    Flag =1;
                    if(UserPass.equals(mainM.get(i).getPersonPassword())){
                        if(mainM.get(i).getPersonRole() == "Patient"){
                            MainModel mainModel = history.addNewSession();
                            mainModel.setSessionName(mainM.get(i).getPersonName());
                            mainModel.setSessionRole(mainM.get(i).getPersonRole());
                            mainModel.setSessionId(mainM.get(i).getPersonId());
                            mainModel.setSessionPass(mainM.get(i).getPersonPassword());
                            mainModel.setSessionAddress(mainM.get(i).getPersonAddress());
                            mainModel.setSessionContact(mainM.get(i).getPersonContact());
                            mainModel.setSessionDob(mainM.get(i).getPersonDob());
                            mainModel.setSessionGender(mainM.get(i).getPersonGender());
                            PatientOptionPane obj = new PatientOptionPane(history,jSplitPane2);
                            jSplitPane2.setRightComponent(obj);
                        }
                        if(mainM.get(i).getPersonRole() == "SystemAdmin"){
                            MainModel mainModel = history.addNewSession();
                            mainModel.setSessionName(mainM.get(i).getPersonName());
                            mainModel.setSessionRole(mainM.get(i).getPersonRole());
                            mainModel.setSessionId(mainM.get(i).getPersonId());
                            mainModel.setSessionPass(mainM.get(i).getPersonPassword());
                            mainModel.setSessionAddress(mainM.get(i).getPersonAddress());
                            mainModel.setSessionContact(mainM.get(i).getPersonContact());
                            mainModel.setSessionDob(mainM.get(i).getPersonDob());
                            mainModel.setSessionGender(mainM.get(i).getPersonGender());
                            SystemAdminPane obj = new SystemAdminPane(history,jSplitPane2);
                            jSplitPane2.setRightComponent(obj);
                        }if(mainM.get(i).getPersonRole() == "Doctor"){
                            MainModel mainModel = history.addNewSession();
                            mainModel.setSessionName(mainM.get(i).getPersonName());
                            mainModel.setSessionRole(mainM.get(i).getPersonRole());
                            mainModel.setSessionId(mainM.get(i).getPersonId());
                            mainModel.setSessionPass(mainM.get(i).getPersonPassword());
                            mainModel.setSessionAddress(mainM.get(i).getPersonAddress());
                            mainModel.setSessionContact(mainM.get(i).getPersonContact());
                            mainModel.setSessionDob(mainM.get(i).getPersonDob());
                            mainModel.setSessionGender(mainM.get(i).getPersonGender());
                            DoctorOptionPane obj = new DoctorOptionPane(history,jSplitPane2,mainM.get(i).getPersonId());
                            jSplitPane2.setRightComponent(obj);
                        }
                        if(mainM.get(i).getPersonRole() == "CommunityAdmin"){
                            MainModel mainModel = history.addNewSession();
                            mainModel.setSessionName(mainM.get(i).getPersonName());
                            mainModel.setSessionRole(mainM.get(i).getPersonRole());
                            mainModel.setSessionId(mainM.get(i).getPersonId());
                            mainModel.setSessionPass(mainM.get(i).getPersonPassword());
                            mainModel.setSessionAddress(mainM.get(i).getPersonAddress());
                            mainModel.setSessionContact(mainM.get(i).getPersonContact());
                            mainModel.setSessionDob(mainM.get(i).getPersonDob());
                            mainModel.setSessionGender(mainM.get(i).getPersonGender());
                            CommunityOptionPane obj = new CommunityOptionPane(history,jSplitPane2);
                            jSplitPane2.setRightComponent(obj);
                        }
                        
                        LogoutPane obj = new LogoutPane(history,jSplitPane2,cityArraySize);
                        jSplitPane2.setLeftComponent(obj);
                    }else{
                        JOptionPane.showMessageDialog(this, "Password Incorrect");
                        return;
                    }
                }

        }
        if(Flag == 0){
            JOptionPane.showMessageDialog(this, "USER DOESN'T EXIST");
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField inpPass;
    private javax.swing.JTextField inpUserId;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
