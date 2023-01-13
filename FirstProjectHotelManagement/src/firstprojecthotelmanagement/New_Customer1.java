/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprojecthotelmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class New_Customer1 extends javax.swing.JFrame {

    DefaultTableModel model;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement st = null;

    public New_Customer1() {
        initComponents();
        showcustomers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gendercb = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTb = new javax.swing.JTextArea();
        custcode = new javax.swing.JTextField();
        cNameTb = new javax.swing.JTextField();
        phoneTb = new javax.swing.JTextField();
        country = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerlist = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 0));

        jPanel1.setBackground(new java.awt.Color(102, 0, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Manage Customer");

        jButton1.setForeground(new java.awt.Color(255, 51, 0));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(454, 454, 454)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Customer Code:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 96, -1, -1));

        jLabel3.setText("Customer Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 140, -1, -1));

        jLabel4.setText("Mobile No:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 172, -1, -1));

        jLabel5.setText("Address:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 266, -1, -1));

        jLabel6.setText("Country:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 347, -1, -1));

        gendercb.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        gendercb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", " " }));
        gendercb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendercbActionPerformed(evt);
            }
        });
        jPanel2.add(gendercb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 152, -1));

        jLabel7.setText("Gender:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 211, -1, -1));

        addressTb.setColumns(20);
        addressTb.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        addressTb.setRows(5);
        jScrollPane1.setViewportView(addressTb);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 150, 77));

        custcode.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        custcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custcodeActionPerformed(evt);
            }
        });
        jPanel2.add(custcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 150, -1));

        cNameTb.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jPanel2.add(cNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 148, -1));

        phoneTb.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        phoneTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTbActionPerformed(evt);
            }
        });
        jPanel2.add(phoneTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 149, -1));

        country.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jPanel2.add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 152, -1));

        customerlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SerialNo", "Cust_Code", "Cust_Name", "Mobile", "Gender", "Address", "Country"
            }
        ));
        customerlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerlistMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(customerlist);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 540, 390));

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 388, -1, -1));

        editBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        jPanel2.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 388, -1, -1));

        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 388, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void custcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custcodeActionPerformed

    private void phoneTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTbActionPerformed

    private void gendercbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendercbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gendercbActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:

        if (custcode.getText().isEmpty() || cNameTb.getText().isEmpty() || gendercb.getSelectedIndex() == -1 || addressTb.getText().isEmpty() || phoneTb.getText().isEmpty() || country.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Missing input Data");

        } else {
            try {
                int cid = 0;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");

                PreparedStatement save = con.prepareStatement("insert into customer values (?,?,?,?,?,?,?)");

                save.setInt(1, cid);
                save.setInt(2, Integer.valueOf(custcode.getText().toString()));
                save.setString(3, cNameTb.getText().toString());
                 save.setString(4, phoneTb.getText().toString());
                save.setString(5, gendercb.getSelectedItem().toString());

                save.setString(6, addressTb.getText().toString());
               
                save.setString(7, country.getText().toString());

                int row = save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Customer added Successfully");
                con.close();

                showcustomers();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, e);
            }

        }


    }//GEN-LAST:event_addBtnActionPerformed

    int key = 0;

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        if (key == 0) {

            JOptionPane.showMessageDialog(this, "Select a Customer");

        } else {
            try {
                // int Rnum = 0;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");

                PreparedStatement save = con.prepareStatement("Delete from customer where CustNum =?");

                save.setInt(1, key);

                int row = save.executeUpdate();
                JOptionPane.showMessageDialog(this, "CUSTOMER Deleted Successfully");
                con.close();

                showcustomers();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, e);
            }

        }


    }//GEN-LAST:event_deleteBtnActionPerformed

    private void customerlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerlistMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) customerlist.getModel();
        int MyIndex = customerlist.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        custcode.setText(model.getValueAt(MyIndex, 1).toString());

        cNameTb.setText(model.getValueAt(MyIndex, 2).toString());
        phoneTb.setText(model.getValueAt(MyIndex, 3).toString());

        gendercb.setSelectedItem(model.getValueAt(MyIndex, 4));
        addressTb.setText(model.getValueAt(MyIndex, 5).toString());
        country.setText(model.getValueAt(MyIndex, 6).toString());


    }//GEN-LAST:event_customerlistMouseClicked

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:

        if (custcode.getText().isEmpty() || cNameTb.getText().isEmpty() || gendercb.getSelectedIndex() == -1 || addressTb.getText().isEmpty() || phoneTb.getText().isEmpty() || country.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Missing input Data");

        } else {

            String sql = "update customer set CustCode = ?, CustName = ? , CustPhone = ?, CustGen = ?, custadd = ?,Country = ? where custNum = ?";
            try {
                // int Rnum = 0;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");

                PreparedStatement save = con.prepareStatement(sql);
                save.setInt(1, Integer.valueOf(custcode.getText().toString()));
                save.setString(2, cNameTb.getText().toString());
                save.setString(3, phoneTb.getText().toString());
                save.setString(4, gendercb.getSelectedItem().toString());
                save.setString(5, addressTb.getText().toString());
                save.setString(6, country.getText().toString());

                save.setInt(7, key);
                int row = save.executeUpdate();

                JOptionPane.showMessageDialog(this, "Customer updated Successfully");
                con.close();

                showcustomers();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, e);
            }

        }


    }//GEN-LAST:event_editBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showcustomers() {
        model = new DefaultTableModel();

        model.addColumn("SerialNo");//Number=model table column name
        model.addColumn("Cust_Code");
        model.addColumn("Cust_Name");
        model.addColumn("Mobile");
        model.addColumn("Gender");
        model.addColumn("Address");
        model.addColumn("Country");
        String sql = "select * from customer";

        try {
            Connection con = DatabaseConnection.getDBConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                String id = rs.getString("CustNum"); //Rnum=sql table column name

                String code = rs.getString("CustCode");
                String name = rs.getString("CustName");

                String phn = rs.getString("Custphone");
                String status = rs.getString("CustGen");
                String addcust = rs.getString("Custadd");
                String county = rs.getString("Country");

                Object[] rowData = {id, code, name, phn, status, addcust,county};
                model.addRow(rowData);

            }
            customerlist.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }

  
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
            java.util.logging.Logger.getLogger(New_Customer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Customer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Customer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Customer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new New_Customer1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextArea addressTb;
    private javax.swing.JTextField cNameTb;
    private javax.swing.JTextField country;
    private javax.swing.JTextField custcode;
    private javax.swing.JTable customerlist;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JComboBox gendercb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField phoneTb;
    // End of variables declaration//GEN-END:variables
}
