/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlks.view;

/**
 *
 * @author Admin
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qlks.dao.JDBCconnection;

public class AddEmployeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
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

    public AddEmployeeFrame() {
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
        inputName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputGender = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        inputJob = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        inputLuong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputPhone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inputAddr = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(9, 5));
        setPreferredSize(new java.awt.Dimension(980, 568));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Thêm Nhân Viên");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, 38));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Tên");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 72, -1));

        inputName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        getContentPane().add(inputName, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 192, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Tuổi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 72, -1));

        inputAge.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        getContentPane().add(inputAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 192, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Giới tính");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 72, 50));

        inputGender.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        inputGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        getContentPane().add(inputGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 112, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Chức vụ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 72, 40));

        inputJob.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        inputJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Lễ tân", "Bồi bàn", "Bếp trưởng", "Bếp phó", "Phụ bếp", "Phục vụ phòng", "Dọn phòng", "Bảo vệ" }));
        getContentPane().add(inputJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 112, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Lương");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 72, -1));

        inputLuong.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        getContentPane().add(inputLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 192, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Số điện thoại");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, -1));

        inputPhone.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        getContentPane().add(inputPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 192, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Địa chỉ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 83, -1));

        inputAddr.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        getContentPane().add(inputAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 192, -1));

        btnAdd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAdd.setText("Ok");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 107, 31));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/img/how-to-effectively-manage-your-hotel-staff.jpeg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 750, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String name = inputName.getText();
        String age = inputAge.getText();
        String gender = (String) inputGender.getSelectedItem();
        String job = (String) inputJob.getSelectedItem();
        String luong = inputLuong.getText();
        String phone = inputPhone.getText();
        String Address = inputAddr.getText();

        if (name.equals("") || age.equals("") || luong.equals("") || phone.equals("") || Address.equals("")) {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin");
        } else {
            try {
                connection = getConnect();
                String str = "INSERT INTO employee values( N'" + name + "', '" + age + "', N'" + gender + "',N'" + job + "', '" + luong + "', '" + phone + "', N'" + Address + "')";

                PreparedStatement preparedStatement = connection.prepareStatement(str);

                int rs = preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Thêm Nhân viên thành công");
                new EmployeeFrame().setVisible(true);
                this.dispose();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddEmployeeFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployeeFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JTextField inputAddr;
    private javax.swing.JTextField inputAge;
    private javax.swing.JComboBox<String> inputGender;
    private javax.swing.JComboBox<String> inputJob;
    private javax.swing.JTextField inputLuong;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
