/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventory_system;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class product extends javax.swing.JFrame {

    /**
     * Creates new form product
     */
    public product() {
        initComponents();
        SelectProd();
        GetCat();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ProdDesc = new javax.swing.JTextField();
        ProdId = new javax.swing.JTextField();
        ProdName = new javax.swing.JTextField();
        ProdQty = new javax.swing.JTextField();
        CatCb = new javax.swing.JComboBox<>();
        HomeBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manage_product.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Catagory");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Product ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Quantity");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Description");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        ProdDesc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(ProdDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 210, -1));

        ProdId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(ProdId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 210, -1));

        ProdName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(ProdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 210, -1));

        ProdQty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(ProdQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 210, -1));

        CatCb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CatCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel1.add(CatCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 210, -1));

        HomeBtn.setBackground(new java.awt.Color(0, 182, 255));
        HomeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn.setText("HOME");
        HomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnMouseClicked(evt);
            }
        });
        jPanel1.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 100, 30));

        AddBtn.setBackground(new java.awt.Color(0, 182, 255));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 100, 30));

        UpdateBtn.setBackground(new java.awt.Color(0, 182, 255));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("EDIT");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        jPanel1.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 100, 30));

        DeleteBtn.setBackground(new java.awt.Color(0, 182, 255));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        jPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 100, 30));

        ProductTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Quantity", "Description", "Catagory"
            }
        ));
        ProductTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 540, 380));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Product List");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, -1));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void SelectProd() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from PRODUCTTBL");
            ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void GetCat() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
            St = Con.createStatement();
            String query = "SELECT * FROM root.CATEGORYTBL";
            Rs = St.executeQuery(query);
            while (Rs.next()) {
                String Mycat = Rs.getString("CATNAME");
                CatCb.addItem(Mycat);
            }
        } catch (Exception e) {

        }
    }

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        try {

            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
            PreparedStatement add = Con.prepareStatement("insert into PRODUCTTBL values(?, ?, ?, ?, ?)");
            add.setInt(1, Integer.valueOf(ProdId.getText()));
            add.setString(2, ProdName.getText());
            add.setInt(3, Integer.valueOf(ProdQty.getText()));
            add.setString(4, ProdDesc.getText());
            add.setString(5, CatCb.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product Successfully Added");
            Con.close();
            SelectProd();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_AddBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked

        if (ProdId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter The Product to be Deleted");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
                String Id = ProdId.getText();
                String Query = "Delete from root.PRODUCTTBL where PRODID=" + Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectProd();
                JOptionPane.showMessageDialog(this, "Product Deleted Successfully");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
        int my_index = ProductTable.getSelectedRow();
        ProdId.setText(model.getValueAt(my_index, 0).toString());
        ProdName.setText(model.getValueAt(my_index, 1).toString());
        ProdQty.setText(model.getValueAt(my_index, 2).toString());
        ProdDesc.setText(model.getValueAt(my_index, 3).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        if (ProdId.getText().isEmpty() || ProdName.getText().isEmpty() || ProdQty.getText().isEmpty() || ProdDesc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
                String updateQuery = "update root.PRODUCTTBL set PRODNAME = '" + ProdName.getText() + " ' " + ",PRODQTY =" + ProdQty.getText() + "" + ",PRODDESC=' " + ProdDesc.getText() + " ' " + ",PRODCAT=' " + CatCb.getSelectedItem().toString() + " ' " + "where PRODID=" + ProdId.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(updateQuery);
                JOptionPane.showMessageDialog(this, "Product Update Successfully");
                SelectProd();
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
//            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new product().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JComboBox<String> CatCb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JTextField ProdDesc;
    private javax.swing.JTextField ProdId;
    private javax.swing.JTextField ProdName;
    private javax.swing.JTextField ProdQty;
    private javax.swing.JTable ProductTable;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
