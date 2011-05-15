package dao;

import java.sql.*;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mariusz
 */
public class FakturyDao {

    String driver = "org.postgersql.Driver";
    String url = "jdbc:postgresql://localhost:5432/faktury";
    String user = "postgres";
    String pwd = "root";

    public ResultSet Lista(String zapytanie) {

        try {
            System.setProperty("jdbc.drivers", driver);
            Connection con = DriverManager.getConnection(url, user, pwd);
            PreparedStatement stat = con.prepareStatement(zapytanie);
            ResultSet result = stat.executeQuery();
            return result;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            return null;

        }
    }

    public void Wykonaj(String zapytanie) {
        try {
            Connection con = DriverManager.getConnection(url, user, pwd);
            PreparedStatement stat = con.prepareStatement(zapytanie);
            stat.executeUpdate();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
