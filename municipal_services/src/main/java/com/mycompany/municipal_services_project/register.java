/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bp2_p1;

//import java.awt.FlowLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author btlbi
 */
public class register extends javax.swing.JFrame {

    String date;
    String name,surname,password,gender,tc;
    static String cbox_pass_reminder;
    static String txt_pass_reminder;

    public register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spinner_day = new javax.swing.JSpinner();
        lbl_ = new javax.swing.JLabel();
        lbl_1 = new javax.swing.JLabel();
        lbl_2 = new javax.swing.JLabel();
        lbl_3 = new javax.swing.JLabel();
        rbutton_fm = new javax.swing.JRadioButton();
        rbutton_m = new javax.swing.JRadioButton();
        lbl_4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_password_reg = new javax.swing.JTextField();
        txt_name_reg = new javax.swing.JTextField();
        txt_surname_reg = new javax.swing.JTextField();
        txt_tc_reg = new javax.swing.JTextField();
        lbl_name_reg = new javax.swing.JLabel();
        lbl_surname_reg = new javax.swing.JLabel();
        lbl_tc_reg = new javax.swing.JLabel();
        btn_register = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbox_password_save = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_password_save = new javax.swing.JTextField();
        CheckBox1 = new javax.swing.JCheckBox();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("REGISTER");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fatcow-Farm-Fresh-Database-edit.32.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        spinner_day.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.WEEK_OF_MONTH));

        lbl_.setBackground(new java.awt.Color(0, 255, 51));
        lbl_.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lbl_.setForeground(new java.awt.Color(0, 255, 0));
        lbl_.setText("Name:");

        lbl_1.setBackground(new java.awt.Color(0, 255, 51));
        lbl_1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lbl_1.setForeground(new java.awt.Color(0, 255, 0));
        lbl_1.setText("TC Number:");

        lbl_2.setBackground(new java.awt.Color(0, 255, 51));
        lbl_2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lbl_2.setForeground(new java.awt.Color(0, 255, 0));
        lbl_2.setText("Gender:");

        lbl_3.setBackground(new java.awt.Color(0, 255, 51));
        lbl_3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lbl_3.setForeground(new java.awt.Color(0, 255, 0));
        lbl_3.setText("Surname:");

        buttonGroup1.add(rbutton_fm);
        rbutton_fm.setForeground(new java.awt.Color(0, 255, 0));
        rbutton_fm.setText("FEMALE");
        rbutton_fm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbutton_fmActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbutton_m);
        rbutton_m.setForeground(new java.awt.Color(0, 255, 0));
        rbutton_m.setText("MALE");
        rbutton_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbutton_mActionPerformed(evt);
            }
        });

        lbl_4.setBackground(new java.awt.Color(0, 255, 51));
        lbl_4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lbl_4.setForeground(new java.awt.Color(0, 255, 0));
        lbl_4.setText("Password:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Day:");

        txt_password_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_password_regActionPerformed(evt);
            }
        });

        txt_name_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_name_regActionPerformed(evt);
            }
        });

        txt_surname_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_surname_regActionPerformed(evt);
            }
        });

        txt_tc_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tc_regActionPerformed(evt);
            }
        });

        lbl_name_reg.setForeground(new java.awt.Color(255, 0, 0));

        lbl_surname_reg.setForeground(new java.awt.Color(255, 0, 0));

        lbl_tc_reg.setForeground(new java.awt.Color(255, 0, 0));

        btn_register.setBackground(new java.awt.Color(0, 153, 153));
        btn_register.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_register.setForeground(new java.awt.Color(0, 255, 0));
        btn_register.setText("REGISTER");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 255, 0));
        jLabel7.setText("Choose a question to recover your password");

        cbox_password_save.setForeground(new java.awt.Color(0, 102, 102));
        cbox_password_save.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "name of primary school teacher", "name of your first pet" }));
        cbox_password_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_password_saveActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 255, 0));
        jLabel8.setText("Enter your answer:");

        txt_password_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_password_saveActionPerformed(evt);
            }
        });

        CheckBox1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        CheckBox1.setForeground(new java.awt.Color(255, 0, 0));
        CheckBox1.setText("I consent to the use of my information by the government");
        CheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox1ActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(0, 153, 153));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(0, 255, 0));
        btn_back.setText("Back to login");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_2)
                        .addGap(18, 18, 18)
                        .addComponent(rbutton_fm)
                        .addGap(18, 18, 18)
                        .addComponent(rbutton_m))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinner_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_password_save, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_name_reg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_4)
                                            .addComponent(lbl_1)
                                            .addComponent(lbl_3)
                                            .addComponent(lbl_))
                                        .addGap(62, 62, 62)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl_surname_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_surname_reg, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                            .addComponent(txt_tc_reg, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                            .addComponent(lbl_tc_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_password_reg, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                            .addComponent(txt_name_reg)))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(179, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_password_save, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_name_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_surname_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_surname_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tc_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_tc_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_4)
                    .addComponent(txt_password_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbox_password_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_2)
                    .addComponent(rbutton_fm)
                    .addComponent(rbutton_m))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinner_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addComponent(CheckBox1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_surname_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_surname_regActionPerformed
        
    }//GEN-LAST:event_txt_surname_regActionPerformed

    private void txt_name_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_name_regActionPerformed
       
    }//GEN-LAST:event_txt_name_regActionPerformed

    private void rbutton_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbutton_mActionPerformed
        if(rbutton_m.isSelected()){
            gender="Male"; }
    }//GEN-LAST:event_rbutton_mActionPerformed

    private void rbutton_fmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbutton_fmActionPerformed
        // TODO add your handling code here:
        if(rbutton_fm.isSelected()){
            gender="Female"; }
    }//GEN-LAST:event_rbutton_fmActionPerformed
