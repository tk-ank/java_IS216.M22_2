/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Account;

import Check.EmailValidator;
import Check.PhoneCheck;
import Check.PhoneException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author kyanh
 */
public class DangKy extends javax.swing.JFrame {

    /**
     * Creates new form DangKy
     */
    public DangKy() {
        initComponents();
        btnSignUp.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jTextField5 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pnInfor = new java.awt.Panel();
        lbUsername = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        lbRePass = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbSex = new javax.swing.JLabel();
        lbNgSinh = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbUni = new javax.swing.JLabel();
        rAccept = new javax.swing.JCheckBox();
        btnSignUp = new javax.swing.JButton();
        inputUni = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        inputPhone = new javax.swing.JTextField();
        rFemale = new javax.swing.JCheckBox();
        rMale = new javax.swing.JCheckBox();
        inputName = new javax.swing.JTextField();
        inputUsername = new javax.swing.JTextField();
        btnSignUp1 = new javax.swing.JButton();
        inputRePass = new javax.swing.JPasswordField();
        inputPass = new javax.swing.JPasswordField();
        lbPhone1 = new javax.swing.JLabel();
        dcNgSinh = new com.toedter.calendar.JDateChooser();
        lbTitle = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(254, 244, 230));
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 458));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Tên trường:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 375, 200, 25));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Tên đăng nhập:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 175, 25));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Mật khẩu:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, 175, 25));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Email:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 325, 200, 25));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Xác nhận mật khẩu:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 125, 200, 25));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Họ và tên:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 175, 200, 25));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Giới tính: ");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 225, 200, 25));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Số điện thoại: ");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 275, 200, 25));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 375, 300, 25));

        jCheckBox4.setBackground(new java.awt.Color(254, 244, 230));
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox4.setText("Nữ");
        jCheckBox4.setIconTextGap(8);
        jPanel4.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 225, 150, 25));

        jCheckBox5.setBackground(new java.awt.Color(254, 244, 230));
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox5.setText("Nam");
        jCheckBox5.setIconTextGap(8);
        jPanel4.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 225, 150, 25));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 25, 300, 25));

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 75, 300, 25));

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 125, 300, 25));

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 175, 300, 25));

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 275, 300, 25));

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 325, 300, 25));

        jCheckBox6.setBackground(new java.awt.Color(254, 244, 230));
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox6.setText("Tôi cam kết những thông tin trên là hoàn toàn chính xác");
        jPanel4.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 425, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 51));
        jLabel19.setText("Thông báo khi có lỗi.");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 500, 260, 30));

        jButton2.setBackground(new java.awt.Color(60, 47, 37));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Đăng ký");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.setBorderPainted(false);
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 475, 150, 35));

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setName("frDangKy"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(58, 81, 153));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnInfor.setBackground(new java.awt.Color(254, 244, 230));
        pnInfor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbUsername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbUsername.setText("Tên đăng nhập:");
        pnInfor.add(lbUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 200, 25));

        lbPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbPass.setText("Mật khẩu:");
        pnInfor.add(lbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, 200, 25));

        lbRePass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbRePass.setText("Xác nhận mật khẩu:");
        pnInfor.add(lbRePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 125, 200, 25));

        lbName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbName.setText("Họ và tên:");
        pnInfor.add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 175, 200, 25));

        lbSex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbSex.setText("Giới tính: ");
        pnInfor.add(lbSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 225, 200, 25));

        lbNgSinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNgSinh.setText("Ngày sinh:");
        pnInfor.add(lbNgSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 275, 200, 25));

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbEmail.setText("Email:");
        pnInfor.add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 375, 200, 25));

        lbUni.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbUni.setText("Tên trường:");
        pnInfor.add(lbUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 425, 200, 25));

        rAccept.setBackground(new java.awt.Color(254, 244, 230));
        rAccept.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rAccept.setForeground(new java.awt.Color(102, 102, 102));
        rAccept.setText("Tôi cam kết những thông tin trên là hoàn toàn chính xác");
        rAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rAcceptActionPerformed(evt);
            }
        });
        pnInfor.add(rAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 475, -1, -1));

        btnSignUp.setBackground(new java.awt.Color(60, 47, 37));
        btnSignUp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("ĐĂNG KÝ");
        btnSignUp.setActionCommand("ĐANG KÝ");
        btnSignUp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSignUp.setBorderPainted(false);
        btnSignUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        pnInfor.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 525, 150, 35));

        inputUni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputUni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnInfor.add(inputUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 425, 300, 25));

        inputEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnInfor.add(inputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 375, 300, 25));

        inputPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnInfor.add(inputPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 325, 300, 25));

        rFemale.setBackground(new java.awt.Color(254, 244, 230));
        rFemale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rFemale.setText("Nữ");
        rFemale.setIconTextGap(8);
        rFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rFemaleActionPerformed(evt);
            }
        });
        pnInfor.add(rFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 225, 150, 25));

        rMale.setBackground(new java.awt.Color(254, 244, 230));
        rMale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rMale.setText("Nam");
        rMale.setIconTextGap(8);
        rMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMaleActionPerformed(evt);
            }
        });
        pnInfor.add(rMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 225, 150, 25));

        inputName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnInfor.add(inputName, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 175, 300, 25));

        inputUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnInfor.add(inputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 25, 300, 25));

        btnSignUp1.setBackground(new java.awt.Color(255, 255, 255));
        btnSignUp1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSignUp1.setForeground(new java.awt.Color(60, 47, 37));
        btnSignUp1.setText("HỦY");
        btnSignUp1.setActionCommand("ĐANG KÝ");
        btnSignUp1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSignUp1.setBorderPainted(false);
        btnSignUp1.setVerifyInputWhenFocusTarget(false);
        btnSignUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUp1ActionPerformed(evt);
            }
        });
        pnInfor.add(btnSignUp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 525, 169, 35));

        inputRePass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputRePass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnInfor.add(inputRePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 125, 300, 25));

        inputPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnInfor.add(inputPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 75, 300, 25));

        lbPhone1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbPhone1.setText("Số điện thoại: ");
        pnInfor.add(lbPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 325, 200, 25));

        dcNgSinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dcNgSinh.setDateFormatString("dd/MM/yyyy");
        dcNgSinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnInfor.add(dcNgSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 275, 300, 30));

        jPanel1.add(pnInfor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 561, 580));

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("ĐĂNG KÝ TÀI KHOẢN");
        jPanel1.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 13, 525, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUp1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new DangNhap().setVisible(true);
    }//GEN-LAST:event_btnSignUp1ActionPerformed

    public boolean checkSpecialCharacter(String s) {
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(s);
       // boolean b = m.matches();
        boolean b = m.find();
        if (b)
        {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập không dấu và không được có ký tự đặc biệt!", "Sai định dạng", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        else
            return true;
    }
    
    SimpleDateFormat sdf_ddMMyyyy = new SimpleDateFormat("dd/MM/yyyy");  
    SimpleDateFormat sdf_MMddyyyy = new SimpleDateFormat("MM/dd/yyyy");  

    public boolean CheckPass (String Pass, String RePass)
    {
        if (Pass.equals(RePass))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Mật khẩu không khớp", "Sai định dạng", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
  
    private boolean KiemTraNhapDu(String TenDN, String Pass, String RePass, String Name, String SDT, String Email, String Uni)
    {
        if(TenDN.isEmpty() || Pass.isEmpty() || RePass.isEmpty() || Name.isEmpty() || SDT.isEmpty() || Email.isEmpty() || Uni.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ các thông tin", "Thiếu thông tin", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else
        {
            return true;
        }
    }
    
    private boolean CheckEmail(String Email)
    {
        EmailValidator validator = new EmailValidator();
        if (validator.validate(Email)) {
            return true;
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Email không hợp lệ", "Sai định dạng", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean KiemTraNhapDung(String TenDN, String Pass, String RePass, String Email)
    {
        if (checkSpecialCharacter(TenDN) == true && CheckPass(Pass, RePass) == true && CheckEmail(Email) == true)
        {
            return true;
        }
        return false;
    }
    
    private boolean KiemTraChon (JCheckBox rMale, JCheckBox rFemale)
    {
        if (rMale.isSelected() || rFemale.isSelected())
            return true;
        return false;

    }
    
    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed

        // Tạo button group cho Giới tính
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(rMale);
        btnGroup.add(rFemale);
        
        //Lấy dữ liệu nhập từ bàn phím
        String TenDN = inputUsername.getText();
        String Pass = inputPass.getText();
        String RePass = inputRePass.getText();
        String HoTen = inputName.getText();
        int GTinh;
//            if(rMale.isSelected())
//            {
//                GTinh = 1;
//            }
//            else if(rFemale.isSelected())
//            {
//                GTinh = 0;
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(this, "Vui lòng chọn giới tính của bạn", "Thiếu thông tin", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
        String NgSinh;
        
        String SDT = inputPhone.getText();
        String Email = inputEmail.getText();
        String TenTruong = inputUni.getText();
        
        if (KiemTraNhapDu(TenDN, Pass, RePass, HoTen, SDT, Email, TenTruong) == true)
        {
            if (KiemTraChon(rMale, rFemale))
            {
                if(rMale.isSelected())
                {
                    GTinh = 1;
                }
                else
                {
                    GTinh = 0;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Thiếu thông tin", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try{
                NgSinh = sdf_MMddyyyy.format(dcNgSinh.getDate());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Ngày sinh chưa nhập hoặc sai định dạng", "Thiếu thông tin", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            PhoneCheck phoneCheck = new PhoneCheck();
            try {
                phoneCheck.checkPhone(SDT);
            } catch (PhoneException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Sai định dạng", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (KiemTraNhapDung(TenDN, Pass, RePass, Email))
            {
                String encryptedPass = new SHA256().encryptThisString(Pass);
                try
                {
                    Connection con;
                    con = SQLConnection.getSQLConnection(); 
                    String SQL = "INSERT INTO NGUOIDUNG(MAND, TENND, MATKHAU, NGSINH, GTINH, DTHOAI, EMAIL, TRUONG, NGDK) VALUES(?,?,?,?,?,?,?,?, (SELECT CONVERT (DATE,GETDATE())))";
                    PreparedStatement State = con.prepareStatement(SQL); 
                    State.setString(1, TenDN);
                    State.setString(2, HoTen);
                    State.setString(3, encryptedPass);
                    State.setString(4, NgSinh);
                    State.setInt(5, GTinh);
                    State.setString(6, SDT);
                    State.setString(7, Email);
                    State.setString(8, TenTruong);
                    int st = State.executeUpdate();  
                    if (st == 1)
                    {
                        JOptionPane.showMessageDialog(this, "Bạn đã đăng ký tài khoản thành công");
                        this.dispose();
                        new DangNhap().setVisible(true);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Đăng ký không thành công", "Lỗi không xác định", JOptionPane.ERROR_MESSAGE);

                    }
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(this, "Đăng ký không thành công \n" +ex.getMessage(), "Lỗi không xác định", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void rAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rAcceptActionPerformed
        if(rAccept.isSelected())
        {
            btnSignUp.setEnabled(true);
        }
        else
        {
            btnSignUp.setEnabled(false);;
        }
    }//GEN-LAST:event_rAcceptActionPerformed

    private void rMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMaleActionPerformed
        if (rMale.isSelected())
        {
            rFemale.setSelected(false);
        }
        else
        {
            rFemale.setSelected(true);
        }
    }//GEN-LAST:event_rMaleActionPerformed

    private void rFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rFemaleActionPerformed
        if (rFemale.isSelected())
        {
            rMale.setSelected(false);
        }
        else
        {
            rMale.setSelected(true);
        }
    }//GEN-LAST:event_rFemaleActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JButton btnSignUp1;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dcNgSinh;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputName;
    private javax.swing.JPasswordField inputPass;
    private javax.swing.JTextField inputPhone;
    private javax.swing.JPasswordField inputRePass;
    private javax.swing.JTextField inputUni;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbNgSinh;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbPhone1;
    private javax.swing.JLabel lbRePass;
    private javax.swing.JLabel lbSex;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUni;
    private javax.swing.JLabel lbUsername;
    private java.awt.Panel pnInfor;
    private javax.swing.JCheckBox rAccept;
    private javax.swing.JCheckBox rFemale;
    private javax.swing.JCheckBox rMale;
    // End of variables declaration//GEN-END:variables
}
