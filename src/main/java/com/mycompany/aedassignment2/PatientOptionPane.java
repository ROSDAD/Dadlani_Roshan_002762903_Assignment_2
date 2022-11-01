/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.aedassignment2;

import java.util.ArrayList;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.MainHistory;
import model.MainModel;

/**
 *
 * @author rosha
 */
public class PatientOptionPane extends javax.swing.JPanel {
    MainHistory history;
    JSplitPane jSplitPane2;
    String UserId = "";
    String UserName = "";
    String Dob = "";
    String Gender = "";
    String Contact = "";
    String Address = "";
    
    /**
     * Creates new form PatientOptionPane
     */
    public PatientOptionPane(MainHistory history, JSplitPane jSplitPane1) {
        initComponents();
        this.history = history;
        this.jSplitPane2 = jSplitPane1;
        cityCombobox.removeAllItems();
        hospitalCombobox.removeAllItems();
        ArrayList<MainModel> MainM = history.getHistory();
        for(int i =0;i<MainM.size();i++){
            if(MainM.get(i).getSessionName()!=null){
                this.UserId = MainM.get(i).getSessionId();
                this.UserName = MainM.get(i).getSessionName();
                this.Gender = MainM.get(i).getSessionGender();
                this.Contact = MainM.get(i).getSessionContact();
                this.Address = MainM.get(i).getSessionAddress();
                this.Dob = MainM.get(i).getSessionDob();
            }
        } 
        displayAppointment(UserId);
        for(MainModel mainM : history.getHistory()){
                if(mainM.getCity()!=null){
                    cityCombobox.addItem(mainM.getCity());
                }
            }
        
        ArrayList<MainModel> mainM = history.getHistory();
            hospitalCombobox.removeAllItems();
            doctorCombobox.removeAllItems();
           
            int Flag = 0;
            int j = cityCombobox.getSelectedIndex();
            if(j!=-1){
            for (int i =0;i<mainM.get(j).getHospitalArray().size();i++){
                
                hospitalCombobox.addItem(mainM.get(j).getHospitalArray().get(i).getHospitalName());

            }
            
            
           
            Flag = 0;
            int k = hospitalCombobox.getSelectedIndex();
            if(k!=-1){
            for (int i =0;i<mainM.get(j).getHospitalArray().get(k).getDoctorArray().size();i++){
                
                doctorCombobox.addItem(mainM.get(j).getHospitalArray().get(k).getDoctorArray().get(i).getDoctorName());

            }

            if(cityCombobox.getSelectedIndex()!=-1 && hospitalCombobox.getSelectedIndex()!=-1){

        }
            }
            }
            inpName.setText(UserName);
            inpDob.setText(Dob);
            inpGender.setText(Gender);
            inpContact.setText(Contact);
            inpAddress.setText(Address);
            
            
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        createAppointment = new javax.swing.JButton();
        inpDate = new javax.swing.JTextField();
        cityCombobox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        hospitalCombobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        doctorCombobox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inpReason = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        appointmentTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        inpName = new javax.swing.JLabel();
        inpDob = new javax.swing.JLabel();
        inpGender = new javax.swing.JLabel();
        inpContact = new javax.swing.JLabel();
        inpAddress = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jLabel2.setText("NAME:");

        jLabel3.setText("DOB:");

        jLabel4.setText("CONTACT:");

        jLabel5.setText("ADDRESS:");

        jLabel6.setText("DATE");

        createAppointment.setText("CREATE APPOINTMENT");
        createAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAppointmentActionPerformed(evt);
            }
        });

        cityCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cityCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboboxActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("SELECT CITY");

        hospitalCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        hospitalCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalComboboxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("SELECT HOSPITAL");

        doctorCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        doctorCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorComboboxActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("SELECT DOCTOR");

        jLabel8.setText("REASON");

        jScrollPane2.setBackground(new java.awt.Color(0, 153, 153));

        appointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NAME", "DOB", "DATE", "DOCTOR", "HOSPITAL", "CITY", "REASON", "COMMENT"
            }
        ));
        jScrollPane2.setViewportView(appointmentTable);

        jLabel9.setText("GENDER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(createAppointment)))
                .addContainerGap(423, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hospitalCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(inpDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(inpReason, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(inpContact, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inpAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inpName, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(inpGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inpDob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpDob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpContact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel3);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("YOUR APPOINTMENTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(866, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cityComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityComboboxActionPerformed
            ArrayList<MainModel> mainM = history.getHistory();
            hospitalCombobox.removeAllItems();
            doctorCombobox.removeAllItems();
           
            int Flag = 0;
            int j = cityCombobox.getSelectedIndex();
            if(j!=-1){
            for (int i =0;i<mainM.get(j).getHospitalArray().size();i++){
                
                hospitalCombobox.addItem(mainM.get(j).getHospitalArray().get(i).getHospitalName());

            }
            }
            int k = hospitalCombobox.getSelectedIndex();
            if(k!=-1){
            for (int i =0;i<mainM.get(j).getHospitalArray().get(k).getDoctorArray().size();i++){
                
                doctorCombobox.addItem(mainM.get(j).getHospitalArray().get(k).getDoctorArray().get(i).getDoctorName());

            }
            }
    }//GEN-LAST:event_cityComboboxActionPerformed

    private void hospitalComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalComboboxActionPerformed
        ArrayList<MainModel> mainM = history.getHistory();
            
            doctorCombobox.removeAllItems();
            int j = cityCombobox.getSelectedIndex();
        int k = hospitalCombobox.getSelectedIndex();
            if(k!=-1){
            for (int i =0;i<mainM.get(j).getHospitalArray().get(k).getDoctorArray().size();i++){
               
                doctorCombobox.addItem(mainM.get(j).getHospitalArray().get(k).getDoctorArray().get(i).getDoctorName());

            }
            }
    }//GEN-LAST:event_hospitalComboboxActionPerformed

    private void doctorComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorComboboxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_doctorComboboxActionPerformed

    private void createAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAppointmentActionPerformed
                // TODO add your handling code here:
                
                String Name = inpName.getText();
                String DOB = inpDob.getText(); 
                String Contact = inpContact.getText();
                String Address = inpAddress.getText();
                String Date = inpDate.getText();
                String Reason = inpReason.getText();
                String Gender = inpGender.getText();
                if(Name != "" && DOB != "" && Contact != "" && Address != "" && Date != "" && Reason != ""){
                    int i = cityCombobox.getSelectedIndex();
                    int j = hospitalCombobox.getSelectedIndex();
                    int k = doctorCombobox.getSelectedIndex();
                ArrayList<MainModel> mainM = history.getHistory();
    


        int Flag = 0;

            if(mainM.get(i).getCity() == cityCombobox.getSelectedItem().toString() && mainM.get(i).getHospitalArray().get(j).getHospitalName() == hospitalCombobox.getSelectedItem().toString() && mainM.get(i).getHospitalArray().get(j).getDoctorArray().get(k).getDoctorName() == doctorCombobox.getSelectedItem().toString()){
                System.out.println("IDHR TAK TO POHOCH GAYA");
                for(int z=0;z<mainM.get(i).getHospitalArray().get(j).getDoctorArray().get(k).getAppointmentArray().size();z++){
                    if(mainM.get(i).getHospitalArray().get(j).getDoctorArray().get(k).getAppointmentArray().get(z).getAppointmentUserId().equals(UserId)){
                        if(mainM.get(i).getHospitalArray().get(j).getDoctorArray().get(k).getAppointmentArray().get(z).getAppointmentDate().equals(Date)){
                            Flag =1;
                        }
                    }
                }
                
                if(Flag == 0){

                    MainModel mainMo = mainM.get(i).getHospitalArray().get(j).getDoctorArray().get(k).addNewAppointment();
                    
                    mainMo.setAppointmentUserId(UserId);
                    mainMo.setAppointmentName(Name);
                    mainMo.setAppointmentContact(Contact);
                    mainMo.setAppointmentAddress(Address);
                    mainMo.setAppointmentDob(DOB);
                    mainMo.setAppointmentDate(Date);
                    mainMo.setAppointmentReason(Reason);
                    mainMo.setAppointmentGender(Gender);

                    displayAppointment(UserId);
                    
                }
                else{
                    System.out.println("Appointment on this Date with this doctor has already been made");
                }

            }
                }
    }//GEN-LAST:event_createAppointmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointmentTable;
    private javax.swing.JComboBox<String> cityCombobox;
    private javax.swing.JButton createAppointment;
    private javax.swing.JComboBox<String> doctorCombobox;
    private javax.swing.JComboBox<String> hospitalCombobox;
    private javax.swing.JLabel inpAddress;
    private javax.swing.JLabel inpContact;
    private javax.swing.JTextField inpDate;
    private javax.swing.JLabel inpDob;
    private javax.swing.JLabel inpGender;
    private javax.swing.JLabel inpName;
    private javax.swing.JTextField inpReason;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
    private void displayAppointment(String UserId) {
        DefaultTableModel model = (DefaultTableModel) appointmentTable.getModel();
        model.setRowCount(0);
        ArrayList<MainModel> mainM = history.getHistory();
        for(int i =0;i<mainM.size();i++){
            for(int q =0 ;q<mainM.get(i).getHospitalArray().size();q++){
                for(int w =0;w<mainM.get(i).getHospitalArray().get(q).getDoctorArray().size();w++){
                    for(int e =0 ;e<mainM.get(i).getHospitalArray().get(q).getDoctorArray().get(w).getAppointmentArray().size();e++){
                        if(mainM.get(i).getHospitalArray().get(q).getDoctorArray().get(w).getAppointmentArray().get(e).getAppointmentUserId().equals( UserId)){
                        Object[] row = new Object[8];
                            System.out.println("ADD to kiya");

                        row[0] = mainM.get(i).getHospitalArray().get(q).getDoctorArray().get(w).getAppointmentArray().get(e).getAppointmentName();
                        row[1] = mainM.get(i).getHospitalArray().get(q).getDoctorArray().get(w).getAppointmentArray().get(e).getAppointmentDob();
                        row[2] = mainM.get(i).getHospitalArray().get(q).getDoctorArray().get(w).getAppointmentArray().get(e).getAppointmentDate();
                        row[3] = mainM.get(i).getHospitalArray().get(q).getDoctorArray().get(w).getDoctorName();
                        row[4] = mainM.get(i).getHospitalArray().get(q).getHospitalName();
                        row[5] = mainM.get(i).getCity();
                        row[6] = mainM.get(i).getHospitalArray().get(q).getDoctorArray().get(w).getAppointmentArray().get(e).getAppointmentReason();
                        row[7] = mainM.get(i).getHospitalArray().get(q).getDoctorArray().get(w).getAppointmentArray().get(e).getAppointmentComment();
                        model.addRow(row);
                        }
                    }
                }
            }
        }
              
        
        

    }
}
