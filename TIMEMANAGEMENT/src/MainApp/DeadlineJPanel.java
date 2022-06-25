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
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        chboxFinish = new javax.swing.JCheckBox();
        btnSua = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtTenDL = new javax.swing.JLabel();
        txtHanDL = new javax.swing.JLabel();
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

        panelDL.setBackground(new java.awt.Color(254, 244, 230));
        panelDL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelDL.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 50, 550, 275));

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });
        panelDL.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 15, 325, 25));

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
        panelDL.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 15, 100, 25));

        jLabel1.setBackground(new java.awt.Color(58, 81, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(58, 81, 153));
        jLabel1.setText("Thông tin deadline");
        panelDL.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 340, 175, -1));

        chboxFinish.setBackground(new java.awt.Color(254, 244, 230));
        chboxFinish.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chboxFinish.setText("Đã hoàn thành");
        chboxFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxFinishActionPerformed(evt);
            }
        });
        panelDL.add(chboxFinish, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 125, 25));

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
        panelDL.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 15, 75, 25));

        jPanel1.setBackground(new java.awt.Color(254, 244, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenDL.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtTenDL.setText("Tên deadline");
        jPanel1.add(txtTenDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 525, 25));

        txtHanDL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHanDL.setText("Hạn nộp");
        jPanel1.add(txtHanDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 40, 525, 25));

        panelDL.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 365, 550, 75));

        jTabbedPane1.addTab("Deadline", panelDL);

        panelThemDL.setBackground(new java.awt.Color(254, 244, 230));

        jLabel2.setText("Thông tin deadline");

        jLabel5.setText("Hạn");

        btnThemDL.setText("Thêm Deadline");
        btnThemDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelThemDLLayout = new javax.swing.GroupLayout(panelThemDL);
        panelThemDL.setLayout(panelThemDLLayout);
        panelThemDLLayout.setHorizontalGroup(
            panelThemDLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThemDLLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelThemDLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panelThemDLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenDL_ThemDL, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(dateHanDL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(326, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThemDLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemDL)
                .addGap(36, 36, 36))
        );
        panelThemDLLayout.setVerticalGroup(
            panelThemDLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThemDLLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelThemDLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenDL_ThemDL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelThemDLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(dateHanDL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnThemDL)
                .addContainerGap(336, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thêm Deadline", panelThemDL);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void tableDLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDLMouseClicked
        int row = tableDL.getSelectedRow();
        madl = listMaDL.get(row);
        txtTenDL.setText(listTenDL.get(row));
        txtHanDL.setText(listHanDL.get(row));
        if (listNgayNop.get(row) == null)
        chboxFinish.setSelected(false);
        else
        chboxFinish.setSelected(true);
    }//GEN-LAST:event_tableDLMouseClicked

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            layDL(User, txtSearch.getText());
        }
        return;
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        layDL(User,txtSearch.getText());
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

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (madl != 0)
        {
            try{
                Connection con = SQLConnection.getSQLConnection();
                String SQL = "UPDATE DEADLINE SET TENDL=?, HAN=? WHERE MADL=?";
                PreparedStatement ps = con.prepareStatement(SQL);
                ps.setString(1,txtTenDL.getText());
                ps.setString(2, sdf_MMddyyyy.format(sdf_ddMMyyyy.parse(txtHanDL.getText())));
                ps.setInt(3, madl);
                ps.executeUpdate();

            }catch (Exception e){
                System.out.print("Lỗi tạo bảng lấy deadline" + e);
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDLActionPerformed
        ThemDL(User);
    }//GEN-LAST:event_btnThemDLActionPerformed

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
        String ten = User;
        layDL(ten,null);

    }
    

    SimpleDateFormat sdf_ddMMyyyy = new SimpleDateFormat("dd/MM/yyyy");  
SimpleDateFormat sdf_MMddyyyy = new SimpleDateFormat("MM/dd/yyyy");  
   LocalDate today = LocalDate.now();  
//    String today = sdf.format(now);  
    
    private void layDL(String user, String search)
    {
        listMaDL.clear();
        listTenDL.clear();
        listHanDL.clear();
        txtTenDL.setText(null);
        txtHanDL.setText(null);
        madl=0;
        
        dtmDL.setRowCount(0);
        try{
                Connection con = SQLConnection.getSQLConnection();
                //String sp[] = new String[2];
                ResultSet rs;
                if (search == null)
                {
                    String SQL = "SELECT MADL, TENDL, HAN, NGAYNOP FROM DEADLINE "
                        + "WHERE MAND = ? AND HAN > (SELECT CONVERT (DATE, GETDATE())) ORDER BY HAN ASC ";
                    PreparedStatement ps = con.prepareStatement(SQL);
                    ps.setString(1,user);
                    rs = ps.executeQuery();
                }
                else
                {
                    String SQL = "SELECT MADL, TENDL, HAN, NGAYNOP FROM DEADLINE "
                        + "WHERE MAND = ? AND TENDL LIKE N'%"+ search +"%' AND HAN > (SELECT CONVERT (DATE, GETDATE())) ORDER BY HAN ASC ";
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
                System.out.print("Lỗi tạo bảng lấy deadline" + e);
            }
    }
    
    private void ThemDL(String user)
    {
        try{
            Connection con = SQLConnection.getSQLConnection();
            String SQL = "INSERT INTO DEADLINE(MAND, TENDL, HAN, NGAYNOP) VALUES (?,?,?,NULL) ";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1,user);
            ps.setString(2,txtTenDL_ThemDL.getText());
            ps.setString(3,sdf_MMddyyyy.format(dateHanDL.getDate()));
            ps.executeUpdate();
            
        }catch (Exception e){
            System.out.print("Lỗi thêm deadline" + e); 
        }     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThemDL;
    private javax.swing.JCheckBox chboxFinish;
    private com.toedter.calendar.JDateChooser dateHanDL;
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
    private javax.swing.JLabel txtHanDL;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtTenDL;
    private javax.swing.JTextField txtTenDL_ThemDL;
    // End of variables declaration//GEN-END:variables
}
