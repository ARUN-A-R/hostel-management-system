/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dbmslab.hostelmanager;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author cy34
 */
public class addInmate extends javax.swing.JFrame {
    
    
    // create variables for database connection
    Connection con = null;
    Statement st = null;
    PreparedStatement pst = null;  
    ResultSet rs = null;
    

    /**
     * Creates new form addInmate
     */
    public addInmate() {
        initComponents();
        
        // initialize mysql connection
        try {
            final String URL = "jdbc:mysql://localhost:3306/hostelDB";
            final String username = "hosteluser";
            final String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
                        con = DriverManager.getConnection(URL, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(addInmate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // add the existing rows to the JTable
        update_table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void update_table(){
            try {     
            pst = con.prepareStatement("SELECT * FROM inmates");
            rs = pst.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) inmateTable.getModel();
            dtm.setRowCount(0);
            

            while(rs.next()){
                dtm.addRow(new Object[] { rs.getString("admnno"), rs.getString("name"), rs.getString("semester")});
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(addInmate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InmateBackgroundPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inmateTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtAdmnno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        branchCombo = new javax.swing.JComboBox<>();
        semesterCombo = new javax.swing.JComboBox<>();
        homeBtn = new javax.swing.JButton();
        messageText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 900));
        setSize(new java.awt.Dimension(1400, 900));

        InmateBackgroundPanel.setBackground(new java.awt.Color(0, 153, 153));
        InmateBackgroundPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UPDATE INMATES");

        inmateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adm. No", "Name", "Semester"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        inmateTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inmateTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(inmateTable);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admission Number: ");

        txtAdmnno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmnnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name: ");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Branch: ");

        jLabel5.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Semester");

        addBtn.setBackground(new java.awt.Color(0, 51, 51));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(0, 51, 51));
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(0, 51, 51));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Add Inmate Details");

        branchCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "CE", "ECE", "EEE", "ME", "RA", "BARCH" }));
        branchCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchComboActionPerformed(evt);
            }
        });

        semesterCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(txtAdmnno)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addBtn)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateBtn)
                                .addGap(70, 70, 70)
                                .addComponent(deleteBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(branchCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(semesterCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAdmnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(branchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(semesterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn))
                .addGap(23, 23, 23))
        );

        homeBtn.setBackground(new java.awt.Color(0, 51, 51));
        homeBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("HOME");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        messageText.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        messageText.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout InmateBackgroundPanelLayout = new javax.swing.GroupLayout(InmateBackgroundPanel);
        InmateBackgroundPanel.setLayout(InmateBackgroundPanelLayout);
        InmateBackgroundPanelLayout.setHorizontalGroup(
            InmateBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InmateBackgroundPanelLayout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(500, 500, 500))
            .addGroup(InmateBackgroundPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(InmateBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InmateBackgroundPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(InmateBackgroundPanelLayout.createSequentialGroup()
                        .addGroup(InmateBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        InmateBackgroundPanelLayout.setVerticalGroup(
            InmateBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InmateBackgroundPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(InmateBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(39, 39, 39)
                .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InmateBackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InmateBackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAdmnnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmnnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmnnoActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String admnNo = txtAdmnno.getText();
        String name = txtName.getText();
        String branch = branchCombo.getSelectedItem().toString();
        String sem = semesterCombo.getSelectedItem().toString();
        String semester = sem + " " + branch;
        
        try {
            pst = con.prepareStatement("INSERT INTO inmates (admnno, name, semester) values((?),(?),(?))");
            
            pst.setString(1, admnNo);
            pst.setString(2, name);
            pst.setString(3, semester);

            pst.executeUpdate();
        
            messageText.setForeground(Color.decode("#130a40"));
            messageText.setText("Successfully added inmate");
        
            
            // clear the text boxes
            txtAdmnno.setText("");
            txtName.setText("");
            txtAdmnno.requestFocus();
            

            // DefaultTableModel dtm = (DefaultTableModel) inmateTable.getModel();            
            // dtm.addRow(new Object[] {admnNo, name, branch, semester});
            update_table();
            
            // insert the user into attendence table also

            
        } 
        catch(SQLIntegrityConstraintViolationException ex){
            messageText.setForeground(Color.decode("#1a0105"));
            messageText.setText("Data already exists in database");
            Logger.getLogger(addInmate.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            messageText.setForeground(Color.decode("#1a0105"));
            messageText.setText("Could not add record to the database");
            Logger.getLogger(addInmate.class.getName()).log(Level.SEVERE, null, ex);
        } 

        
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:

        String admnNo = txtAdmnno.getText();
        String name = txtName.getText();
        String branch = branchCombo.getSelectedItem().toString();
        String sem = semesterCombo.getSelectedItem().toString();
        String semester = sem + " " + branch;
        try {
            pst = con.prepareStatement("update inmates set name=?, semester=? where admnno = ?");

            pst.setString(1, name);
            pst.setString(2, semester);
            pst.setString(3, admnNo);

            pst.executeUpdate();
        
            messageText.setForeground(Color.decode("#130a40"));
            messageText.setText("Successfully updated row");
        
            
            // clear the text boxes
            txtAdmnno.setText("");
            txtName.setText("");
            txtAdmnno.requestFocus();
            

            // DefaultTableModel dtm = (DefaultTableModel) inmateTable.getModel();            
            // dtm.addRow(new Object[] {admnNo, name, branch, semester});
            update_table();
        } 
        catch(SQLIntegrityConstraintViolationException ex){
            messageText.setForeground(Color.decode("#1a0105"));
            messageText.setText("Data already exists in database");
            Logger.getLogger(addInmate.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            messageText.setForeground(Color.decode("#1a0105"));
            messageText.setText("Could not update record");
            Logger.getLogger(addInmate.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void branchComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchComboActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        String admnNo = txtAdmnno.getText();
        try {
            pst = con.prepareStatement("DELETE FROM inmates WHERE admnno=?;");

            pst.setString(1, admnNo);
            pst.executeUpdate();
        
            messageText.setForeground(Color.decode("#130a40"));
            messageText.setText("Successfully deleted inmate");
        
            
            // clear the text boxes
            txtAdmnno.setText("");
            txtName.setText("");
            txtAdmnno.requestFocus();
            

            // DefaultTableModel dtm = (DefaultTableModel) inmateTable.getModel();            
            // dtm.addRow(new Object[] {admnNo, name, branch, semester});
            update_table();
        } 
        catch (SQLException ex) {
            messageText.setForeground(Color.decode("#1a0105"));
            messageText.setText("Cannot delete user");
            Logger.getLogger(addInmate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void inmateTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inmateTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) inmateTable.getModel();
        int index = inmateTable.getSelectedRow();
        
        txtAdmnno.setText(dtm.getValueAt(index, 0).toString());
        txtName.setText(dtm.getValueAt(index, 1).toString());
        semesterCombo.setSelectedItem(dtm.getValueAt(index, 2).toString().split(" ")[0]);
        branchCombo.setSelectedItem(dtm.getValueAt(index, 2).toString().split(" ")[1]);
    }//GEN-LAST:event_inmateTableMouseClicked

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
            java.util.logging.Logger.getLogger(addInmate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addInmate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addInmate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addInmate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addInmate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InmateBackgroundPanel;
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> branchCombo;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JTable inmateTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messageText;
    private javax.swing.JComboBox<String> semesterCombo;
    private javax.swing.JTextField txtAdmnno;
    private javax.swing.JTextField txtName;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