/*User can add her info. to info_table in MySQL with the help of AddPerson method.
In addition, its reminder info. also passing to the info_table to using later in case of forget*/
    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        
         Pattern p=Pattern.compile("^[\\w&&[^0-9]]{3,40}$",Pattern.CASE_INSENSITIVE);
         Pattern p_tc=Pattern.compile("^[0-9]{11}$");
         Pattern p_pass=Pattern.compile("^[a-zA-Z0-9]{4,15}$",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(txt_surname_reg.getText());
        if(!m.matches()){
          lbl_surname_reg.setText("only letters"); 
          txt_surname_reg.setText(null);}
        
        Matcher m_name = p.matcher(txt_name_reg.getText());
        if(!m_name.matches()){
          lbl_name_reg.setText("only letters"); 
          txt_name_reg.setText(null);}
        
        Matcher m_tc = p_tc.matcher(txt_tc_reg.getText());
        if(!m_tc.matches()){
          JOptionPane.showMessageDialog(rootPane, "It must consist of 11 integers");
          txt_tc_reg.setText(null);}
        
        Matcher m_pass = p_pass.matcher(txt_password_reg.getText());
        if(!m_pass.matches()){
          JOptionPane.showMessageDialog(rootPane, "AT LEAST 4, MAX 15 CHARACTER OR DIGIT!!!");
          txt_password_reg.setText(null);}
        
        
        if(cbox_password_save.getSelectedIndex()!=-1&&(rbutton_fm.isSelected()||rbutton_m.isSelected())&&txt_tc_reg!=null&&CheckBox1.isSelected()&&
                txt_password_reg!=null&&txt_name_reg!=null&&txt_surname_reg!=null&&txt_password_save!=null&&CheckBox1.isSelected()){
            cbox_pass_reminder=cbox_password_save.getSelectedItem().toString();
            txt_pass_reminder=txt_password_save.getText();
            name=txt_name_reg.getText(); surname=txt_surname_reg.getText();password=txt_password_reg.getText(); tc=txt_tc_reg.getText();
            date=spinner_day.getValue().toString();
            
            JOptionPane.showMessageDialog(rootPane, "successful");
            DB_Manager.AddPerson(tc, name, surname, password, gender, date,cbox_pass_reminder,txt_pass_reminder);
            
        
        }
        else{
            btn_register.setEnabled(false);
            
        }
        

    }//GEN-LAST:event_btn_registerActionPerformed

    private void txt_tc_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tc_regActionPerformed
        
    }//GEN-LAST:event_txt_tc_regActionPerformed

    private void txt_password_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_password_regActionPerformed
       
    }//GEN-LAST:event_txt_password_regActionPerformed

    private void txt_password_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_password_saveActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_password_saveActionPerformed

    private void CheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox1ActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_btn_backActionPerformed

    private void cbox_password_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_password_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_password_saveActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox1;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_register;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbox_password_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_3;
    private javax.swing.JLabel lbl_4;
    private javax.swing.JLabel lbl_name_reg;
    private javax.swing.JLabel lbl_surname_reg;
    private javax.swing.JLabel lbl_tc_reg;
    private javax.swing.JRadioButton rbutton_fm;
    private javax.swing.JRadioButton rbutton_m;
    private javax.swing.JSpinner spinner_day;
    private javax.swing.JTextField txt_name_reg;
    private javax.swing.JTextField txt_password_reg;
    private javax.swing.JTextField txt_password_save;
    private javax.swing.JTextField txt_surname_reg;
    private javax.swing.JTextField txt_tc_reg;
    // End of variables declaration//GEN-END:variables
}
