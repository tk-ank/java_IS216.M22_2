/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Account;

/**
 *
 * @author kyanh
 */
public class DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        inputPass = new javax.swing.JTextField();
        inputUsername = new javax.swing.JTextField();
        lbUsername = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        btnSignIn = new javax.swing.JButton();
        lbSignUp = new javax.swing.JLabel();
        lbForgot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 47, 37));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(254, 244, 230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(inputPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 100, 300, 25));

        inputUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(inputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 50, 300, 25));

        lbUsername.setBackground(new java.awt.Color(254, 244, 230));
        lbUsername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbUsername.setForeground(new java.awt.Color(60, 47, 37));
        lbUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbUsername.setText("Tên đăng nhập");
        lbUsername.setAlignmentY(0.0F);
        lbUsername.setName(""); // NOI18N
        lbUsername.setOpaque(true);
        jPanel2.add(lbUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 50, 150, 25));

        lbPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPass.setForeground(new java.awt.Color(60, 47, 37));
        lbPass.setText("Mật khẩu");
        jPanel2.add(lbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 100, 150, 25));

        btnSignIn.setBackground(new java.awt.Color(60, 47, 37));
        btnSignIn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("Đăng nhập");
        btnSignIn.setBorder(null);
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 150, 150, 35));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 500, 200));

        lbSignUp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbSignUp.setForeground(new java.awt.Color(255, 255, 255));
        lbSignUp.setText("Đăng ký");
        lbSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSignUpMouseClicked(evt);
            }
        });
        jPanel1.add(lbSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 50, 75, 25));

        lbForgot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbForgot.setForeground(new java.awt.Color(255, 255, 255));
        lbForgot.setText("Quên mật khẩu?");
        lbForgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbForgotMouseClicked(evt);
            }
        });
        jPanel1.add(lbForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 125, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbForgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbForgotMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new XacThucTaiKhoan().setVisible(true);
    }//GEN-LAST:event_lbForgotMouseClicked

    private void lbSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSignUpMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new DangKy().setVisible(true);
    }//GEN-LAST:event_lbSignUpMouseClicked

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignInActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JTextField inputPass;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbForgot;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbSignUp;
    private javax.swing.JLabel lbUsername;
    // End of variables declaration//GEN-END:variables
}
