import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class LoginPage {

	private JFrame Facebook;
	private JTextField txtEmailOrPhone;
	private JPasswordField pfPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.Facebook.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Facebook = new JFrame();
		Facebook.getContentPane().setBackground(new Color(0, 0, 0));
		Facebook.setBounds(100, 100, 1280, 720);
		Facebook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Facebook.getContentPane().setLayout(null);
		
		JPanel panelWhite = new JPanel();
		panelWhite.setBackground(new Color(255, 255, 255));
		panelWhite.setBounds(10, 10, 1246, 663);
		Facebook.getContentPane().add(panelWhite);
		panelWhite.setLayout(null);
		
		JPanel panelBlueSignIn = new JPanel();
		panelBlueSignIn.setBounds(664, 0, 582, 663);
		panelBlueSignIn.setBackground(new Color(0, 128, 255));
		panelWhite.add(panelBlueSignIn);
		panelBlueSignIn.setLayout(null);
		
		JPanel panelSignIn = new JPanel();
		panelSignIn.setBackground(new Color(255, 255, 255));
		panelSignIn.setBounds(110, 118, 371, 410);
		panelBlueSignIn.add(panelSignIn);
		panelSignIn.setLayout(null);
		
		txtEmailOrPhone = new JTextField();
		txtEmailOrPhone.addFocusListener(new FocusAdapter() {
			@Override
			 // When focus is gained, sets textfield empty
			public void focusGained(FocusEvent e) {
				if (txtEmailOrPhone.getText().equals("Email or phone number")) {
					txtEmailOrPhone.setText("");
				} else {
					txtEmailOrPhone.selectAll();
				}
			}
			// When focus is lost, reverts the textfield to default
			public void focusLost(FocusEvent e) {
				if (txtEmailOrPhone.getText().equals("")) {
					txtEmailOrPhone.setText("Email or phone number");
				}
			}

		});
		txtEmailOrPhone.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtEmailOrPhone.setForeground(new Color(192, 192, 192));
		txtEmailOrPhone.setText("Email or phone number");
		txtEmailOrPhone.setBounds(37, 23, 303, 65);
		txtEmailOrPhone.setBorder(null);
		panelSignIn.add(txtEmailOrPhone);
		txtEmailOrPhone.setColumns(10);
		
		JLabel lblForgotPass = new JLabel("Forgot password?");
		lblForgotPass.addMouseListener(new MouseAdapter() {
			@Override
			  // When the label is clicked, opens the forgot Password window
			public void mouseClicked(MouseEvent e) {
				ForgotPassword forgotpass = new ForgotPassword();
				Facebook.dispose();
				forgotpass.main(null);
			}
		});
		lblForgotPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPass.setForeground(new Color(0, 128, 255));
		lblForgotPass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblForgotPass.setBounds(117, 279, 134, 32);
		panelSignIn.add(lblForgotPass);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogIn.addMouseListener(new MouseAdapter() {
			@Override
			 // When button is clicked, checks if the input is correct
      			// If the input is correct, opens the Enrolment Form window
			public void mouseClicked(MouseEvent e) {
				if ((txtEmailOrPhone.getText().equals("mikoclark19@gmail.com") && pfPassword.getText().equals("password1") || (txtEmailOrPhone.getText().equals("jericolim32@gmail.com") && pfPassword.getText().equals("password2")))) {
					EnrolmentForm enroll = new EnrolmentForm();
					Facebook.dispose();
					enroll.main(null);
					
				} else {
					// if user inputs are incorrect/default text
					JOptionPane.showMessageDialog(null, "Incorrect input! Please try again");
				}
			}
		});
		btnLogIn.setBackground(new Color(0, 128, 255));
		btnLogIn.setForeground(new Color(255, 255, 255));
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnLogIn.setBounds(23, 212, 325, 66);
		panelSignIn.add(btnLogIn);
		
		JPanel panelEmail = new JPanel();
		panelEmail.setBorder(new LineBorder(new Color(0, 128, 255)));
		panelEmail.setBackground(new Color(255, 255, 255));
		panelEmail.setBounds(22, 22, 326, 67);
		panelSignIn.add(panelEmail);
		panelEmail.setLayout(null);
		
		JPanel panelPassword = new JPanel();
		panelPassword.setBorder(new LineBorder(new Color(0, 128, 255)));
		panelPassword.setBackground(Color.WHITE);
		panelPassword.setBounds(23, 98, 325, 67);
		panelSignIn.add(panelPassword);
		panelPassword.setLayout(null);
		
		pfPassword = new JPasswordField();
		pfPassword.setForeground(new Color(192, 192, 192));
		pfPassword.setFont(new Font("Tahoma", Font.PLAIN, 19));
		pfPassword.addFocusListener(new FocusAdapter() {
			@Override
			 // When focus is gained, hides the input password
			public void focusGained(FocusEvent e) {
			if (pfPassword.getText().equals("Password")) {
				pfPassword.setEchoChar('●');
				pfPassword.setText("");
			} else {
				pfPassword.selectAll();
			}
			}
			@Override
			 // DEFAULT: When focus is lost, shows the default password field text
			public void focusLost(FocusEvent e) {
				if (pfPassword.getText().equals("")) {
					pfPassword.setText("Password");
				}
			}
		});
		pfPassword.setBounds(15, 1, 303, 64);
		pfPassword.setEchoChar((char)0);
		pfPassword.setText("Password");
		panelPassword.add(pfPassword);
		pfPassword.setBorder(null);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				  // When button is clicked, opens the Sign up window
				if (chckbxShowPassword.isSelected()) {
					pfPassword.setEchoChar((char)0);
				} else {
					pfPassword.setEchoChar('●');
				}
			}
		});
		chckbxShowPassword.setBackground(new Color(255, 255, 255));
		chckbxShowPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxShowPassword.setBounds(240, 171, 134, 21);
		panelSignIn.add(chckbxShowPassword);
		
		JButton btnCreateNewAcc = new JButton("Create new account");
		btnCreateNewAcc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			SignUp signup = new SignUp();
			Facebook.dispose();
			signup.main(null);
			}
		});
		btnCreateNewAcc.setBounds(23, 333, 325, 55);
		panelSignIn.add(btnCreateNewAcc);
		btnCreateNewAcc.setBackground(new Color(0, 225, 56));
		btnCreateNewAcc.setForeground(new Color(255, 255, 255));
		btnCreateNewAcc.setFont(new Font("Tahoma", Font.BOLD, 19));
		
		
		
		JLabel lblCreatePage = new JLabel("Create a page");
		lblCreatePage.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblCreatePage.setForeground(new Color(255, 255, 255));
		lblCreatePage.setBounds(120, 528, 361, 40);
		panelBlueSignIn.add(lblCreatePage);
		
		JLabel lblNewLabel_3_1 = new JLabel("for a celebrity, brand or business.");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Yu Gothic", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(229, 528, 371, 40);
		panelBlueSignIn.add(lblNewLabel_3_1);
		
		JLabel lblFacebookMeta = new JLabel("Meta © 2023");
		lblFacebookMeta.setForeground(new Color(255, 255, 255));
		lblFacebookMeta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFacebookMeta.setBounds(183, 640, 389, 13);
		panelBlueSignIn.add(lblFacebookMeta);
		
		JLabel lblFBDes = new JLabel("around you on Facebook.");
		lblFBDes.setBounds(54, 260, 711, 99);
		lblFBDes.setFont(new Font("Yu Gothic", Font.BOLD, 25));
		panelWhite.add(lblFBDes);
		
		JLabel lblConnectWithFriends = new JLabel("Connect with friends and the world");
		lblConnectWithFriends.setBounds(54, 230, 711, 99);
		lblConnectWithFriends.setFont(new Font("Yu Gothic", Font.BOLD, 25));
		panelWhite.add(lblConnectWithFriends);
		
		JLabel lblFacebook = new JLabel("facebook");
		lblFacebook.setBounds(54, 189, 427, 61);
		lblFacebook.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblFacebook.setForeground(new Color(0, 128, 255));
		panelWhite.add(lblFacebook);
		
		JLabel lblLanguages = new JLabel("English (US)   Filipino   Bisaya   Español   日本語   한국어   中文(简体)   العربية   Português (Brasil)   Français (France)   Deutsch");
		lblLanguages.setForeground(new Color(114, 114, 114));
		lblLanguages.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblLanguages.setBounds(10, 635, 598, 23);
		panelWhite.add(lblLanguages);
		
		JLabel lblPlus = new JLabel("+");
		lblPlus.setOpaque(true);
		lblPlus.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlus.setForeground(new Color(78, 78, 78));
		lblPlus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlus.setBackground(new Color(238, 238, 238));
		lblPlus.setBounds(632, 640, 19, 13);
		panelWhite.add(lblPlus);
	}	
}
