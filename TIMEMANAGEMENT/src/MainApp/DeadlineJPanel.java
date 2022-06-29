/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainApp;

import Account.SQLConnection;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author kyanh
 */
public class DeadlineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeadlineJPanel
     */
    private final String User;
    public DeadlineJPanel(String user) {
        initComponents();
        this.User = user;
        this.TaoBangDL();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelDL = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDL = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnNextDL = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtTenDL = new javax.swing.JTextField();
        datetxtHanDL = new com.toedter.calendar.JDateChooser();
        chboxFinish = new javax.swing.JCheckBox();
        btnSua = new javax.swing.JButton();
        btnPreDL = new javax.swing.JButton();
        panelThemDL = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTenDL_ThemDL = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnThemDL = new javax.swing.JButton();
        dateHanDL = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(600, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(254, 244, 230));
        jPanel2.setPreferredSize(new java.awt.Dimension(789, 650));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(58, 81, 153));
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        panelDL.setBackground(new java.awt.Color(254, 244, 230));
        panelDL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDL.setBackground(new java.awt.Color(254, 244, 230));
        tableDL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableDL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tableDL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDL.setRowHeight(25);
        tableDL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDL);

        panelDL.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 50, 550, 220));

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });
        panelDL.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 15, 425, 25));

        btnSearch.setBackground(new java.awt.Color(58, 81, 153));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setBorder(null);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        panelDL.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 15, 100, 25));

        jLabel1.setBackground(new java.awt.Color(58, 81, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(58, 81, 153));
        jLabel1.setText("Thông tin deadline");
        panelDL.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 325, 175, -1));

        btnNextDL.setBackground(new java.awt.Color(58, 81, 153));
        btnNextDL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextDL.setForeground(new java.awt.Color(255, 255, 255));
        btnNextDL.setText("< Deadline sắp tới hạn");
        btnNextDL.setBorder(null);
        btnNextDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextDLActionPerformed(evt);
            }
        });
        panelDL.add(btnNextDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 275, 180, 25));

        jPanel1.setBackground(new java.awt.Color(254, 244, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenDL.setBackground(new java.awt.Color(254, 244, 230));
        txtTenDL.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtTenDL.setText("Tên Deadline");
        jPanel1.add(txtTenDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 7, 525, 30));

        datetxtHanDL.setBackground(new java.awt.Color(254, 244, 230));
        datetxtHanDL.setDateFormatString("dd/MM/yyyy");
        datetxtHanDL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(datetxtHanDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 38, 200, 30));

        chboxFinish.setBackground(new java.awt.Color(254, 244, 230));
        chboxFinish.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chboxFinish.setText("Đã hoàn thành");
        chboxFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxFinishActionPerformed(evt);
            }
        });
        jPanel1.add(chboxFinish, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 125, 25));

        panelDL.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 350, 550, 75));

        btnSua.setBackground(new java.awt.Color(58, 81, 153));
        btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.setBorder(null);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        panelDL.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 435, 75, 25));

        btnPreDL.setBackground(new java.awt.Color(58, 81, 153));
        btnPreDL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPreDL.setForeground(new java.awt.Color(255, 255, 255));
        btnPreDL.setText("Deadline đã qua >");
        btnPreDL.setBorder(null);
        btnPreDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreDLActionPerformed(evt);
            }
        });
        panelDL.add(btnPreDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 275, 180, 25));

        jTabbedPane1.addTab("Deadline", panelDL);

        panelThemDL.setBackground(new java.awt.Color(254, 244, 230));
        panelThemDL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Thông tin deadline:");
        panelThemDL.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, -1, -1));

        txtTenDL_ThemDL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTenDL_ThemDL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelThemDL.add(txtTenDL_ThemDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 25, 350, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Hạn:");
        panelThemDL.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, -1, -1));

        btnThemDL.setBackground(new java.awt.Color(58, 81, 153));
        btnThemDL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThemDL.setForeground(new java.awt.Color(255, 255, 255));
        btnThemDL.setText("Thêm Deadline");
        btnThemDL.setBorder(null);
        btnThemDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDLActionPerformed(evt);
            }
        });
        panelThemDL.add(btnThemDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 125, 150, 35));

        dateHanDL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dateHanDL.setDateFormatString("dd/MM/yyyy");
        panelThemDL.add(dateHanDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 75, 350, 25));

        jTabbedPane1.addTab("Thêm Deadline", panelThemDL);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void tableDLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDLMouseClicked
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
        try{
            int row = tableDL.getSelectedRow();
            madl = listMaDL.get(row);
            txtTenDL.setText(listTenDL.get(row));
            datetxtHanDL.setDate(formatter.parse(listHanDL.get(row)));
            if (listNgayNop.get(row) == null)
            {
                chboxFinish.setSelected(false);
                //System.out.print("chưa hoàn thành");
            }
            else
            {
                chboxFinish.setSelected(true);
                //System.out.print("đã hoàn thành");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Không thể tải thông tin từ deadline đã chọn","Lỗi không xác định",JOptionPane.ERROR_MESSAGE);

        }
//        String t= sdf_ddMMyyyy.format(date);  
//        System.out.println(t);
        

    }//GEN-LAST:event_tableDLMouseClicked

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if (btnPreDL.isEnabled())
                LayDL(User, txtSearch.getText());
            else
                LayPreDL(User, txtSearch.getText());
        }
        return;
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        LayDL(User,txtSearch.getText());
    }//GEN-LAST:event_btnSearchActionPerformed

    private void chboxFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxFinishActionPerformed

        int index = listMaDL.indexOf(madl);
        if (index != -1)
        {
            if (chboxFinish.isSelected() == true){
                try{
                    Connection con = SQLConnection.getSQLConnection();
                    String SQL = "UPDATE DEADLINE SET NGAYNOP= (SELECT CONVERT (DATE, GETDATE())) WHERE MADL=?";
                    PreparedStatement ps = con.prepareStatement(SQL);
                    ps.setInt(1, madl);
                    ps.executeUpdate();
                    listNgayNop.set(index, today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                }catch (Exception e){
                    System.out.print("Lỗi tại cập nhật trạng thái" + e);
                }
            }else{
                try{
                    Connection con = SQLConnection.getSQLConnection();
                    String SQL = "UPDATE DEADLINE SET NGAYNOP= NULL WHERE MADL=?";
                    PreparedStatement ps = con.prepareStatement(SQL);
                    ps.setInt(1, madl);
                    ps.executeUpdate();
                    listNgayNop.set(index,null);
                }catch (Exception e){
                    System.out.print("Lỗi tại cập nhật trạng thái" + e);
                }
            }

            
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Chưa chọn deadline","Lỗi",JOptionPane.ERROR_MESSAGE);
            chboxFinish.setSelected(false);
        }
    }//GEN-LAST:event_chboxFinishActionPerformed

    private void btnNextDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextDLActionPerformed
        btnPreDL.setEnabled(true);
        btnNextDL.setEnabled(false);
        txtSearch.setText(null);
        LayDL(this.User,null);
    }//GEN-LAST:event_btnNextDLActionPerformed

    private void btnThemDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDLActionPerformed
        ThemDL(User);
    }//GEN-LAST:event_btnThemDLActionPerformed

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
        LayDL(this.User,null);
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (madl != 0)
        {
            if (KTraNhapSuaDL() == false)
            {
                JOptionPane.showMessageDialog(this,"Chỉnh sửa thông tin không được để trống","Lỗi định dạng",JOptionPane.ERROR_MESSAGE);
                return;
            }
            try{
                Connection con = SQLConnection.getSQLConnection();
                String SQL = "UPDATE DEADLINE SET TENDL=?, HAN=? WHERE MADL=?";
                PreparedStatement ps = con.prepareStatement(SQL);
                ps.setString(1,txtTenDL.getText());
                ps.setString(2, sdf_MMddyyyy.format(datetxtHanDL.getDate()));
                ps.setInt(3, madl);
                ps.executeUpdate();
                
                if (btnPreDL.isEnabled())
                    LayDL(this.User,null);
                else
                    LayPreDL(this.User,null);

            }catch (Exception e){
                JOptionPane.showMessageDialog(this,"Không thể sửa deadline \n"+e,"Lỗi Không xác định",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Chưa chọn deadline","Lỗi",JOptionPane.ERROR_MESSAGE);
            txtTenDL.setText(null);
            datetxtHanDL.setDate(null);
            return;
            
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnPreDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreDLActionPerformed
        btnNextDL.setEnabled(true);
        btnPreDL.setEnabled(false);
        txtSearch.setText(null);
        LayPreDL(this.User,null);
        
    }//GEN-LAST:event_btnPreDLActionPerformed

    DefaultTableModel dtmDL;
    ArrayList <Integer> listMaDL = new ArrayList <Integer> () ;
    ArrayList <String> listTenDL = new ArrayList <String> () ;
    ArrayList <String> listHanDL = new ArrayList <String> () ;
    ArrayList <String> listNgayNop = new ArrayList <String> () ;

    int madl;
    
    private void TaoBangDL()
    {
        dtmDL = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
           return false;
        }};
        String TieuDe[] ={"Tên deadline","Hạn"}; 
        dtmDL.setColumnIdentifiers(TieuDe);
        tableDL.setModel(dtmDL);
        setVisible(true);
        String ten = this.User;
        LayDL(ten,null);

    }
    

    private void LayPreDL(String user, String search)
    {
        RefreshTable();
        try{
                Connection con = SQLConnection.getSQLConnection();
                //String sp[] = new String[2];
                ResultSet rs;
                if (search == null)
                {
                    String SQL = "SELECT MADL, TENDL, HAN, NGAYNOP FROM DEADLINE "
                        + "WHERE MAND = ? AND HAN < (SELECT CONVERT (DATE, GETDATE())) ORDER BY HAN ASC ";
                    PreparedStatement ps = con.prepareStatement(SQL);
                    ps.setString(1,user);
                    rs = ps.executeQuery();
                }
                else
                {
                    String SQL = "SELECT MADL, TENDL, HAN, NGAYNOP FROM DEADLINE "
                        + "WHERE MAND = ? AND TENDL LIKE N'%"+ search +"%' AND HAN < (SELECT CONVERT (DATE, GETDATE())) ORDER BY HAN ASC ";
                    PreparedStatement ps = con.prepareStatement(SQL);
                    ps.setString(1,user);
                    rs = ps.executeQuery();
                }
                
                while(rs.next())
                {
                    listMaDL.add(rs.getInt(1));
                    listTenDL.add(rs.getString(2));
                    listHanDL.add(sdf_ddMMyyyy.format(rs.getDate(3)));
                    if (rs.getObject(4) == null)
                        listNgayNop.add(null);
                    else
                        listNgayNop.add(sdf_ddMMyyyy.format(rs.getDate(4)));
                    dtmDL.addRow(new String [] {rs.getString(2),sdf_ddMMyyyy.format(rs.getDate(3))});
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,"Lấy danh sách deadline không thành công!\n"+e,"Lỗi không xác định",JOptionPane.ERROR_MESSAGE);
            }
    }
    SimpleDateFormat sdf_ddMMyyyy = new SimpleDateFormat("dd/MM/yyyy");  
    SimpleDateFormat sdf_MMddyyyy = new SimpleDateFormat("MM/dd/yyyy");  
   LocalDate today = LocalDate.now();  
