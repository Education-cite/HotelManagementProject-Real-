
package firstprojecthotelmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Search_Room1 extends javax.swing.JFrame {
    DefaultTableModel model;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement st = null;
   
    public Search_Room1() {
        initComponents();
         showRooms();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RoomsList = new javax.swing.JTable();
        categoryfilter = new javax.swing.JComboBox();
        statusfilter = new javax.swing.JComboBox();
        refreshBtn2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Search Rooms");

        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(311, 311, 311)
                .addComponent(jButton1)
                .addGap(43, 43, 43))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(43, 43, 43))
        );

        RoomsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No", "Room code", "Room Name", "Type", "Status", "Price"
            }
        ));
        RoomsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomsListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RoomsList);

        categoryfilter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        categoryfilter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vip", "Single", "Double", "Family", " " }));
        categoryfilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoryfilterItemStateChanged(evt);
            }
        });
        categoryfilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryfilterActionPerformed(evt);
            }
        });

        statusfilter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        statusfilter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Free", "Booked" }));
        statusfilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                statusfilterItemStateChanged(evt);
            }
        });
        statusfilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusfilterActionPerformed(evt);
            }
        });

        refreshBtn2.setBackground(new java.awt.Color(255, 255, 255));
        refreshBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refreshBtn2.setForeground(new java.awt.Color(204, 0, 0));
        refreshBtn2.setText("Refresh");
        refreshBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(categoryfilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusfilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshBtn2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryfilter, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusfilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshBtn2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
      int rid;
    
      private void showRooms() {
        model = new DefaultTableModel();

        model.addColumn("Serial No");//Number=model table column name
        model.addColumn("Room code");
        model.addColumn("Room Name");
        model.addColumn("Type");
        model.addColumn("Status");
        model.addColumn("Price");
        String sql = "select * from Room";

        try {
            Connection con = DatabaseConnection.getDBConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                String id = rs.getString("Rnum"); //Rnum=sql table column name
                String code = rs.getString("Rcode");
                String name = rs.getString("RName");
                String category = rs.getString("RType");
                String status = rs.getString("RStatus");
                String price = rs.getString("Price");

                Object[] rowData = {id,code, name, category, status, price};
                model.addRow(rowData);

            }
            RoomsList.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }
    
     private void filterbycat() {
        model = new DefaultTableModel();

        model.addColumn("Serial No");//Number=model table column name
        model.addColumn("Room code");
        model.addColumn("Room Name");
        model.addColumn("Type");
        model.addColumn("Status");
        model.addColumn("Price");

              
        String sql = ("select * from Room where RType ='"+categoryfilter.getSelectedItem().toString()+" '");

        try {
            Connection con = DatabaseConnection.getDBConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                String id = rs.getString("Rnum"); //Rnum=sql table column name
                String code = rs.getString("Rcode");
                String name = rs.getString("RName");
                String category = rs.getString("RType");
                String status = rs.getString("RStatus");
                String price = rs.getString("Price");

                Object[] rowData = {id,code, name, category, status, price};
                model.addRow(rowData);

            }
            RoomsList.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }
     
     
     
      private void filterbystatus() {
        model = new DefaultTableModel();

        model.addColumn("Serial No");//Number=model table column name
        model.addColumn("Rcode");
        model.addColumn("Room Name");
        model.addColumn("Type");
        model.addColumn("Status");
        model.addColumn("Price");
        String sql = ("select * from Room where RStatus ='"+statusfilter.getSelectedItem().toString()+" '");

        try {
            Connection con = DatabaseConnection.getDBConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

              String id = rs.getString("Rnum"); //Rnum=sql table column name
                String code = rs.getString("Rcode");
                String name = rs.getString("RName");
                String category = rs.getString("RType");
                String status = rs.getString("RStatus");
                String price = rs.getString("Price");

                Object[] rowData = {id,code, name, category, status, price};
                model.addRow(rowData);

            }
            RoomsList.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }
    
      
      
    
      int key = 0;
    private void RoomsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomsListMouseClicked
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) RoomsList.getModel();
        int MyIndex = RoomsList.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
//
    }//GEN-LAST:event_RoomsListMouseClicked

    private void categoryfilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryfilterItemStateChanged
        // TODO add your handling code here:

        filterbycat();
    }//GEN-LAST:event_categoryfilterItemStateChanged

    private void categoryfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryfilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryfilterActionPerformed

    private void statusfilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_statusfilterItemStateChanged
        // TODO add your handling code here:

        filterbystatus();
    }//GEN-LAST:event_statusfilterItemStateChanged

    private void refreshBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtn2ActionPerformed
        // TODO add your handling code here:

        showRooms();
        categoryfilter.setSelectedIndex(0);
        statusfilter.setSelectedIndex(0);
    }//GEN-LAST:event_refreshBtn2ActionPerformed

    private void statusfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusfilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusfilterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Search_Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Room1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Search_Room1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RoomsList;
    private javax.swing.JComboBox categoryfilter;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBtn2;
    private javax.swing.JComboBox statusfilter;
    // End of variables declaration//GEN-END:variables
}
