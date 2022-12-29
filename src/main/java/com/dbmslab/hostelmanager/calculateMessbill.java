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
public class calculateMessbill extends javax.swing.JFrame {

    /**
     * Creates new form calculateMessbill
     */
    
        // create variables for database connection
    Connection con = null;
    Statement st = null;
    PreparedStatement pst = null;  
    ResultSet rs = null;
    
    public calculateMessbill() {
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        monthCombo = new javax.swing.JComboBox<>();
        calculateBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        netTotalExpLabel = new javax.swing.JLabel();
        totalInmatesLabel = new javax.swing.JLabel();
        totalAttendenceLabel1 = new javax.swing.JLabel();
        messRatePDLabel1 = new javax.swing.JLabel();
        estFeeLabel = new javax.swing.JLabel();
        estFeePLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        expenseTable = new javax.swing.JTable();
        printBillBtn = new javax.swing.JButton();
        messageText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 900));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADD OTHER EXPENSE");

        homeBtn.setBackground(new java.awt.Color(0, 51, 51));
        homeBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("HOME");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Month: ");

        monthCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        calculateBtn.setBackground(new java.awt.Color(0, 51, 51));
        calculateBtn.setForeground(new java.awt.Color(255, 255, 255));
        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Net Total Mess Expense: ");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Attendence: ");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mess rate per day: ");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estabishment Fee: ");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total inmates:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Establishment Fee: ");

        netTotalExpLabel.setForeground(new java.awt.Color(255, 255, 255));
        netTotalExpLabel.setText(" ");

        totalInmatesLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalInmatesLabel.setText(" ");

        totalAttendenceLabel1.setForeground(new java.awt.Color(255, 255, 255));
        totalAttendenceLabel1.setText(" ");

        messRatePDLabel1.setForeground(new java.awt.Color(255, 255, 255));
        messRatePDLabel1.setText(" ");

        estFeeLabel.setForeground(new java.awt.Color(255, 255, 255));
        estFeeLabel.setText(" ");

        estFeePLabel.setForeground(new java.awt.Color(255, 255, 255));
        estFeePLabel.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(237, 237, 237))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calculateBtn)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(104, 104, 104)
                                .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2))
                                .addGap(33, 33, 33)
                                .addComponent(netTotalExpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalInmatesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalAttendenceLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(messRatePDLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estFeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estFeePLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(33, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(calculateBtn)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(netTotalExpLabel)))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(totalAttendenceLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(messRatePDLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(estFeeLabel))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(totalInmatesLabel))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(estFeePLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        expenseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Semester", "Attendence", "Amount", "Fine", "Est Fee", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(expenseTable);

        printBillBtn.setBackground(new java.awt.Color(0, 51, 51));
        printBillBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        printBillBtn.setForeground(new java.awt.Color(255, 255, 255));
        printBillBtn.setText("Print Bill");
        printBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBillBtnActionPerformed(evt);
            }
        });

        messageText.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        messageText.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(printBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(printBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        // TODO add your handling code here:
        String month = monthCombo.getSelectedItem().toString();
        
         try {
             
            // find net total expanse and est. fee
            pst = con.prepareStatement("select net_total, est_fee from expense where month = ?");
            pst.setString(1, month);
            rs = pst.executeQuery();
            rs.next();
            
            int netTotal = Integer.parseInt(rs.getString("net_total"));
            int estFee = Integer.parseInt(rs.getString("est_fee"));
            netTotalExpLabel.setText(String.valueOf(netTotal));
            estFeeLabel.setText(String.valueOf(estFee));
            
            // find total attendence
            pst = con.prepareStatement("select SUM(count_no) as c from attendence where month = ?");
            pst.setString(1, month);
            rs = pst.executeQuery();
            rs.next();
            int attendence = Integer.parseInt(rs.getString("c"));
            float ratePerDay = (float)netTotal / attendence;
            totalAttendenceLabel1.setText(String.valueOf(attendence));
            messRatePDLabel1.setText(String.valueOf(ratePerDay));
            
            
            // find total inmates and calculate est. fee per person
            pst = con.prepareStatement("select count(*) as num from inmates");
            rs = pst.executeQuery();
            rs.next();
            
            int inmateNo = Integer.parseInt(rs.getString("num"));
            var estFeePerPerson = (float) estFee / inmateNo;
            
            totalInmatesLabel.setText(String.valueOf(inmateNo));
            estFeePLabel.setText(String.valueOf(estFeePerPerson));
            
            
            // creating table
            try {     
                pst = con.prepareStatement("SELECT I.name, I.semester, A.count_no, A.fine FROM inmates as I, attendence as A where I.admnno = A.admnno AND A.month = ?");
                pst.setString(1, month);
                rs = pst.executeQuery();
                DefaultTableModel dtm = (DefaultTableModel) expenseTable.getModel();
                dtm.setRowCount(0);
            

                while(rs.next()){
                    int Pcount = Integer.parseInt(rs.getString("A.count_no"));
                    int Pfine = Integer.parseInt(rs.getString("A.fine"));
                    double Pamount = Math.ceil((float) Pcount * ratePerDay);
                    double Ptotal = Pamount + Pfine + estFeePerPerson;
                    dtm.addRow(new Object[] { rs.getString("I.name"), rs.getString("I.semester"), Pcount, Pamount, Pfine, estFeePerPerson, Ptotal});
                }
            }
            catch (SQLException ex) {
                Logger.getLogger(addInmate.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            messageText.setForeground(Color.decode("#130a40"));
            messageText.setText("Mess bill calculation success");  
        } 
        catch (SQLException ex) {
            messageText.setForeground(Color.decode("#1a0105"));
            messageText.setText("Something Went Wrong!!");
            Logger.getLogger(addInmate.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_calculateBtnActionPerformed

    private void printBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBillBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printBillBtnActionPerformed

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
            java.util.logging.Logger.getLogger(calculateMessbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculateMessbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculateMessbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculateMessbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculateMessbill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateBtn;
    private javax.swing.JLabel estFeeLabel;
    private javax.swing.JLabel estFeePLabel;
    private javax.swing.JTable expenseTable;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messRatePDLabel1;
    private javax.swing.JLabel messageText;
    private javax.swing.JComboBox<String> monthCombo;
    private javax.swing.JLabel netTotalExpLabel;
    private javax.swing.JButton printBillBtn;
    private javax.swing.JLabel totalAttendenceLabel1;
    private javax.swing.JLabel totalInmatesLabel;
    // End of variables declaration//GEN-END:variables
}
