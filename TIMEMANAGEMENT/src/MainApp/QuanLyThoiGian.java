/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainApp;

/**
 *
 * @author kyanh
 */

import Account.DangNhap;
import Controller.ChuyenManHinh;
import DanhMuc.DanhMuc;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class QuanLyThoiGian extends javax.swing.JFrame {

    /*
     * Creates new form QuanLyThoiGian
     */
    private String User;
    public QuanLyThoiGian(String user) {
        initComponents();
        setVisible(true);
        this.User = user;
        ChuyenManHinh cmh = new ChuyenManHinh(jpnView, user);
        cmh.setView(jpnTrangChu, jlbTrangChu);
        List<DanhMuc> listItem = new ArrayList<>();
        listItem.add(new DanhMuc("TrangChu",jpnTrangChu, jlbTrangChu));
        listItem.add(new DanhMuc("ThongTin",jpnThongTin, jlbThongTin));
        listItem.add(new DanhMuc("Tkb",jpnTkb, jlbTkb));
        listItem.add(new DanhMuc("Deadline",jpnDeadline, jlbDeadline));
        listItem.add(new DanhMuc("Todolist",jpnTodolist, jlbTodolist));
        cmh.setEvent(listItem);
        
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
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
        jpnView = new javax.swing.JPanel();
        jpnView1 = new javax.swing.JPanel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jpnThongTin = new javax.swing.JPanel();
        jlbThongTin = new javax.swing.JLabel();
        jpnTkb = new javax.swing.JPanel();
        jlbTkb = new javax.swing.JLabel();
        jpnDeadline = new javax.swing.JPanel();
        jlbDeadline = new javax.swing.JLabel();
        jpnTodolist = new javax.swing.JPanel();
        jlbTodolist = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JPanel();
        lbDangXuat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 46, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnView.setBackground(new java.awt.Color(204, 204, 204));
        jpnView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnView1.setBackground(new java.awt.Color(204, 204, 204));
        jpnView.add(jpnView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 5, -1, -1));

        jPanel1.add(jpnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 600, 500));

        jpnTrangChu.setBackground(new java.awt.Color(102, 102, 102));
        jpnTrangChu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        jlbTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbTrangChu.setText("Trang chủ");
        jpnTrangChu.add(jlbTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        jPanel1.add(jpnTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 50));

        jpnThongTin.setBackground(new java.awt.Color(46, 51, 46));
        jpnThongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbThongTin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbThongTin.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongTin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbThongTin.setText("Thông tin cá nhân");
        jlbThongTin.setToolTipText("");
        jpnThongTin.add(jlbThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        jPanel1.add(jpnThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 50));

        jpnTkb.setBackground(new java.awt.Color(46, 51, 46));
        jpnTkb.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTkb.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbTkb.setForeground(new java.awt.Color(255, 255, 255));
        jlbTkb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbTkb.setText("Thời khóa biểu");
        jlbTkb.setToolTipText("");
        jpnTkb.add(jlbTkb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        jPanel1.add(jpnTkb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 50));

        jpnDeadline.setBackground(new java.awt.Color(46, 51, 46));
        jpnDeadline.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbDeadline.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbDeadline.setForeground(new java.awt.Color(255, 255, 255));
        jlbDeadline.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbDeadline.setText("Deadline");
        jlbDeadline.setToolTipText("");
        jpnDeadline.add(jlbDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        jPanel1.add(jpnDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 50));

        jpnTodolist.setBackground(new java.awt.Color(46, 51, 46));
        jpnTodolist.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTodolist.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbTodolist.setForeground(new java.awt.Color(255, 255, 255));
        jlbTodolist.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbTodolist.setText("Todo list");
        jlbTodolist.setToolTipText("");
        jpnTodolist.add(jlbTodolist, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        jPanel1.add(jpnTodolist, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 50));

        btnDangXuat.setBackground(new java.awt.Color(46, 51, 46));
        btnDangXuat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        lbDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDangXuat.setText("Đăng xuất");
        lbDangXuat.setToolTipText("");
        lbDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDangXuatMouseClicked(evt);
            }
        });
        btnDangXuat.add(lbDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 50));

        jPanel1.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDangXuatMouseClicked
        int result = JOptionPane.showConfirmDialog(this,"Sure? Bạn có muốn đăng xuất?", "Đăng xuất",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
               this.dispose();
               new DangNhap().setVisible(true);
            }
    }//GEN-LAST:event_lbDangXuatMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnDangXuat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbDeadline;
    private javax.swing.JLabel jlbThongTin;
    private javax.swing.JLabel jlbTkb;
    private javax.swing.JLabel jlbTodolist;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JPanel jpnDeadline;
    private javax.swing.JPanel jpnThongTin;
    private javax.swing.JPanel jpnTkb;
    private javax.swing.JPanel jpnTodolist;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnView;
    private javax.swing.JPanel jpnView1;
    private javax.swing.JLabel lbDangXuat;
    // End of variables declaration//GEN-END:variables
}
