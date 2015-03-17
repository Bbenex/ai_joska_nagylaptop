/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemsoul;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectDB {
    public boolean loginCheck(String username, String password) throws SQLException{
        String query;
        String dbUsername, dbPassword;
        boolean login = false;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/databgase_to_aijoska", "root", "");
            Statement stmt = (Statement) con.createStatement();
            query = "SELECT username, password FROM user;";
            ResultSet rs = stmt.executeQuery(query);
           
            

            while(rs.next()){
                dbUsername = rs.getString("username");
                dbPassword = rs.getString("password");

                if(dbUsername == username && dbPassword == password){
                    System.out.println("OK");
                    login = true;
                }
                System.out.println(username + password + " " + dbUsername + dbPassword);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return login;
    }
    
}
