package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciaBD {

	private static Connection con;
	private static String url;
	
	public static Connection retornaConexao(){
		url = "jdbc:mysql://localhost/rockstarradio";
		con = null;
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			con = DriverManager.getConnection(url,"root","100senha");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
}
