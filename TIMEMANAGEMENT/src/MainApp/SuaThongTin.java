/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainApp;

import Account.SQLConnection;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author kyanh
 */
public class SuaThongTin extends javax.swing.JFrame {

    private String User;

    /**
     * Creates new form SuaThongTin
     */
    public SuaThongTin(String user) {
        initComponents();
        setVisible(true);
        this.User = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfTruong = new javax.swing.JTextField();
        jcbNu = new javax.swing.JCheckBox();
        jcbNam = new javax.swing.JCheckBox();
        jtfHoTen = new javax.swing.JTextField();
        jtfSdt = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        btnSuaTT = new javax.swing.JButton();
        jlbLoi = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        dcNgSinh = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(58, 81, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(254, 244, 230));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 458));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Tên trường:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 275, 150, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Họ và tên:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 150, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Ngày sinh:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, 150, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Email:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 225, 150, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Giới tính: ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 125, 150, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Số điện thoại: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 175, 150, 25));

        jtfTruong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfTruong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jtfTruong, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 275, 275, 25));

        jcbNu.setBackground(new java.awt.Color(254, 244, 230));
        jcbNu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbNu.setText("Nữ");
        jcbNu.setIconTextGap(8);
        jPanel2.add(jcbNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 125, 125, 25));

        jcbNam.setBackground(new java.awt.Color(254, 244, 230));
        jcbNam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbNam.setText("Nam");
        jcbNam.setIconTextGap(8);
        jPanel2.add(jcbNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 125, 125, 25));

        jtfHoTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfHoTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jtfHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 25, 275, 25));

        jtfSdt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfSdt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jtfSdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 175, 275, 25));

        jtfEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 225, 275, 25));

        btnSuaTT.setBackground(new java.awt.Color(58, 81, 153));
        btnSuaTT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSuaTT.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaTT.setText("Chỉnh sửa");
        btnSuaTT.setBorder(null);
        btnSuaTT.setBorderPainted(false);
        btnSuaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaTTActionPerformed(evt);
            }
        });
        jPanel2.add(btnSuaTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 150, 35));

        jlbLoi.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(jlbLoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 260, 30));

        btnHuy.setBackground(new java.awt.Color(255, 255, 255));
        btnHuy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(58, 81, 153));
        btnHuy.setText("Hủy");
        btnHuy.setBorder(null);
        btnHuy.setBorderPainted(false);
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel2.add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 320, 150, 35));
        jPanel2.add(dcNgSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 75, 275, 25));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 76, 475, 375));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHỈNH SỬA TÀI KHOẢN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 25, 321, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    SimpleDateFormat sdf_ddMMyyyy = new SimpleDateFormat("dd/MM/yyyy");  
    SimpleDateFormat sdf_MMddyyyy = new SimpleDateFormat("MM/dd/yyyy");  
    
    private void btnSuaTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaTTActionPerformed
        String HoTen = jtfHoTen.getText();
        String NgSinh;
        try{
            NgSinh= sdf_MMddyyyy.format(dcNgSinh.getDate());
        }catch(Exception ex){
            jlbLoi.setText("Vui lòng nhập thông tin đầy đủ và chính xác");
            return;
        }
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
//        String NgSinh = sdf.format(jDateChooser.getDate());
        String Sdt = jtfSdt.getText();
        String Email = jtfEmail.getText();
        String Truong = jtfTruong.getText();
        int GTinh;
        if (HoTen.isEmpty() || Sdt.isEmpty() ||Email.isEmpty() || Truong.isEmpty()||
            (jcbNam.isSelected() && jcbNu.isSelected()) || (!jcbNam.isSelected() && !jcbNu.isSelected())) {
            jlbLoi.setText("Vui lòng nhập thông tin đầy đủ và chính xác");
        }
        else {
            try{
                if (jcbNam.isSelected()) GTinh = 1;
                else GTinh = 0;
                Connection conn = SQLConnection.getSQLConnection();
                String Sql = "update NGUOIDUNG\n" +
                "set TENND = ?, NGSINH =?, GTINH = ?, DTHOAI = ?, Email = ?, TRUONG = ?\n" +
                "where MAND = ?" ;
                PreparedStatement ps = conn.prepareStatement(Sql);
                ps.setString(1, HoTen);
                ps.setString(2,NgSinh);
                ps.setInt(3, GTinh);
                ps.setString(4, Sdt);
                ps.setString(5, Email);
                ps.setString(6, Truong);
                ps.setString(7, this.User);
                int rs = ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Chỉnh sửa thành công!");
                this.dispose();
            }
            catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
                //jlbLoi.setText("Vui lÃ²ng nháº­p thÃ´ng tin Ä‘Ãºng!");
            }

        }
    }//GEN-LAST:event_btnSuaTTActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnSuaTT;
    private com.toedter.calendar.JDateChooser dcNgSinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jcbNam;
    private javax.swing.JCheckBox jcbNu;
    private javax.swing.JLabel jlbLoi;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfHoTen;
    private javax.swing.JTextField jtfSdt;
    private javax.swing.JTextField jtfTruong;
    // End of variables declaration//GEN-END:variables
}
