/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainApp;

/**
 *
 * @author kyanh
 */

import Controller.ChuyenManHinh;
import DanhMuc.DanhMuc;
import java.util.ArrayList;
import java.util.List;
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
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 46, 51));

        jpnView.setBackground(new java.awt.Color(204, 204, 204));

        jpnView1.setBackground(new java.awt.Color(204, 204, 204));
        jpnView.add(jpnView1);

        jpnTrangChu.setBackground(new java.awt.Color(102, 102, 102));
        jpnTrangChu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        jlbTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTrangChu.setText("Trang chủ");
        jpnTrangChu.add(jlbTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 220, 50));

        jpnThongTin.setBackground(new java.awt.Color(46, 51, 46));
        jpnThongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbThongTin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbThongTin.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongTin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbThongTin.setText("Thông tin cá nhân");
        jlbThongTin.setToolTipText("");
        jpnThongTin.add(jlbThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 50));

        jpnTkb.setBackground(new java.awt.Color(46, 51, 46));
        jpnTkb.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTkb.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbTkb.setForeground(new java.awt.Color(255, 255, 255));
        jlbTkb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTkb.setText("Thời khóa biểu");
        jlbTkb.setToolTipText("");
        jpnTkb.add(jlbTkb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 50));

        jpnDeadline.setBackground(new java.awt.Color(46, 51, 46));
        jpnDeadline.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbDeadline.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbDeadline.setForeground(new java.awt.Color(255, 255, 255));
        jlbDeadline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbDeadline.setText("Deadline");
        jlbDeadline.setToolTipText("");
        jpnDeadline.add(jlbDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 50));

        jpnTodolist.setBackground(new java.awt.Color(46, 51, 46));
        jpnTodolist.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTodolist.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbTodolist.setForeground(new java.awt.Color(255, 255, 255));
        jlbTodolist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTodolist.setText("Todo list");
        jlbTodolist.setToolTipText("");
        jpnTodolist.add(jlbTodolist, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, -3, 230, 50));

        btnDangXuat.setBackground(new java.awt.Color(46, 51, 46));
        btnDangXuat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Đăng xuất");
        jLabel7.setToolTipText("");
        btnDangXuat.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, -5, -1, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnTkb, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnDeadline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnTodolist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnTkb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnTodolist, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnDangXuat;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
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
    // End of variables declaration//GEN-END:variables
}
