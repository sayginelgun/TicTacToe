package com.mrwayfarout.tictactoe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class DBConnection {
    
    private Connection conn = null; //Baðlantý nesnemiz
    private String url = "jdbc:mysql://localhost:3306/";//veritabanýnýn adresi ve portu
    private String dbName = "TicTacToe"; //veritabanýnýn ismi
    private String driver = "com.mysql.jdbc.Driver";//mySQL ile Java arasýndaki baðlantýyý saðlayan JDBC sürücüsü
    private String userName = "root"; //veritabaný için kullanýcý adý
    private String password = "admin"; //kullanýcý þifresi
    
    public Statement baglantiAc() throws Exception {
        Class.forName(driver).newInstance(); //My sql JDBC sürücüsü kullanýlýyor
        conn = DriverManager.getConnection(url + dbName, userName, password);//baðlantý açýlýyor
        return conn.createStatement();
    }

    public void baglantiKapat() throws Exception {
        conn.close();
    }
    
}
