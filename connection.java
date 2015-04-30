/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andhora
 */
public class connection {
        String db = "jdbc:mysql://localhost:3306/tubesrpl";
	String user = "root";
	String pass = "";
        private ResultSet rs = null;

    java.sql.Statement stm = null;
	public Connection co = null;


	public connection(){}

	public java.sql.Statement sambung(){

		try {
			Class.forName("com.mysql.jdbc.Driver");
            }
        catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			co = DriverManager.getConnection(db,user,pass);
            }
        catch (SQLException e) {

			e.printStackTrace();
		}

		try {
			stm = co.createStatement();
                        
                  
            }
        catch (SQLException e) {

			e.printStackTrace();
		}

		return stm;
	}
        
        public void query(String sql){
            try {
                stm.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public ResultSet getData(String sql){
            try {
                rs = stm.executeQuery(sql);
            } catch (SQLException ex) {
                Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            }
            return rs;
        }
}
