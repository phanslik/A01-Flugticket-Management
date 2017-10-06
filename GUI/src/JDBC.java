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

		con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?autoReconnect=true&useSSL=false", user,
				pw);
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
		Statement stmt = (Statement) con.createStatement();
		String query = "select code from countries where name ='" + country + "';";
		ResultSet res = ((java.sql.Statement) stmt).executeQuery(query);
		while (res.next()) {
			code = res.getString("code");
		}
		return code;
	}
}