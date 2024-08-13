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
public class user extends javax.swing.JFrame {

    /**
     * Creates new form user
     */
    public user() {
        initComponents();
        SelectUser();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        uPass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        uPhone = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        loginbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        HomeBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manage_users.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("User Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        uName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(uName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 210, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        uPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(uPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 210, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Phone");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        uPhone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(uPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 210, -1));

        AddBtn.setBackground(new java.awt.Color(0, 182, 255));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 100, 30));

        UpdateBtn.setBackground(new java.awt.Color(0, 182, 255));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("EDIT");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        jPanel1.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 100, 30));

        DeleteBtn.setBackground(new java.awt.Color(0, 182, 255));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        jPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 100, 30));

        loginbtn.setBackground(new java.awt.Color(0, 182, 255));
        loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("Log In");
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
        });
        jPanel1.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 610, 100, 30));

        UserTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Password", "Phone"
            }
        ));
        UserTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        UserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UserTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 540, 380));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Users List");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1000, 10));

        HomeBtn1.setBackground(new java.awt.Color(0, 182, 255));
        HomeBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HomeBtn1.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn1.setText("HOME");
        HomeBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtn1MouseClicked(evt);
            }
        });
        jPanel1.add(HomeBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 100, 30));

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

    public void SelectUser() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from USERTBL");
            UserTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked

        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
            PreparedStatement add = Con.prepareStatement("insert into USERTBL values(?, ?, ?)");

            add.setString(1, uName.getText());
            add.setString(2, uPass.getText());
            add.setInt(3, Integer.valueOf(uPhone.getText()));
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "User Successfully Added");
            Con.close();
            SelectUser();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked

        if (uName.getText().isEmpty() || uPass.getText().isEmpty() || uPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter The Phone Number to be Deleted");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
                String Id = uPhone.getText();
                String Query = "Delete from root.USERTBL where UPHONE=" + Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectUser();
                JOptionPane.showMessageDialog(this, "User Deleted Successfully");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void UserTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTableMouseClicked

        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        int my_index = UserTable.getSelectedRow();
        uName.setText(model.getValueAt(my_index, 0).toString());
        uPass.setText(model.getValueAt(my_index, 1).toString());
        uPhone.setText(model.getValueAt(my_index, 2).toString());
    }//GEN-LAST:event_UserTableMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        if (uName.getText().isEmpty() || uPass.getText().isEmpty() || uPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
                String updateQuery = "update root.USERTBL set UNAME = '" + uName.getText() + " ' " + ",UPASS ='" + uPass.getText() + "'" + "where UPHONE=" + uPhone.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(updateQuery);
                JOptionPane.showMessageDialog(this, "User Update Successfully");
                SelectUser();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginbtnMouseClicked

    private void HomeBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtn1MouseClicked

        new home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtn1MouseClicked

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
//            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new user().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton HomeBtn1;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTable UserTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JTextField uName;
    private javax.swing.JTextField uPass;
    private javax.swing.JTextField uPhone;
    // End of variables declaration//GEN-END:variables
}
