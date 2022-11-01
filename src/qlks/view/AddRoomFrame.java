/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlks.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import qlks.dao.JDBCconnection;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class AddRoomFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddRoomFrame
     */
    //    SQL
    private java.sql.Connection connection;

    public java.sql.Connection getConnection() {
        return connection;
    }

    public void setConnection(java.sql.Connection conn) {
        this.connection = conn;
    }

    public java.sql.Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName(JDBCconnection.driverName);
        connection = DriverManager.getConnection(JDBCconnection.dbURL, JDBCconnection.dbUser, JDBCconnection.dbPass);
        System.out.println("CONNECTTED!");
        return connection;
    }

    public AddRoomFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputMP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputStatus = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        inputClean = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        inputBedType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        inputPrice = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(975, 490));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Thêm Phòng");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 167, 45));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Mã Phòng");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 77, 25));

        inputMP.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        inputMP.setForeground(new java.awt.Color(0, 204, 204));
        inputMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMPActionPerformed(evt);
            }
        });
        getContentPane().add(inputMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 200, 35));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Tình trạng");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 77, 26));

        inputStatus.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        inputStatus.setForeground(new java.awt.Color(0, 204, 204));
        inputStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trống", "Đang thuê" }));
        inputStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputStatusActionPerformed(evt);
            }
        });
        getContentPane().add(inputStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 200, 36));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Vệ sinh");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 77, 29));

        inputClean.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        inputClean.setForeground(new java.awt.Color(0, 204, 204));
        inputClean.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã vệ sinh", "Bẩn" }));
        getContentPane().add(inputClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 200, 37));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Loại giường");
        jLabel5.setAlignmentY(0.0F);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, 30));

        inputBedType.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        inputBedType.setForeground(new java.awt.Color(0, 204, 204));
        inputBedType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giường đơn", "Giường đôi" }));
        getContentPane().add(inputBedType, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 200, 31));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Giá");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 37, 30));

        inputPrice.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        inputPrice.setForeground(new java.awt.Color(0, 204, 204));
        inputPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPriceActionPerformed(evt);
            }
        });
        getContentPane().add(inputPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 200, 31));

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 204, 204));
        btnSubmit.setText("Thêm");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 136, 31));

        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/img/624b471bdf247131f10ea14f_61d31b8dbff9b500cbd7ed32_types_of_rooms_in_a_5-star_hotel_2_optimized_optimized.jpeg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMPActionPerformed

    private void inputStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputStatusActionPerformed

    private void inputPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPriceActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String MP = inputMP.getText();
        String price = inputPrice.getText();
        String Status = (String) inputStatus.getSelectedItem();
        String Clean = (String) inputClean.getSelectedItem();
        String Bed = (String) inputBedType.getSelectedItem();

        try {
            if (MP.equals("") || price.equals("")) {
                JOptionPane.showMessageDialog(null, "Không được để trống thông tin");
            } else {
                connection = getConnect();
                String str = "INSERT INTO Loai_Phong values( N'" + MP + "', N'" + Status + "', N'" + Clean + "',N'" + Bed + "', '" + price + "')";
                
                PreparedStatement preparedStatement = connection.prepareStatement(str);
                
                int rs = preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Thêm Phòng thành công");
                new AllRoomFrame().setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(AddRoomFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRoomFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRoomFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRoomFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRoomFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> inputBedType;
    private javax.swing.JComboBox<String> inputClean;
    private javax.swing.JTextField inputMP;
    private javax.swing.JTextField inputPrice;
    private javax.swing.JComboBox<String> inputStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