//    String today = sdf.format(now); 
   
    private void RefreshTable()
    {
        listMaDL.clear();
        listTenDL.clear();
        listHanDL.clear();
        txtTenDL.setText(null);
        datetxtHanDL.setDate(null);
        madl=0;
        dtmDL.setRowCount(0);
    }
    
    private void LayDL(String user, String search)
    {
        RefreshTable();
        btnNextDL.setEnabled(false);
        btnPreDL.setEnabled(true);
        try{
                Connection con = SQLConnection.getSQLConnection();
                //String sp[] = new String[2];
                ResultSet rs;
                if (search == null)
                {
                    String SQL = "SELECT MADL, TENDL, HAN, NGAYNOP FROM DEADLINE "
                        + "WHERE MAND = ? AND HAN >= (SELECT CONVERT (DATE, GETDATE())) ORDER BY HAN ASC ";
                    PreparedStatement ps = con.prepareStatement(SQL);
                    ps.setString(1,user);
                    rs = ps.executeQuery();
                }
                else
                {
                    String SQL = "SELECT MADL, TENDL, HAN, NGAYNOP FROM DEADLINE "
                        + "WHERE MAND = ? AND TENDL LIKE N'%"+ search +"%' AND HAN >= (SELECT CONVERT (DATE, GETDATE())) ORDER BY HAN ASC ";
                    PreparedStatement ps = con.prepareStatement(SQL);
                    ps.setString(1,user);
                    rs = ps.executeQuery();
                }
                
                while(rs.next())
                {
                    listMaDL.add(rs.getInt(1));
                    listTenDL.add(rs.getString(2));
                    listHanDL.add(sdf_ddMMyyyy.format(rs.getDate(3)));
                    if (rs.getObject(4) == null)
                        listNgayNop.add(null);
                    else
                        listNgayNop.add(sdf_ddMMyyyy.format(rs.getDate(4)));
                    dtmDL.addRow(new String [] {rs.getString(2),sdf_ddMMyyyy.format(rs.getDate(3))});
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,"Lấy danh sách deadline không thành công!\n"+e,"Lỗi không xác định",JOptionPane.ERROR_MESSAGE);
            }
    }
    
    private Boolean KTraNgayDL (Date themDL)
    {
        Date date = Timestamp.valueOf(LocalDateTime.now());
        int Sosanh = themDL.compareTo(date);
        if (Sosanh < 0)
            return false;
        return true;
    }
    
    private Boolean KTraNhapThemDL(){
        if (txtTenDL_ThemDL.getText().isEmpty()){
            return false;
        }
        try{
            String date = sdf_ddMMyyyy.format(dateHanDL.getDate());
        }catch(Exception e)
        {
            return false;
        }
        return true;
    }
    
    private Boolean KTraNhapSuaDL(){
        if (txtTenDL.getText().isEmpty()){
            return false;
        }
        try{
            String date = sdf_ddMMyyyy.format(datetxtHanDL.getDate());
        }catch(Exception e)
        {
            return false;
        }
        return true;
    }
    
    
    private void ThemDL(String user)
    {
        if (KTraNhapThemDL() == false)
        {
            JOptionPane.showMessageDialog(this,"Nhập đúng và đủ thông tin","Lỗi định dạng",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (KTraNgayDL(dateHanDL.getDate()) == false)
        {
            JOptionPane.showMessageDialog(this,"Hạn deadline không thể sớm hơn hay trùng ngày hôm nay!","Lỗi định dạng",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            Connection con = SQLConnection.getSQLConnection();
            String SQL = "INSERT INTO DEADLINE(MAND, TENDL, HAN, NGAYNOP) VALUES (?,?,?,NULL) ";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1,user);
            ps.setString(2,txtTenDL_ThemDL.getText());
            ps.setString(3,sdf_MMddyyyy.format(dateHanDL.getDate()));
            int kq = ps.executeUpdate();
            if (kq == 1)
            {
                JOptionPane.showMessageDialog(this,"Thêm deadline thành công");
                txtTenDL_ThemDL.setText(null);
                dateHanDL.setDate(null);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Thêm deadline không thành công!","Lỗi không xác định",JOptionPane.ERROR_MESSAGE);
            }
                
            
        }catch (Exception e){
                JOptionPane.showMessageDialog(this,"Thêm deadline không thành công\n"+e,"Lỗi không xác định",JOptionPane.ERROR_MESSAGE);
        }     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNextDL;
    private javax.swing.JButton btnPreDL;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThemDL;
    private javax.swing.JCheckBox chboxFinish;
    private com.toedter.calendar.JDateChooser dateHanDL;
    private com.toedter.calendar.JDateChooser datetxtHanDL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelDL;
    private javax.swing.JPanel panelThemDL;
    private javax.swing.JTable tableDL;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenDL;
    private javax.swing.JTextField txtTenDL_ThemDL;
    // End of variables declaration//GEN-END:variables
}
