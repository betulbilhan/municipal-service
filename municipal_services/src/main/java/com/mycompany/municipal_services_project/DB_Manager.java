/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bp2_p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class DB_Manager {
    static String  tc_no,cbox_value,txt_value,pass_value,hsp,date,field;
    static String s_n,s_sn,s_age,s_sport;
    static int id=0;
    
    private static final String connectionString = "jdbc:mysql://localhost:3306/project_schema?user=root&password=my_Root23";


//new user can register to the service system thanks to this method. Her info. passing to the info_table.
    public static void AddPerson(String tc_itable, String name_itable, String surname_itable, String password_itable, String gender_itable, String date_itable, String reminderQ_itable, String reminderA_itable) {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM info_table";

            query = "INSERT INTO info_table VALUES(" + tc_itable + ",'" + name_itable + "','" + surname_itable + "','" + password_itable + "','" + gender_itable + "','" + date_itable + "','" + reminderQ_itable + "','" + reminderA_itable + "')";
            stmt.executeUpdate(query);
            conn.close();

        } catch (SQLException ex) {

            System.out.println(" error:" + ex.getMessage());
        }
    }
    //register method for sport table 
    public static void AddSport( String name_stable, String surname_stable, String age_stable, String sport_stable) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT COUNT(*) FROM sport_table";
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            id = rs.getInt(1) + 1;
            query = "INSERT INTO sport_table VALUES(" + id + ",'" + name_stable + "','" + surname_stable + "','" + age_stable + "','" + sport_stable + "')";
            stmt.executeUpdate(query);
            conn.close();

        } catch (SQLException ex) {
            System.out.println(" error:" + ex.getMessage());
        }


    }
    //Informations of user can take from sport_table thanks to DB_Manager.SearchByID method
    public static void SearchByID(String id){
        Connection conn = null;
        ResultSet rs = null;
        
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM sport_table WHERE id_stable LIKE '%" + id + "%'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                 s_n = rs.getString("name_stable");
                 s_sn = rs.getString("surname_stable");
                 s_age = rs.getString("age_stable");
                 s_sport=rs.getString("sport_stable");
            }
            conn.close();

        } catch (SQLException ex) {

            System.out.println(" error:" + ex.getMessage());
        }

       
    }
    //if the user decided to delete her account, it will delete from info_table. This method using in only login frame.
    public static boolean DeleteByTC(String tc_itable ) {

        boolean rvalue = false;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "DELETE FROM info_table WHERE tc_itable=" + tc_itable;
            int rowEfected = stmt.executeUpdate(query);
            if (rowEfected > 0) {
                rvalue = true;
            }
            conn.close();

        } catch (SQLException ex) {

            System.out.println(" error:" + ex.getMessage());
        }

        return rvalue;

    }
    //user can create an oppointment and save it to he health_table. This is using for create a hospital appointment
    public static void AddApp(String tc_htable,String hsp_htable, String field_htable, String date_htable) {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM project_schema.health_table";
            query = "INSERT INTO health_table VALUES(" + tc_htable + ",'" + hsp_htable + "','" + field_htable + "','" + date_htable + "')";
          
            stmt.executeUpdate(query);
            conn.close();

        } catch (SQLException ex) {

            System.out.println(" error:" + ex.getMessage());
        }
    }
    //FOR GET THE INFORMATION OF APPOINTMENT from health_table.
    public static void health_INQ(String tc_htable, DefaultTableModel dl) {

        Connection conn = null;
        ResultSet rs = null;
        
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM health_table WHERE tc_htable LIKE '%" + tc_htable + "%'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                hsp=rs.getString("hsp_htable");
                date=rs.getString("date_htable");
                field=rs.getString("field_htable");
                
                dl.addRow(new Object[]{hsp, field, date});


            }
            conn.close();

        } catch (SQLException ex) {

            System.out.println(" error:" + ex.getMessage());
        }

       

    }
    
    //for set new password in forgot_password frame. The new password change with the old one in info_table in MySQL
    public static void UpdatePassword(forgot_password f){
        Connection conn=null;
        try{
           String password=f.newpass;
           String TC=f.TC;
           conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "UPDATE info_table SET password_itable='" + password + "' WHERE tc_itable=" + TC;
            stmt.executeUpdate(query);
            conn.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    //When the user forgets her password, it is used to verify the reminder information she entered.With the help of info_table
    public static void SearchByTC(String TC){
        Connection conn = null;
        ResultSet rs = null;
        
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM info_table WHERE tc_itable LIKE '%" + TC + "%'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                 tc_no = rs.getString("tc_itable");
                 cbox_value = rs.getString("reminderQ_itable");
                 txt_value = rs.getString("reminderA_itable");
                 pass_value=rs.getString("password_itable");
            }
            conn.close();

        } catch (SQLException ex) {

            System.out.println(" error:" + ex.getMessage());
        }

    }
}
    
    

    
    


