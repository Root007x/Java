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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ROOT
 */
public class order extends javax.swing.JFrame {

    /**
     * Creates new form order
     */
    public order() {
        initComponents();
        SelectProd();
        SelectCust();
        GetToday();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

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

    private void GetToday() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        Datetbl.setText(dtf.format(now));
    }

    private void update() {
        int newqty = oldqty - Integer.valueOf(Qtytb.getText());
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
            String updateQuery = "update root.PRODUCTTBL set PRODQTY = " + newqty + " " + "where PRODID=" + productid;
            Statement Add = Con.createStatement();
            Add.executeUpdate(updateQuery);
            // JOptionPane.showMessageDialog(this, "Customer Update Successfully");
            SelectProd();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BillId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        AddToBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Addbtn = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        Qtytb = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        BillTbl = new javax.swing.JTable();
        Datetbl = new javax.swing.JLabel();
        TotAmttbl = new javax.swing.JLabel();
        CustNametbl = new javax.swing.JLabel();
        Printbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manage_order.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CustomerTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Phone Number"
            }
        ));
        CustomerTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 450, 220));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Customer List");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

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
        jScrollPane2.setViewportView(ProductTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 470, 220));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Product List");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Date");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Quantity");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Customer Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        BillId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(BillId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 170, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Home");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 100, 30));

        AddToBtn.setBackground(new java.awt.Color(0, 204, 255));
        AddToBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddToBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddToBtn.setText("Add to Order");
        AddToBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToBtnMouseClicked(evt);
            }
        });
        jPanel1.add(AddToBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, 110, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Order ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, -1));

        Addbtn.setBackground(new java.awt.Color(0, 204, 255));
        Addbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Addbtn.setForeground(new java.awt.Color(255, 255, 255));
        Addbtn.setText("Add Order");
        Addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbtnMouseClicked(evt);
            }
        });
        jPanel1.add(Addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 100, 30));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 170, -1));

        Qtytb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(Qtytb, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 110, 25));

        Price.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 110, 25));

        BillTbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BillTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Product", "Quantity", "Uprice", "Total"
            }
        ));
        jScrollPane3.setViewportView(BillTbl);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 510, 200));

        Datetbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Datetbl.setText("Date");
        jPanel1.add(Datetbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 170, 20));

        TotAmttbl.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        TotAmttbl.setForeground(new java.awt.Color(255, 102, 51));
        TotAmttbl.setText("Amount");
        jPanel1.add(TotAmttbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 720, 130, 30));

        CustNametbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CustNametbl.setText("CustName");
        jPanel1.add(CustNametbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 170, 20));

        Printbtn.setBackground(new java.awt.Color(0, 204, 255));
        Printbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Printbtn.setForeground(new java.awt.Color(255, 255, 255));
        Printbtn.setText("Print");
        Printbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintbtnMouseClicked(evt);
            }
        });
        jPanel1.add(Printbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 720, 130, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("TK");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 720, -1, -1));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 1000, 10));

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

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
        int my_index = CustomerTable.getSelectedRow();
        //CustId.setText(model.getValueAt(my_index, 0).toString());
        CustNametbl.setText(model.getValueAt(my_index, 1).toString());
        //CustPhone.setText(model.getValueAt(my_index, 2).toString());
    }//GEN-LAST:event_CustomerTableMouseClicked
    int flag = 0, productid, oldqty;
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
        int my_index = ProductTable.getSelectedRow();
        productid = Integer.valueOf(model.getValueAt(my_index, 0).toString());
        Prodname = model.getValueAt(my_index, 1).toString();
        oldqty = Integer.valueOf(model.getValueAt(my_index, 2).toString());
        // ProdDesc.setText(model.getValueAt(my_index, 3).toString());
        flag = 1;
    }//GEN-LAST:event_ProductTableMouseClicked

    int i = 1, Uprice, total = 0, sum;
    String Prodname;

    private void AddToBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBtnMouseClicked
        if (flag == 0 || Qtytb.getText().isEmpty() || Price.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select Product and Enter Quantity");
        } else {
            Uprice = Integer.valueOf(Price.getText());
            total = Uprice * Integer.valueOf(Qtytb.getText());
            Vector v = new Vector();
            v.add(i);
            v.add(Prodname);
            v.add(Qtytb.getText());
            v.add(Uprice);
            v.add(total);
            DefaultTableModel dt = (DefaultTableModel) BillTbl.getModel();
            dt.addRow(v);
            sum = sum + total;
            TotAmttbl.setText("" + sum);
            update();
            i++;

        }
    }//GEN-LAST:event_AddToBtnMouseClicked

    private void PrintbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintbtnMouseClicked
        try {
            BillTbl.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_PrintbtnMouseClicked

    private void AddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbtnMouseClicked
        if (BillId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter The Bill Id");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/inventorydb", "root", "boss");
                PreparedStatement add = Con.prepareStatement("insert into ORDERTBL values(?, ?, ?, ?)");
                add.setInt(1, Integer.valueOf(BillId.getText()));
                add.setString(2, CustNametbl.getText());
                add.setString(3, Datetbl.getText());
                add.setInt(4, Integer.valueOf(TotAmttbl.getText()));
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Order Successfully Added");
                Con.close();
                SelectProd();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_AddbtnMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

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
//            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new order().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToBtn;
    private javax.swing.JButton Addbtn;
    private javax.swing.JTextField BillId;
    private javax.swing.JTable BillTbl;
    private javax.swing.JLabel CustNametbl;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JLabel Datetbl;
    private javax.swing.JTextField Price;
    private javax.swing.JButton Printbtn;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTextField Qtytb;
    private javax.swing.JLabel TotAmttbl;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
