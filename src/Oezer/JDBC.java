package Oezer;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	private static Connection con;

	public void connect(String user, String pw) throws Exception {//daweil noch statisch für Testzwecke

		if (con != null)
			return;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new Exception("No database");
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/flightdata?autoReconnect=true&useSSL=false", user,
				pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static String[] getAllCountries() throws SQLException {
		String[] count = new String[232];// Sting Array welches die Laender
											// beinhaltet (232 Laender)
		int i = 0;

		java.sql.Statement stmt1 = con.createStatement();
		String query = "SELECT name FROM countries;";
		ResultSet res = stmt1.executeQuery(query);
		while (res.next()) {
			count[i] = res.getString("name");
			i++;
		}
		return count;

	}

}