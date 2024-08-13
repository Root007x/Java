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
public class category extends javax.swing.JFrame {

    /**
     * Creates new form category
     */
    public category() {
        initComponents();
        SelectCat();
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
        CatId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CatName = new javax.swing.JTextField();
        Addbtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CategoryTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manage_categories.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Categorie ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        CatId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(CatId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 200, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Categorie Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        CatName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(CatName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 200, -1));

        Addbtn.setBackground(new java.awt.Color(0, 182, 255));
        Addbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Addbtn.setForeground(new java.awt.Color(255, 255, 255));
        Addbtn.setText("ADD");
        Addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbtnMouseClicked(evt);
            }
        });
        jPanel1.add(Addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 100, 30));

        UpdateBtn.setBackground(new java.awt.Color(0, 182, 255));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("EDIT");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        jPanel1.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 100, 30));

        DeleteBtn.setBackground(new java.awt.Color(0, 182, 255));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        jPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 100, 30));

        HomeBtn.setBackground(new java.awt.Color(0, 182, 255));
        HomeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn.setText("HOME");
        HomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnMouseClicked(evt);
            }
        });
        jPanel1.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 100, 30));

        CategoryTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categorie ID", "Categorie Name"
            }
        ));
        CategoryTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        CategoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CategoryTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 540, 330));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("CATEGORIES LIST");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1000, 10));

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

    public void SelectCat() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from CATEGORYTBL");
            CategoryTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void AddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbtnMouseClicked
        try {

            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
            PreparedStatement add = Con.prepareStatement("insert into CATEGORYTBL values(?, ?)");
            add.setInt(1, Integer.valueOf(CatId.getText()));
            add.setString(2, CatName.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Category Successfully Added");
            Con.close();
            SelectCat();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddbtnMouseClicked

    private void CategoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryTableMouseClicked

        DefaultTableModel model = (DefaultTableModel) CategoryTable.getModel();
        int my_index = CategoryTable.getSelectedRow();
        CatId.setText(model.getValueAt(my_index, 0).toString());
        CatName.setText(model.getValueAt(my_index, 1).toString());
    }//GEN-LAST:event_CategoryTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if (CatId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter The Category to be Deleted");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
                String Id = CatId.getText();
                String Query = "Delete from root.CATEGORYTBL where CATID=" + Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectCat();
                JOptionPane.showMessageDialog(this, "Category Deleted Successfully");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked

        if (CatId.getText().isEmpty() || CatName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
                String updateQuery = "update root.CATEGORYTBL set CATNAME = '" + CatName.getText() + " ' " + "where CATID=" + CatId.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(updateQuery);
                JOptionPane.showMessageDialog(this, "Product Update Successfully");
                SelectCat();
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
//            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new category().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JTextField CatId;
    private javax.swing.JTextField CatName;
    private javax.swing.JTable CategoryTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
