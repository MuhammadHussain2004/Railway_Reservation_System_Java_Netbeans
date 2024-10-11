/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway;

import java.sql.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kk
 */
public class dbconnect {
    Connection con;
    Statement st;
    ResultSet rs;
    dbconnect() 
    {
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway_project","root","");
            st=con.createStatement();
             System.out.println("db connected");
            
        } catch (Exception e) {
            System.out.println(e);
        }
            
            
            
       
          
        }
    public int signup_info(String fullname, String phone, String email, String cnic, String pass, String question )
    {
          
   
    int   status=0;
      
             
        try {
            String sql="insert into signup_info values('"+fullname+"','"+phone+"','"+email+"','"+cnic+"','"+pass+"','"+question+"') ";
            status=st.executeUpdate(sql);
            status=1;
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
       
        
        return status;
    }
    public  ResultSet signin_info(String email_phone, String password) 
  {
    try {
        String sql= "select * from signup_info where (Phone_number='"+email_phone+"' OR Email='"+email_phone+"') AND (Password='"+password+"') ";
        rs= st.executeQuery(sql);
    } catch (SQLException ex) {
        System.out.println(ex);    }
      return rs;
  }
  
     public int updatepass(String password, String find, String question) {
       int s=0;
    try {
        String sql= "Update signup_info set Password='"+password+"' where Phone_number='"+find+"' OR Email='"+find+"' AND  security_question='"+question+"' ";
        s= st.executeUpdate(sql);
        
    } catch (SQLException ex) {
        System.out.println(ex);    }
      return s;
  }
     public  ResultSet searchtrains(String from, String to) 
  {
    try {
        String sql= "select * from trains where (from_station='"+from+"') AND (to_station='"+to+"')";
        rs= st.executeQuery(sql);
    } catch (SQLException ex) {
        System.out.println(ex);    }
      return rs;
  }
      public  ResultSet traincharges(String code) 
  {
    try {
        String sql= "select * from trainrate where code='"+code+"' ";
        rs= st.executeQuery(sql);
    } catch (SQLException ex) {
        System.out.println(ex);    }
      return rs;
  }
      public int brecord(String code,String tname,String from,String to,String dep,String arr, String ttime, String tstops,String tclass, String tticket,String tcharge, String pname, String cnic, String date, String time)
    {
          
   
    int   status=0;
      
             
        try {
            String sql="insert into bookingrecord values('"+code+"','"+tname+"','"+from+"','"+to+"','"+dep+"','"+arr+"','"+ttime+"','"+tstops+"','"+tclass+"','"+tticket+"','"+tcharge+"','"+pname+"','"+cnic+"','"+date+"','"+time+"') ";
            status=st.executeUpdate(sql);
            
             status=1;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
       return status;
    }
       public int ratestar(String name, String cnic , String star)
    {
          
   
    int   status=0;
      
             
        try {
            String sql="insert into ratestar values('"+name+"','"+cnic+"','"+star+"')";
             status=st.executeUpdate(sql);
             status=1;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
       return status;
    }
       public  ResultSet bookhistory(String cnic) 
  {
    try {
        String sql= "select * from bookingrecord where pcnic='"+cnic+"' ";
        rs= st.executeQuery(sql);
    } catch (SQLException ex) {
        System.out.println(ex);    }
      return rs;
  }
        public  ResultSet displaytrain() 
  {
    try {
        String sql= "select * from trains";
        rs= st.executeQuery(sql);
    } catch (SQLException ex) {
        System.out.println(ex);    }
      return rs;
  }
           public int deletetrain(String time){
int s=0;
        try {
            String sql="delete from bookingrecord where time='"+time+"' ";
            System.out.println(sql);
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
     return s;

}
            public int noti(String cnic, String noti)
    {
          
   
    int   status=0;
      
             
        try {
            String sql="insert into notification values('"+cnic+"','"+noti+"')";
             status=st.executeUpdate(sql);
             status=1;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
       return status;
    }
             public  ResultSet notidisplay(String cnic) 
  {
    try {
        String sql= "select * from notification where Cnic='"+cnic+"' ";
        rs= st.executeQuery(sql);
    } catch (SQLException ex) {
        System.out.println(ex);    }
      return rs;
  }
    public static void main(String[] args)
    {
     
    }
       
    }
    

