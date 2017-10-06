import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class Booking extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField fnTextfield;
	private JTextField lnTextfield;
	private JTextField airlineTextfield;
	private JTextField rowTextfield;
	private JTextField seatTextfield;
	JComboBox depCountry;

	/**
	 * Create the frame.
	 */
	public Booking() {

		setDefaultCloseOperation(Booking.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel northP = new JPanel();
		contentPane.add(northP, BorderLayout.NORTH);

		JLabel lblFlugbuchung = new JLabel("Flight booking");
		lblFlugbuchung.setFont(new Font("Tahoma", Font.BOLD, 23));
		northP.add(lblFlugbuchung);

		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.WEST);

		JPanel departureP = new JPanel();
		verticalBox.add(departureP);

		JLabel lblDeparture = new JLabel("Departure");
		lblDeparture.setFont(new Font("Tahoma", Font.BOLD, 17));
		departureP.add(lblDeparture);

		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);

		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalBox.add(horizontalStrut);

		JLabel lblStart = new JLabel("Country");
		horizontalBox.add(lblStart);

		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalBox.add(horizontalStrut_1);

		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);

		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalBox_1.add(horizontalStrut_2);

		depCountry = new JComboBox();
		horizontalBox_1.add(depCountry);

		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalBox_1.add(horizontalStrut_3);

		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);

		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalBox_2.add(horizontalStrut_4);

		JLabel lblNewLabel = new JLabel("Airport");
		horizontalBox_2.add(lblNewLabel);

		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalBox_2.add(horizontalStrut_5);

		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);

		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		horizontalBox_3.add(horizontalStrut_6);

		JComboBox depAirport = new JComboBox();
		horizontalBox_3.add(depAirport);

		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		horizontalBox_3.add(horizontalStrut_7);

		Component horizontalStrut_24 = Box.createHorizontalStrut(140);
		verticalBox.add(horizontalStrut_24);

		Box verticalBox_3 = Box.createVerticalBox();
		verticalBox.add(verticalBox_3);

		JPanel panel_2 = new JPanel();
		verticalBox_3.add(panel_2);

		JLabel passenger = new JLabel("Passenger");
		passenger.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_2.add(passenger);

		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox_3.add(verticalStrut_1);

		Box horizontalBox_12 = Box.createHorizontalBox();
		verticalBox_3.add(horizontalBox_12);

		Component horizontalStrut_16 = Box.createHorizontalStrut(20);
		horizontalBox_12.add(horizontalStrut_16);

		JLabel lblFirstName = new JLabel("First name");
		horizontalBox_12.add(lblFirstName);

		Component horizontalStrut_17 = Box.createHorizontalStrut(20);
		horizontalBox_12.add(horizontalStrut_17);

		fnTextfield = new JTextField();
		horizontalBox_12.add(fnTextfield);
		fnTextfield.setColumns(10);

		Component glue = Box.createGlue();
		horizontalBox_12.add(glue);

		Box horizontalBox_13 = Box.createHorizontalBox();
		verticalBox_3.add(horizontalBox_13);

		Component horizontalStrut_18 = Box.createHorizontalStrut(20);
		horizontalBox_13.add(horizontalStrut_18);

		Component horizontalStrut_19 = Box.createHorizontalStrut(20);
		horizontalBox_13.add(horizontalStrut_19);

		Box horizontalBox_14 = Box.createHorizontalBox();
		verticalBox_3.add(horizontalBox_14);

		Component horizontalStrut_20 = Box.createHorizontalStrut(20);
		horizontalBox_14.add(horizontalStrut_20);

		JLabel lblLastName = new JLabel("Last name");
		horizontalBox_14.add(lblLastName);

		Component horizontalStrut_21 = Box.createHorizontalStrut(20);
		horizontalBox_14.add(horizontalStrut_21);

		lnTextfield = new JTextField();
		horizontalBox_14.add(lnTextfield);
		lnTextfield.setColumns(10);

		Box horizontalBox_15 = Box.createHorizontalBox();
		verticalBox_3.add(horizontalBox_15);

		Component horizontalStrut_22 = Box.createHorizontalStrut(20);
		horizontalBox_15.add(horizontalStrut_22);

		Component horizontalStrut_23 = Box.createHorizontalStrut(20);
		horizontalBox_15.add(horizontalStrut_23);

		Component verticalStrut_4 = Box.createVerticalStrut(30);
		verticalBox_3.add(verticalStrut_4);

		Component horizontalStrut_27 = Box.createHorizontalStrut(140);
		verticalBox_3.add(horizontalStrut_27);

		Box verticalBox_1 = Box.createVerticalBox();
		contentPane.add(verticalBox_1, BorderLayout.CENTER);

		JPanel destinationP = new JPanel();
		verticalBox_1.add(destinationP);

		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setFont(new Font("Tahoma", Font.BOLD, 17));
		destinationP.add(lblDestination);

		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_2);

		Box horizontalBox_4 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_4);

		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		horizontalBox_4.add(horizontalStrut_8);

		JLabel label = new JLabel("Country");
		horizontalBox_4.add(label);

		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		horizontalBox_4.add(horizontalStrut_9);

		Box horizontalBox_5 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_5);

		Component horizontalStrut_10 = Box.createHorizontalStrut(20);
		horizontalBox_5.add(horizontalStrut_10);

		JComboBox destCountry = new JComboBox();
		horizontalBox_5.add(destCountry);

		Component horizontalStrut_11 = Box.createHorizontalStrut(20);
		horizontalBox_5.add(horizontalStrut_11);

		Box horizontalBox_6 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_6);

		Component horizontalStrut_12 = Box.createHorizontalStrut(20);
		horizontalBox_6.add(horizontalStrut_12);

		JLabel label_1 = new JLabel("Airport");
		horizontalBox_6.add(label_1);

		Component horizontalStrut_13 = Box.createHorizontalStrut(20);
		horizontalBox_6.add(horizontalStrut_13);

		Box horizontalBox_7 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_7);

		Component horizontalStrut_14 = Box.createHorizontalStrut(20);
		horizontalBox_7.add(horizontalStrut_14);

		JComboBox destAirport = new JComboBox();
		horizontalBox_7.add(destAirport);

		Component horizontalStrut_15 = Box.createHorizontalStrut(20);
		horizontalBox_7.add(horizontalStrut_15);

		Box verticalBox_4 = Box.createVerticalBox();
		verticalBox_1.add(verticalBox_4);

		JPanel panel_3 = new JPanel();
		verticalBox_4.add(panel_3);

		JLabel label_5 = new JLabel("   ");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_3.add(label_5);

		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalBox_4.add(verticalStrut_3);

		Box horizontalBox_16 = Box.createHorizontalBox();
		verticalBox_4.add(horizontalBox_16);

		Box horizontalBox_17 = Box.createHorizontalBox();
		verticalBox_4.add(horizontalBox_17);

		Component horizontalStrut_30 = Box.createHorizontalStrut(20);
		horizontalBox_17.add(horizontalStrut_30);

		JLabel lblAirline = new JLabel("Airline");
		horizontalBox_17.add(lblAirline);

		Component horizontalStrut_29 = Box.createHorizontalStrut(20);
		horizontalBox_17.add(horizontalStrut_29);

		airlineTextfield = new JTextField();
		horizontalBox_17.add(airlineTextfield);
		airlineTextfield.setColumns(10);

		Component horizontalStrut_31 = Box.createHorizontalStrut(20);
		horizontalBox_17.add(horizontalStrut_31);

		Box horizontalBox_18 = Box.createHorizontalBox();
		verticalBox_4.add(horizontalBox_18);

		Component horizontalStrut_32 = Box.createHorizontalStrut(20);
		horizontalBox_18.add(horizontalStrut_32);

		JLabel lblRow = new JLabel("Row");
		horizontalBox_18.add(lblRow);

		Component horizontalStrut_33 = Box.createHorizontalStrut(31);
		horizontalBox_18.add(horizontalStrut_33);

		rowTextfield = new JTextField();
		rowTextfield.setColumns(10);
		horizontalBox_18.add(rowTextfield);

		Component horizontalStrut_34 = Box.createHorizontalStrut(20);
		horizontalBox_18.add(horizontalStrut_34);

		JLabel label_2 = new JLabel("");
		verticalBox_4.add(label_2);

		Box horizontalBox_19 = Box.createHorizontalBox();
		verticalBox_4.add(horizontalBox_19);

		Box horizontalBox_20 = Box.createHorizontalBox();
		verticalBox_4.add(horizontalBox_20);

		Component horizontalStrut_25 = Box.createHorizontalStrut(20);
		horizontalBox_20.add(horizontalStrut_25);

		JLabel lblSeat = new JLabel("Seat");
		horizontalBox_20.add(lblSeat);

		Component horizontalStrut_28 = Box.createHorizontalStrut(30);
		horizontalBox_20.add(horizontalStrut_28);

		seatTextfield = new JTextField();
		seatTextfield.setColumns(10);
		horizontalBox_20.add(seatTextfield);

		Component horizontalStrut_35 = Box.createHorizontalStrut(20);
		horizontalBox_20.add(horizontalStrut_35);

		Component horizontalStrut_36 = Box.createHorizontalStrut(140);
		verticalBox_4.add(horizontalStrut_36);

		Box verticalBox_2 = Box.createVerticalBox();
		contentPane.add(verticalBox_2, BorderLayout.EAST);

		JPanel panel = new JPanel();
		verticalBox_2.add(panel);

		Box horizontalBox_8 = Box.createHorizontalBox();
		verticalBox_2.add(horizontalBox_8);

		Box horizontalBox_9 = Box.createHorizontalBox();
		verticalBox_2.add(horizontalBox_9);

		Box horizontalBox_10 = Box.createHorizontalBox();
		verticalBox_2.add(horizontalBox_10);

		Box horizontalBox_11 = Box.createHorizontalBox();
		verticalBox_2.add(horizontalBox_11);

		JPanel panel_1 = new JPanel();
		verticalBox_2.add(panel_1);

		TextArea textArea = new TextArea();
		panel_1.add(textArea);

		Component horizontalStrut_26 = Box.createHorizontalStrut(140);
		verticalBox_2.add(horizontalStrut_26);

		JPanel southP = new JPanel();
		contentPane.add(southP, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("Submit");
		southP.add(btnNewButton);
		this.setTitle("Booking");
	}

}
