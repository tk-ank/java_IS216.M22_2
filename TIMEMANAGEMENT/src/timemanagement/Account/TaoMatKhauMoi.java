/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package timemanagement.Account;

/**
 *
 * @author kyanh
 */
public class TaoMatKhauMoi extends javax.swing.JFrame {

    /**
     * Creates new form TaoMatKhauMoi
     */
    public TaoMatKhauMoi() {
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
        lbTiitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbRePass = new javax.swing.JLabel();
        inputRePass = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        lbPass = new javax.swing.JLabel();
        inputPass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 47, 37));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTiitle.setBackground(new java.awt.Color(60, 47, 37));
        lbTiitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTiitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTiitle.setText("ĐỔI MẬT KHẨU");
        lbTiitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbTiitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 25, 300, 50));

        jPanel3.setBackground(new java.awt.Color(254, 244, 230));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbRePass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbRePass.setForeground(new java.awt.Color(60, 47, 37));
        lbRePass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbRePass.setText("Nhập lại mật khẩu");
        jPanel3.add(lbRePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, 175, 25));

        inputRePass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputRePass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(inputRePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 75, 275, 25));

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

        lbPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPass.setForeground(new java.awt.Color(60, 47, 37));
        lbPass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPass.setText("Mật khẩu");
        jPanel3.add(lbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 175, 25));

        inputPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(inputPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 25, 275, 25));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 500, 175));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new DangNhap().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JTextField inputPass;
    private javax.swing.JTextField inputRePass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbRePass;
    private javax.swing.JLabel lbTiitle;
    // End of variables declaration//GEN-END:variables
}
