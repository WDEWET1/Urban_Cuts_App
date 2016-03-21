/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.urban_cuts.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DB_Connect {
    public void connect_to_db(){
    
        try {
            String host = "jdbc:derby://localhost:1527/u";
            String username = "u";
            String password = "u";
            
            Connection con = DriverManager.getConnection(host, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
