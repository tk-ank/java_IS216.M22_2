/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package timemanagement.Account;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kyanh
 */
public class XacNhan extends javax.swing.JFrame {

    /**
     * Creates new form XacNhan
     */
    public XacNhan() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbTitlle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbCode = new javax.swing.JLabel();
        inputCode = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        lbNoti = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(254, 244, 230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 47, 37));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Email:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, 75, 25));

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 75, 375, 25));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(60, 47, 37));
        jButton3.setText("Quay lại");
        jButton3.setBorder(null);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 125, 150, 35));

        jButton4.setBackground(new java.awt.Color(60, 47, 37));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Tiếp tục");
        jButton4.setBorder(null);
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 125, 150, 35));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Vui lòng nhập email mà bạn dùng để đăng ký tài khoản");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 450, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 47, 37));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitlle.setBackground(new java.awt.Color(60, 47, 37));
        lbTitlle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTitlle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitlle.setText("MÃ XÁC THỰC");
        lbTitlle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbTitlle, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 25, 250, 50));

        jPanel3.setBackground(new java.awt.Color(254, 244, 230));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCode.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCode.setForeground(new java.awt.Color(60, 47, 37));
        lbCode.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCode.setText("Mã xác nhận");
        jPanel3.add(lbCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, 150, 25));

        inputCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(inputCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 75, 300, 25));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(60, 47, 37));
        btnBack.setText("Quay lại");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 125, 150, 35));

        btnConfirm.setBackground(new java.awt.Color(60, 47, 37));
        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Xác nhận");
        btnConfirm.setBorder(null);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel3.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 125, 150, 35));

        lbNoti.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNoti.setText("Vui lòng nhập mã xác nhận được gửi qua email của bạn");
        jPanel3.add(lbNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 475, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 500, 175));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String user = "andinh";
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new XacThucTaiKhoan().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private Boolean checkCode(String user, String code)
    {
        try{ 
            Connection con = SQLConnection.getSQLConnection();
            String SQL = "SELECT MAND FROM XACNHAN WHERE MAND =? AND XACNHAN COLLATE Latin1_General_CS_AS = ?";
            PreparedStatement ps = con.prepareStatement(SQL); 
            ps.setString(1, user); 
            ps.setString(2, code); 
            ResultSet rs = ps.executeQuery(); 
            String ten = null;
            while (rs.next())
                ten = rs.getString(1);
            if (ten==null)
                return false;
            else
                return true;
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"xác thực mã không thành" + e);
            return false;
        }
    }
    
    private Boolean deleteCode(String user)
    {
        try{ 
            Connection con = SQLConnection.getSQLConnection();
            String SQL = "DELETE FROM XACNHAN WHERE MAND =?";
            PreparedStatement ps = con.prepareStatement(SQL); 
            ps.setString(1, user); 
            int kq = ps.executeUpdate(); 
            if (kq==0)
                return false;
            else
                return true;
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"không xóa được mã xác thực" + e);
            return false;
        }
    }
    
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (inputCode.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"chưa nhập mã"); 
        }
        else
        {
            if (checkCode(user,inputCode.getText()))
            {
                JOptionPane.showMessageDialog(this,"xóa được mã xác thực =" + deleteCode(user));
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Nhập mã xác thực không đúng");
            }
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JTextField inputCode;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbCode;
    private javax.swing.JLabel lbNoti;
    private javax.swing.JLabel lbTitlle;
    // End of variables declaration//GEN-END:variables
}
