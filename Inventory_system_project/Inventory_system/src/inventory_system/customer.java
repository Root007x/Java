/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventory_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ROOT
 */
public class customer extends javax.swing.JFrame {

    public customer() {
        initComponents();
        SelectCust();
    }

    Connection Con = null;
    Statement St = null, St1 = null;
    ResultSet Rs = null, Rs1 = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CustPhone = new javax.swing.JTextField();
        CustId = new javax.swing.JTextField();
        CustName = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Amounttbl = new javax.swing.JTextField();
        ordertbl = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/customer_product.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Customer Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Phone Number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Customer ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        CustPhone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(CustPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 210, -1));

        CustId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(CustId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));

        CustName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(CustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 210, -1));

        AddBtn.setBackground(new java.awt.Color(0, 182, 255));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 100, 30));

        UpdateBtn.setBackground(new java.awt.Color(0, 182, 255));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("EDIT");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        jPanel1.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 100, 30));

        DeleteBtn.setBackground(new java.awt.Color(0, 182, 255));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        jPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 100, 30));

        HomeBtn.setBackground(new java.awt.Color(0, 182, 255));
        HomeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn.setText("HOME");
        HomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnMouseClicked(evt);
            }
        });
        jPanel1.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 100, 30));

        CustomerTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Phone Number"
            }
        ));
        CustomerTable.setGridColor(new java.awt.Color(255, 255, 255));
        CustomerTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        CustomerTable.setVerifyInputWhenFocusTarget(false);
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 540, 380));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Customer List");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ORDER AMOUNT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 630, 190, 40));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ORDER NUMBER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, 190, 40));

        Amounttbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Amounttbl.setForeground(new java.awt.Color(255, 102, 51));
        jPanel1.add(Amounttbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 690, 190, 30));

        ordertbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ordertbl.setForeground(new java.awt.Color(0, 204, 255));
        jPanel1.add(ordertbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 690, 190, 30));

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 1000, 10));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void SelectCust() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from CUSTOMERTBL");
            CustomerTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        try {

            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
            PreparedStatement add = Con.prepareStatement("insert into CUSTOMERTBL values(?, ?, ?)");
            add.setInt(1, Integer.valueOf(CustId.getText()));
            add.setString(2, CustName.getText());
            add.setString(3, CustPhone.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Customer Successfully Added");
            Con.close();
            SelectCust();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_AddBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked

        if (CustId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter The Customer to be Deleted");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
                String Id = CustId.getText();
                String Query = "Delete from root.CUSTOMERTBL where CUSTID=" + Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectCust();
                JOptionPane.showMessageDialog(this, "Customer Deleted Successfully");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
        int my_index = CustomerTable.getSelectedRow();
        CustId.setText(model.getValueAt(my_index, 0).toString());
        CustName.setText(model.getValueAt(my_index, 1).toString());
        CustPhone.setText(model.getValueAt(my_index, 2).toString());

        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
            St = Con.createStatement();
            St1 = Con.createStatement();
            Rs = St.executeQuery("SELECT COUNT(*) FROM root.ORDERTBL WHERE CUSTNAME = '" + model.getValueAt(my_index, 1).toString() + "'");
            Rs1 = St1.executeQuery("SELECT SUM(AMOUNT) FROM root.ORDERTBL WHERE CUSTNAME = '" + model.getValueAt(my_index, 1).toString() + "'");
            while (Rs.next()) {
                ordertbl.setText("" + Rs.getInt(1));
            }
            while (Rs1.next()) {
                Amounttbl.setText("Tk " + Rs1.getInt(1));
            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_CustomerTableMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked

        if (CustId.getText().isEmpty() || CustName.getText().isEmpty() || CustPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
                String updateQuery = "update root.CUSTOMERTBL set CUSTNAME = '" + CustName.getText() + " ' " + ",CUSTPHONE ='" + CustPhone.getText() + "'" + "where CUSTID=" + CustId.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(updateQuery);
                JOptionPane.showMessageDialog(this, "Customer Update Successfully");
                SelectCust();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
        new home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new customer().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField Amounttbl;
    private javax.swing.JTextField CustId;
    private javax.swing.JTextField CustName;
    private javax.swing.JTextField CustPhone;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ordertbl;
    // End of variables declaration//GEN-END:variables
}
