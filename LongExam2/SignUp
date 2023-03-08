import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class SignUp {

	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtEmail;
	private static String[] months = {"Month", "Jan","Feb", "Mar", "Apr", "May", "Jun","Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; 
	private static String[] days = {"Day", "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29", "30", "31"};
	private static String[] years = {"Year", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012"};
	private JPasswordField passwordField;
	private Border red =  BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED);
	private Border gray =  BorderFactory.createMatteBorder(1, 1, 1, 1, Color.lightGray);

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(247, 247, 247));
		panel.setBounds(10, 10, 1246, 663);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panelFacebookContainer = new JPanel();
		panelFacebookContainer.setBackground(new Color(255, 255, 255));
		panelFacebookContainer.setBounds(348, -23, 540, 686);
		panel.add(panelFacebookContainer);
		panelFacebookContainer.setLayout(null);
		
		JLabel lblFacebook = new JLabel("facebook");
		lblFacebook.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacebook.setBounds(141, 21, 253, 79);
		lblFacebook.setForeground(new Color(0, 128, 255));
		lblFacebook.setFont(new Font("Tahoma", Font.BOLD, 50));
		panelFacebookContainer.add(lblFacebook);
		
		JPanel panelCreateAccCotainer = new JPanel();
		panelCreateAccCotainer.setBackground(new Color(255, 255, 255));
		panelCreateAccCotainer.setBounds(42, 99, 451, 558);
		panelCreateAccCotainer.setBorder(new LineBorder(new Color(192, 192, 192)));
		panelFacebookContainer.add(panelCreateAccCotainer);
		panelCreateAccCotainer.setLayout(null);
		
		JPanel panelCreateAccLabel = new JPanel();
		panelCreateAccLabel.setBounds(0, 0, 451, 71);
		panelCreateAccLabel.setLayout(null);
		panelCreateAccLabel.setBorder(new LineBorder(new Color(192, 192, 192)));
		panelCreateAccLabel.setBackground(Color.WHITE);
		panelCreateAccCotainer.add(panelCreateAccLabel);
		
		JLabel lblCreateNewAccounnt = new JLabel("Create new account");
		lblCreateNewAccounnt.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateNewAccounnt.setFont(new Font("Segoe UI", Font.BOLD, 23));
		lblCreateNewAccounnt.setBounds(10, 0, 431, 44);
		panelCreateAccLabel.add(lblCreateNewAccounnt);
		
		JLabel lblQuickNEasy = new JLabel("It's quick and easy.");
		lblQuickNEasy.setForeground(new Color(91, 91, 91));
		lblQuickNEasy.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblQuickNEasy.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuickNEasy.setBounds(152, 38, 147, 23);
		panelCreateAccLabel.add(lblQuickNEasy);
		
		txtFirstName = new JTextField();
		txtFirstName.setBorder(gray);
		txtFirstName.addFocusListener(new FocusAdapter() {
			@Override
			 // When focus is gained, sets the textfield to empty
			public void focusGained(FocusEvent e) {
				if (txtFirstName.getText().equals("  First Name")) {
					txtFirstName.setText("  ");
				}
			}
			@Override
			// When focus is lost, reverts to textfield default
			public void focusLost(FocusEvent e) {
				if (txtFirstName.getText().equals("  ")) {
					txtFirstName.setText("  First Name");
				}
			}
		});
		txtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFirstName.setText("  First Name");
		txtFirstName.setBounds(20, 95, 196, 31);
		txtFirstName.setColumns(10);
		panelCreateAccCotainer.add(txtFirstName);
		
		txtLastName = new JTextField();
		txtLastName.setBorder(gray);
		txtLastName.addFocusListener(new FocusAdapter() {
			@Override
			// When focus is gained, sets the textfield to empty
			public void focusGained(FocusEvent e) {
				if (txtLastName.getText().equals("  Last Name")) {
					txtLastName.setText("  ");
				}
			}
			@Override
			// When focus is lost, reverts to textfield default
			public void focusLost(FocusEvent e) {
				if (txtLastName.getText().equals("  ")) {
					txtLastName.setText("  Last Name");
				}
			}
		});
		txtLastName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtLastName.setText("  Last Name");
		txtLastName.setBounds(232, 95, 196, 31);
		txtLastName.setColumns(10);
		panelCreateAccCotainer.add(txtLastName);
		
		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setBounds(20, 218, 147, 20);
		lblBirthday.setHorizontalAlignment(SwingConstants.LEFT);
		lblBirthday.setForeground(new Color(91, 91, 91));
		lblBirthday.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panelCreateAccCotainer.add(lblBirthday);
		
		txtEmail = new JTextField();
		txtEmail.setBorder(gray);
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			// When focus is gained, sets the textfield to empty
			public void focusGained(FocusEvent e) {
				if (txtEmail.getText().equals("  Email")) {
					txtEmail.setText("  ");
				}
			}
			
			@Override
			 // When focus is lost, reverts to textfield default
			public void focusLost(FocusEvent e) {
				if (txtEmail.getText().equals("  ")) {
					txtEmail.setText("  Email");
				}
			}
		});
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEmail.setText("  Email");
		txtEmail.setBounds(20, 136, 408, 31);
		panelCreateAccCotainer.add(txtEmail);
		txtEmail.setColumns(10);
		
		JComboBox comboBoxDay = new JComboBox(days);
		comboBoxDay.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBoxDay.setBackground(new Color(255, 255, 255));
		comboBoxDay.setBounds(164, 246, 123, 31);
		panelCreateAccCotainer.add(comboBoxDay);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(20, 287, 147, 22);
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setForeground(new Color(91, 91, 91));
		lblGender.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		panelCreateAccCotainer.add(lblGender);
		
		JComboBox comboboxMonth = new JComboBox(months);
		comboboxMonth.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboboxMonth.setBackground(new Color(255, 255, 255));
		comboboxMonth.setBounds(20, 246, 123, 31);
		panelCreateAccCotainer.add(comboboxMonth);
		
		JComboBox comboBoxYear = new JComboBox(years);
		comboBoxYear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBoxYear.setBackground(new Color(255, 255, 255));
		comboBoxYear.setBounds(305, 246, 123, 31);
		panelCreateAccCotainer.add(comboBoxYear);
		
		JPanel panelFemale = new JPanel();
		panelFemale.setBackground(new Color(255, 255, 255));
		panelFemale.setBorder(new LineBorder(new Color(192, 192, 192)));
		panelFemale.setBounds(20, 315, 123, 31);
		panelCreateAccCotainer.add(panelFemale);
		panelFemale.setLayout(null);
		
		JRadioButton rdbtnFemale = new JRadioButton("   Female");
		rdbtnFemale.setBounds(6, 6, 111, 19);
		panelFemale.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		rdbtnFemale.setBackground(new Color(255, 255, 255));
		
		JPanel panelMale = new JPanel();
		panelMale.setLayout(null);
		panelMale.setBorder(new LineBorder(new Color(192, 192, 192)));
		panelMale.setBackground(Color.WHITE);
		panelMale.setBounds(164, 315, 123, 31);
		panelCreateAccCotainer.add(panelMale);
		
		JRadioButton rdbtnMale = new JRadioButton("   Male");
		rdbtnMale.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		rdbtnMale.setBackground(Color.WHITE);
		rdbtnMale.setBounds(6, 6, 111, 19);
		panelMale.add(rdbtnMale);
		
		JPanel panelOthers = new JPanel();
		panelOthers.setLayout(null);
		panelOthers.setBorder(new LineBorder(new Color(192, 192, 192)));
		panelOthers.setBackground(Color.WHITE);
		panelOthers.setBounds(305, 315, 123, 31);
		panelCreateAccCotainer.add(panelOthers);
		
		JRadioButton rdbtnOthers = new JRadioButton("   Others");
		rdbtnOthers.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		rdbtnOthers.setBackground(Color.WHITE);
		rdbtnOthers.setBounds(6, 6, 111, 19);
		panelOthers.add(rdbtnOthers);
		
		JLabel lblOthers = new JLabel("People who use our service may have uploaded your contact information to");
		lblOthers.setHorizontalAlignment(SwingConstants.LEFT);
		lblOthers.setForeground(new Color(91, 91, 91));
		lblOthers.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblOthers.setBounds(20, 356, 408, 23);
		panelCreateAccCotainer.add(lblOthers);
		
		JLabel lblOthers1 = new JLabel("Facebook.");
		lblOthers1.setHorizontalAlignment(SwingConstants.LEFT);
		lblOthers1.setForeground(new Color(91, 91, 91));
		lblOthers1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblOthers1.setBounds(20, 374, 63, 23);
		panelCreateAccCotainer.add(lblOthers1);
		
		JLabel lblLearnMore = new JLabel("Learn more.");
		lblLearnMore.setHorizontalAlignment(SwingConstants.LEFT);
		lblLearnMore.setForeground(new Color(0, 95, 189));
		lblLearnMore.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblLearnMore.setBounds(81, 374, 63, 23);
		panelCreateAccCotainer.add(lblLearnMore);
		
		JLabel lblOthers2 = new JLabel("By clicking Sign Up, you agree to our Terms, Privacy Policy and Cookies Policy.");
		lblOthers2.setHorizontalAlignment(SwingConstants.LEFT);
		lblOthers2.setForeground(new Color(91, 91, 91));
		lblOthers2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblOthers2.setBounds(20, 401, 408, 23);
		panelCreateAccCotainer.add(lblOthers2);
		
		JLabel lblOthers3 = new JLabel("You may receive SMS Notifications from us and can opt out any time.");
		lblOthers3.setHorizontalAlignment(SwingConstants.LEFT);
		lblOthers3.setForeground(new Color(91, 91, 91));
		lblOthers3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblOthers3.setBounds(20, 421, 408, 23);
		panelCreateAccCotainer.add(lblOthers3);
		
		JPanel panelPassword = new JPanel();
		panelPassword.setBorder(gray);
		panelPassword.setBackground(Color.white);
		panelPassword.setBounds(20, 178, 408, 31);
		panelCreateAccCotainer.add(panelPassword);
		panelPassword.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passwordField.setText("Password");
		passwordField.setBorder(null);
		passwordField.setBounds(10, 5, 355, 20);
		panelPassword.add(passwordField);
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			 // When focus is gained, sets the password field to empty
			public void focusGained(FocusEvent e) {
				if (passwordField.getText().equals("Password")) {
					passwordField.setText("");
				} else {
					passwordField.selectAll();
				}
			}
			@Override
			 // When focus is lost, reverts to password field default 
			public void focusLost(FocusEvent e) {
				if (passwordField.getText().equals("")) {
					passwordField.setText("Password");
				}
			}
		});
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addMouseListener(new MouseAdapter() {
			@Override
			 // When button is clicked, performs the following conditions
     			 // to determine whether Sign Up success or not
			public void mouseClicked(MouseEvent e) {
				
				boolean SignUpSuccess = false;
				String pass = passwordField.getText().toString();
				String email = txtEmail.getText().toString();
				
				User inputChecker = new User("", ""); 
					// Checks if password is valid
					boolean isValidPassword = inputChecker.checkPassword(pass);
					// Checks is email is valid
					boolean isValidEmail = inputChecker.checkValidUsername(email);
					
					boolean FirstNameFilled = false;
					boolean LastNameFilled = false;
					boolean birthdateFilled = false;
					boolean isEmailFilled = false;
					boolean isPasswordFilled = false;
					boolean isRadioButtonSelected = false;
				
				// Checks if First Name is inputed
				if((txtFirstName.getText().isEmpty() || txtFirstName.getText().equals("  First Name"))) {
					txtFirstName.setBorder(red);
				} else {
					txtFirstName.setBorder(gray);
					FirstNameFilled = true;
				}
				
				// Checks if Last Name is inputed
				if (txtLastName.getText().isEmpty() || txtLastName.getText().equals("  Last Name")) {
					txtLastName.setBorder(red);
				} else {
					txtLastName.setBorder(gray);
					LastNameFilled = true;
				}
				
				String month = (String) comboboxMonth.getSelectedItem();
				String day = (String) comboBoxDay.getSelectedItem();
				String year = (String) comboBoxYear.getSelectedItem();
				
				// Checks if birthday is filled
				if ((month.equals("Month") || day.equals("Day") || year.equals("Year")|| month.equals("") || day.equals("") || year.equals(""))) {
					comboboxMonth.setBorder(red);
					comboBoxDay.setBorder(red);
					comboBoxYear.setBorder(red);
				} else {
					comboboxMonth.setBorder(gray);
					comboBoxDay.setBorder(gray);
					comboBoxYear.setBorder(gray);
					birthdateFilled = true;
				}
				
				// Checks if an email or password is inputed
				if(txtEmail.getText().isEmpty() || txtEmail.getText().equals("  Email")) {
					txtEmail.setBorder(red);
				} else {
					txtEmail.setBorder(gray);
					isEmailFilled = true;
				}
				
				// Checks if a password is inputed
				if (passwordField.getText().isEmpty() || passwordField.getText().equals("Password")){
					panelPassword.setBorder(red);
				} else {
					panelPassword.setBorder(gray);
					isPasswordFilled = true;
				}
				
				// Creates a Button Group and adds the radio buttons to it
				ButtonGroup buttonGroup =  new ButtonGroup();
					buttonGroup.add(rdbtnFemale);
					buttonGroup.add(rdbtnMale);
					buttonGroup.add(rdbtnOthers);
				
				// Checks if a radio button is selected
				if (rdbtnFemale.isSelected() || rdbtnMale.isSelected() || rdbtnOthers.isSelected()) {
					isRadioButtonSelected = true;
				} else {
					rdbtnFemale.setBorder(red);
					rdbtnMale.setBorder(red);
					rdbtnOthers.setBorder(red);
				}
				
				// Checks if every field in the window is filled
				if ((FirstNameFilled && LastNameFilled && birthdateFilled && isEmailFilled && isPasswordFilled && isRadioButtonSelected) == true) {
					 // Finishes sign up if password and email is valid
					if (isValidPassword && isValidEmail) {
						txtEmail.setBorder(gray);
						panelPassword.setBorder(gray);
						
						JOptionPane.showMessageDialog(null, "Sign up success!\nClick 'OK' to continue with your new account.");
						frame.dispose();
						EnrolmentForm enroll = new EnrolmentForm();
							enroll.main(null);
					} else {
						txtEmail.setBorder(red);
						panelPassword.setBorder(red);
						JOptionPane.showMessageDialog(null, "Please enter a valid email and/or password!\n\nPassword must be:\na. 8 characters\nb. With upper and lower case letters\nc. Contains at least one special character");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Make sure to fill in all fields. Please try again.");
				}
			}
		});
		btnSignUp.setBounds(152, 467, 147, 43);
		panelCreateAccCotainer.add(btnSignUp);
		btnSignUp.setOpaque(true);
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnSignUp.setBorderPainted(false);
		btnSignUp.setBackground(new Color(0, 164, 41));
		
		JButton btnAlreadyHaveAn = new JButton("Already have an account?");
		btnAlreadyHaveAn.addMouseListener(new MouseAdapter() {
			@Override
			// When button is clicked, returns to Log In Page
			public void mouseClicked(MouseEvent e) {
					LoginPage login = new LoginPage();
					frame.dispose();
					login.main(null);
			}
		});
		btnAlreadyHaveAn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlreadyHaveAn.setBounds(106, 512, 241, 36);
		btnAlreadyHaveAn.setOpaque(true);
		btnAlreadyHaveAn.setForeground(new Color(0, 128, 255));
		btnAlreadyHaveAn.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnAlreadyHaveAn.setBorderPainted(false);
		btnAlreadyHaveAn.setBackground(new Color(255, 255, 255));
		panelCreateAccCotainer.add(btnAlreadyHaveAn);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show Password");
		// Shows password if the checkbox is selected
		// Then, hides the password again if checkbox is deselected
		chckbxShowPassword.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (chckbxShowPassword.isSelected()) {
					passwordField.setEchoChar((char)0);
				} else {
					passwordField.setEchoChar('●');
				}
			}
		});
		
		chckbxShowPassword.setBackground(new Color(255, 255, 255));
		chckbxShowPassword.setBounds(313, 215, 123, 23);
		panelCreateAccCotainer.add(chckbxShowPassword);
	}
}
