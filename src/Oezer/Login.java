package Oezer;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame implements ActionListener {

	private Booking boo;
	private JPanel contentPane;
	private JTextField hostnameTextfield;
	private JTextField portnameTextfield;
	private JTextField databaseTextfield;
	private JTextField userTextfield;
	private JTextField passwordTextfield;

	/**
	 * Launch the application.
	 */
	public Login(){
		initialize();
	}

	/**
	 * Create the frame.
	 */
	
	JButton submitButton;
	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblLogin.setBounds(176, 13, 70, 40);
		contentPane.add(lblLogin);
		
		JLabel lblHostname = new JLabel("Hostname");
		lblHostname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHostname.setBounds(12, 71, 74, 22);
		contentPane.add(lblHostname);
		
		hostnameTextfield = new JTextField();
		hostnameTextfield.setBounds(89, 72, 116, 22);
		contentPane.add(hostnameTextfield);
		hostnameTextfield.setColumns(10);
		
		JLabel label = new JLabel(":");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(207, 74, 12, 16);
		contentPane.add(label);
		
		portnameTextfield = new JTextField();
		portnameTextfield.setBounds(217, 72, 46, 22);
		contentPane.add(portnameTextfield);
		portnameTextfield.setColumns(10);
		
		JLabel lblDatabase = new JLabel("Database");
		lblDatabase.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDatabase.setBounds(12, 106, 74, 16);
		contentPane.add(lblDatabase);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUser.setBounds(12, 139, 56, 16);
		contentPane.add(lblUser);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(12, 168, 74, 16);
		contentPane.add(lblPassword);
		
		submitButton = new JButton("Submit");
		submitButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		submitButton.setBounds(163, 197, 97, 25);
		contentPane.add(submitButton);
		
		databaseTextfield = new JTextField();
		databaseTextfield.setBounds(89, 104, 116, 22);
		contentPane.add(databaseTextfield);
		databaseTextfield.setColumns(10);
		
		userTextfield = new JTextField();
		userTextfield.setBounds(89, 137, 116, 22);
		contentPane.add(userTextfield);
		userTextfield.setColumns(10);
		
		passwordTextfield = new JTextField();
		passwordTextfield.setBounds(89, 166, 116, 22);
		contentPane.add(passwordTextfield);
		passwordTextfield.setColumns(10);
		
		submitButton.addActionListener(this);
		this.setTitle("Login");
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==submitButton){
			boo = new Booking();
			boo.pack();
		    boo.setVisible (true);
		}
	}
}
