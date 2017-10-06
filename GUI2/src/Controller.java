import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("unused")
public class Controller implements ActionListener{
	private static String servername;
	private static String port;
	private static String database;
	private static String user;
	private static String pw;

	private static JDBC dbc;
	private Login log;

	public Controller() {
		log = new Login();
		dbc= new JDBC();
	}
	
	

	/**
	 * Getter und Setter werden für die Connection benötigt werden bis jetzt noch nicht verwendet, weil --> alles statisch für Testzwecke
	 * @return servername, port, database, user, password
	 */
	public String getServername() {
		return servername;
	}

	public void setServername(String servername) {
		this.servername = servername;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return pw;
	}

	public void setPassword(String pw) {
		this.pw = pw;
	}
	public static void main(String[] args) {
		new Controller();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}
}
