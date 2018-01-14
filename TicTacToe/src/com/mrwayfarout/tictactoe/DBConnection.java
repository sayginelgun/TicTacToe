package com.mrwayfarout.tictactoe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class DBConnection {
    
    private Connection conn = null; //Ba�lant� nesnemiz
    private String url = "jdbc:mysql://localhost:3306/";//veritaban�n�n adresi ve portu
    private String dbName = "TicTacToe"; //veritaban�n�n ismi
    private String driver = "com.mysql.jdbc.Driver";//mySQL ile Java aras�ndaki ba�lant�y� sa�layan JDBC s�r�c�s�
    private String userName = "root"; //veritaban� i�in kullan�c� ad�
    private String password = "admin"; //kullan�c� �ifresi
    
    public Statement baglantiAc() throws Exception {
        Class.forName(driver).newInstance(); //My sql JDBC s�r�c�s� kullan�l�yor
        conn = DriverManager.getConnection(url + dbName, userName, password);//ba�lant� a��l�yor
        return conn.createStatement();
    }

    public void baglantiKapat() throws Exception {
        conn.close();
    }
    
}
