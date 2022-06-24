/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainApp;

import java.sql.*;
import Account.SQLConnection;
import java.awt.Color;

/**
 *
 * @author kyanh
 */
public class ThongTinJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThongTinJPanel
     */
    private String User;
    public ThongTinJPanel(String user) {
        initComponents();
        this.User = user;
//        tenUser.setText(this.User);
        try{
            Connection con = SQLConnection.getSQLConnection();
            ResultSet rs;
            String SQL = "SELECT TENND, TRUONG, GTINH, DTHOAI, EMAIL, NGDK FROM NGUOIDUNG WHERE MAND = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, this.User);
            rs = ps.executeQuery();
            while(rs.next()){
                tenUser.setText(rs.getString(1));                
                Truong.setText(rs.getString(2));
//                jlbNSinh.setText(rs.getString(3));
                if (rs.getInt(3)==1)
                    jlbGTinh.setText("Nam");
                else
                    jlbGTinh.setText("Nữ");
                jlbSdt.setText(rs.getString(4));
                jlbEmail.setText(rs.getString(5));
                jlbNDangKy.setText(rs.getString(6));
            }
        }
        catch (Exception e){
            System.out.print("Lỗi" + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        tenUser = new javax.swing.JLabel();
        Truong = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlbSuaTT = new javax.swing.JLabel();
        jlbGTinh = new javax.swing.JLabel();
        jlbNSinh = new javax.swing.JLabel();
        jlbSdt = new javax.swing.JLabel();
        jlbEmail = new javax.swing.JLabel();
        jlbNDangKy = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 244, 230));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(58, 81, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tenUser.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        tenUser.setForeground(new java.awt.Color(255, 255, 255));
        tenUser.setText("jLabel1");
        jPanel3.add(tenUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 39, 505, 34));

        Truong.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Truong.setForeground(new java.awt.Color(204, 204, 204));
        Truong.setText("jLabel1");
        jPanel3.add(Truong, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 83, 462, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ngày sinh:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Giới tính:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 222, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Số điện thoại:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 285, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Email:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 353, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Ngày đăng ký: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 417, -1, -1));

        jlbSuaTT.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jlbSuaTT.setForeground(new java.awt.Color(58, 81, 153));
        jlbSuaTT.setText("Chỉnh sửa thông tin");
        jlbSuaTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbSuaTTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbSuaTTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbSuaTTMouseExited(evt);
            }
        });
        add(jlbSuaTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 170, -1));

        jlbGTinh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbGTinh.setText("jLabel7");
        add(jlbGTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 133, -1));

        jlbNSinh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbNSinh.setText("jLabel7");
        add(jlbNSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 156, 133, -1));

        jlbSdt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbSdt.setText("jLabel7");
        add(jlbSdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 283, 133, -1));

        jlbEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbEmail.setText("jLabel7");
        add(jlbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 351, 133, -1));

        jlbNDangKy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbNDangKy.setText("jLabel7");
        add(jlbNDangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 415, 133, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jlbSuaTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaTTMouseClicked
        new SuaThongTin(this.User);
    }//GEN-LAST:event_jlbSuaTTMouseClicked

    private void jlbSuaTTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaTTMouseEntered
        jlbSuaTT.setForeground(Color.lightGray);
    }//GEN-LAST:event_jlbSuaTTMouseEntered

    private void jlbSuaTTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSuaTTMouseExited
        jlbSuaTT.setForeground(Color.BLUE);
    }//GEN-LAST:event_jlbSuaTTMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Truong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbGTinh;
    private javax.swing.JLabel jlbNDangKy;
    private javax.swing.JLabel jlbNSinh;
    private javax.swing.JLabel jlbSdt;
    private javax.swing.JLabel jlbSuaTT;
    private javax.swing.JLabel tenUser;
    // End of variables declaration//GEN-END:variables
}
