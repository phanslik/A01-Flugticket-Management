import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	private static Connection con;

	public void connect(String host, String port, String db, String user, String pw) throws Exception {

		if (con != null)
			return;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			throw new Exception("No database");
		}
		con = DriverManager.getConnection("jdbc:mysql://192.168.198.128:3306/flightdata?autoReconnect=true&useSSL=false", "test",
				"test");

/*		con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?autoReconnect=true&useSSL=false", user,
				pw);
	*/}

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
		String[] count = new String[232];// String Array welches die Laender
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

	public static String getCodeCountry(String country) throws SQLException {
		String code = "";
		Statement stmt1 = (Statement) con.createStatement();
		String query1 = "select code from countries where name ='" + country + "';";
		ResultSet res1 = ((java.sql.Statement) stmt1).executeQuery(query1);
		while (res1.next()) {
			code = res1.getString("code");
		}
		return code;
	}
	
	public static String[] getAirports(String country) throws SQLException{
		int c = 0;
		
		Statement stmt2 = (Statement) con.createStatement();
		String query2 = "select count(name) from airports where country='"+country+"';";
		ResultSet res2 = ((java.sql.Statement) stmt2).executeQuery(query2);
		while (res2.next()) {
			c = res2.getInt("count(name)");
		}
		
		String[] aport = new String[c];
		int i = 0;

		Statement stmt3 = (Statement) con.createStatement();
		String query3 = "select name from airports where country='"+country+"';";
		ResultSet res3 = ((java.sql.Statement) stmt3).executeQuery(query3);
		while (res3.next()) {
			aport[i] = res3.getString("name");
			i++;
		}
		return aport;
		
}
}