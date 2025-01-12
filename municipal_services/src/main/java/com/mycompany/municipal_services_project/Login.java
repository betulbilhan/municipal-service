/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bp2_p1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    public static String TC;
    
    public Login() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_forgot = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();
        txt_tc_log = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        lbl_surname = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        btn_forgot.setBackground(new java.awt.Color(0, 153, 153));
        btn_forgot.setForeground(new java.awt.Color(0, 255, 0));
        btn_forgot.setText("I forgot my password");
        btn_forgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_forgotActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Password:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("TC number:");

        btn_login.setBackground(new java.awt.Color(0, 153, 153));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(0, 255, 0));
        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_register.setBackground(new java.awt.Color(0, 153, 153));
        btn_register.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_register.setForeground(new java.awt.Color(0, 255, 0));
        btn_register.setText("REGISTER");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        txt_tc_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tc_logActionPerformed(evt);
            }
        });

        lbl_password.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(0, 255, 102));
        lbl_password.setText("at least 4 ,max 15 character or digit");

        lbl_surname.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl_surname.setForeground(new java.awt.Color(255, 0, 0));
        lbl_surname.setPreferredSize(new java.awt.Dimension(168, 16));

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("LOGIN");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icons8-Windows-8-User-Interface-Login.24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        btn_delete.setBackground(new java.awt.Color(0, 153, 153));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(0, 255, 0));
        btn_delete.setText("DELETE ACCOUNT");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(57, 57, 57)
                .addComponent(txt_tc_log, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(lbl_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(68, 68, 68)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(lbl_password))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(btn_forgot))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_delete)
                .addGap(40, 40, 40)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btn_register))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txt_tc_log, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(lbl_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(lbl_password)
                .addGap(18, 18, 18)
                .addComponent(btn_forgot)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_login)
                        .addComponent(btn_delete))
                    .addComponent(btn_register)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_forgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_forgotActionPerformed
        
               this.setVisible(false);
               new forgot_password().setVisible(true);
                
    }//GEN-LAST:event_btn_forgotActionPerformed
// First of all, it checks whether the user entered REGEX appropriate text and then whether it matches the database.
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        
       
        Pattern p_tc=Pattern.compile("^[0-9]{11}$");
        Pattern p_pass=Pattern.compile("^[a-zA-Z0-9]{4,15}$",Pattern.CASE_INSENSITIVE);
        
        Matcher m_tc = p_tc.matcher(txt_tc_log.getText());
        if(!m_tc.matches()){
          JOptionPane.showMessageDialog(rootPane, "It must consist of 11 integers");
          txt_tc_log.setText(null);}
        
        Matcher m_pass = p_pass.matcher(txt_password.getText());
        if(!m_pass.matches()){
          JOptionPane.showMessageDialog(rootPane, "AT LEAST 4, MAX 15 CHARACTER OR DIGIT!!!");
          txt_password.setText(null);
        }
        if(txt_password!=null&&txt_tc_log!=null){
            DB_Manager.SearchByTC(txt_tc_log.getText());
            try{
                if(DB_Manager.pass_value.equals(txt_password.getText())){
                TC=txt_tc_log.getText();
                new Main_Menu().setVisible(true);this.setVisible(false);}
               else{
               JOptionPane.showMessageDialog(rootPane, " WRONG PASSWORD");
               txt_password.setText(null); 
               
            }

            }
            catch(NullPointerException ex){
               JOptionPane.showMessageDialog(rootPane, " WRONG TC NUMBER");
          txt_password.setText(null);
          txt_tc_log.setText(null);
            }
            
        }
        
         
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // TODO add your handling code here:
            new register().setVisible(true);this.setVisible(false);
        
    }//GEN-LAST:event_btn_registerActionPerformed

    private void txt_tc_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tc_logActionPerformed
      
    }//GEN-LAST:event_txt_tc_logActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        
    }//GEN-LAST:event_txt_passwordActionPerformed
//the user can delete her account from database with the help of DeleteByTC method which is in the class DB_Manager 
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        Pattern p_tc=Pattern.compile("^[0-9]{11}$");
        Pattern p_pass=Pattern.compile("^[a-zA-Z0-9]{4,15}$",Pattern.CASE_INSENSITIVE);
        
        Matcher m_tc = p_tc.matcher(txt_tc_log.getText());
        if(!m_tc.matches()){
          JOptionPane.showMessageDialog(rootPane, "It must consist of 11 integers");
          txt_tc_log.setText(null);}
        
        Matcher m_pass = p_pass.matcher(txt_password.getText());
        if(!m_pass.matches()){
          JOptionPane.showMessageDialog(rootPane, "AT LEAST 4, MAX 15 CHARACTER OR DIGIT!!!");
          txt_password.setText(null);
        }
        if(txt_password!=null&&txt_tc_log!=null){
            DB_Manager.DeleteByTC(txt_tc_log.getText());
            JOptionPane.showMessageDialog(rootPane, "Your account has been successfully deleted");
            
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_forgot;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_surname;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_tc_log;
    // End of variables declaration//GEN-END:variables
}
