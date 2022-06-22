/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

import java.sql.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author DELL
 */
public class Mail {
    
   
    
    public void SendMailto (String toUserMail, String code) throws Exception
    {
        //String toUserMail="hang2312@gmail.com";
        Properties p = System.getProperties();
        p.put("mail.smtp.port", "587");
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable","true");
        p.put("mail.smtp.host", "smtp.gmail.com");
        
        String fromUser = "schess.uit@gmail.com";
        String fromUserPassword = "lllxnqvgagpxtptu";
        
        Session newSession = Session.getDefaultInstance(p,new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(fromUser,fromUserPassword);
            }
        });
        
        Message message = prepareMessage(newSession, fromUser, toUserMail, code);
        Transport.send(message);
        System.out.print("successful");
    }
    
//    try{ 
//            Connection con = SQLConnection.getSQLConnection();
//            String SQL = "INSERT INTO XACNHAN(MAND,XACNHAN) VALUES(?,?)";
//            PreparedStatement ps = con.prepareStatement(SQL); 
//            ps.setInt(1, madl); 
//            ps.setString(2, code); 
//            ps.executeUpdate(); 
//        }catch (Exception e){
//            System.out.print("Lỗi tạo bảng lấy deadline" + e);
//        }
    
    public Boolean setCodetoSQL(String user, String code)
    {
        try{ 
            Connection con = SQLConnection.getSQLConnection();
            String SQL = "UPDATE XACNHAN SET XACNHAN = ? WHERE MAND=?";
            PreparedStatement ps = con.prepareStatement(SQL); 
            ps.setString(1, code); 
            ps.setString(2, user); 
            int kq = ps.executeUpdate(); 
            
            if (kq == 0) //Không có người dùng nào tên user
            {
                try{
                    String SQL1 = "INSERT INTO XACNHAN(MAND,XACNHAN) VALUES(?,?)";
                    PreparedStatement ps1 = con.prepareStatement(SQL1); 
                    ps1.setString(1, user); 
                    ps1.setString(2, code); 
                    ps1.executeUpdate(); 
                }catch (Exception e){
                    System.out.print("Lỗi tạo insert mã" + e);
                }
            }
            return true;
        }catch (Exception e){
            System.out.print("Lỗi tạo cập nhật mã" + e);
            return false;
        }
        
    }
    
    private String getUser(String mail)
    {
        try{ 
            Connection con = SQLConnection.getSQLConnection();
            String SQL = "SELECT MAND FROM NGUOIDUNG WHERE EMAIL=?";
            PreparedStatement ps = con.prepareStatement(SQL); 
            ps.setString(1, mail); 
            ResultSet rs = ps.executeQuery(); 
            
            if (rs.next())
                return rs.getString(1);
        }catch (Exception e){
            System.out.print("Lỗi tạo bảng lấy deadline" + e);
            return null;
        }
        return null;
    }
    
    
    private Message prepareMessage(Session session, String fromUser, String toUser, String code){
        try{
            String emailBody = "Mã của bạn: " + code;
            
            String emailSubject = "Mã xác nhận";
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromUser));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toUser));
            message.setSubject(emailSubject);
            message.setText(emailBody);
            return message;
        }catch(Exception ex)
        {
            System.out.print("Lỗi ở tạo mess" + ex);
        }
        return null;
    }
    
}
