package Oezer;

public class Controller {

	private Login log;
	
	private static JDBC jdbc;
	
	
	
	public Controller(){
		log = new Login();
		jdbc = new JDBC();
	}
	
	public static void main(String[] args) {
		//jdbc.connect();
		new Controller();
	}
}
