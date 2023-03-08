import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ForgotPassword {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textFindEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassword window = new ForgotPassword();
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
	public ForgotPassword() {
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
		
		JPanel panelMain = new JPanel();
		panelMain.setBackground(new Color(255, 255, 255));
		panelMain.setBounds(10, 10, 1246, 663);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(238, 238, 238));
		panel_2.setBounds(0, 57, 1246, 435);
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192)));
		panelMain.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_1FindAcc = new JPanel();
		panel_1FindAcc.setBackground(new Color(255, 255, 255));
		panel_1FindAcc.setBounds(372, 70, 497, 286);
		panel_1FindAcc.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_2.add(panel_1FindAcc);
		panel_1FindAcc.setLayout(null);
		
		JPanel panel_2FindAcc = new JPanel();
		panel_2FindAcc.setBounds(0, 0, 497, 58);
		panel_1FindAcc.add(panel_2FindAcc);
		panel_2FindAcc.setBackground(new Color(255, 255, 255));
		panel_2FindAcc.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_2FindAcc.setLayout(null);
		
		JLabel lblFindAcc = new JLabel("Find your account");
		lblFindAcc.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblFindAcc.setBounds(20, 10, 467, 38);
		panel_2FindAcc.add(lblFindAcc);
		
		JPanel panel_3FindAcc = new JPanel();
		panel_3FindAcc.setBounds(0, 202, 497, 84);
		panel_3FindAcc.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_3FindAcc.setBackground(Color.WHITE);
		panel_1FindAcc.add(panel_3FindAcc);
		panel_3FindAcc.setLayout(null);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			 // When button is clicked and condition is met, continues to Reset password window
			public void mouseClicked(MouseEvent e) {
				if (textFindEmail.getText().equals("mikoclark19@gmail.com")) {
					ResetPassword reset = new ResetPassword();
					frame.dispose();
					reset.main(null);
			} else {
				JOptionPane.showMessageDialog(null, "Your search did not return any results. Please try again with other information");
			}
			}
		});
		btnSearch.setForeground(new Color(255, 255, 255));
		btnSearch.setOpaque(true);
		btnSearch.setBorderPainted(false);
		btnSearch.setBackground(new Color(0, 128, 255));
		btnSearch.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnSearch.setBounds(380, 20, 95, 41);
		panel_3FindAcc.add(btnSearch);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			 // If button is clicked, returns to LogIn Page
			public void mouseClicked(MouseEvent e) {
					LoginPage login = new LoginPage();
					frame.dispose();
					login.main(null);
		
			}
		});
		btnCancel.setForeground(new Color(78, 78, 78));
		btnCancel.setOpaque(true);
		btnCancel.setBorderPainted(false);
		btnCancel.setBackground(new Color(227, 227, 227));
		btnCancel.setBounds(271, 20, 95, 41);
		panel_3FindAcc.add(btnCancel);
		btnCancel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		
		JLabel lblPlsEnter1 = new JLabel("Please enter your email or mobile number to search for");
		lblPlsEnter1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblPlsEnter1.setBounds(21, 68, 466, 35);
		panel_1FindAcc.add(lblPlsEnter1);
		
		JLabel lblPlsEnter2 = new JLabel("your account.");
		lblPlsEnter2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblPlsEnter2.setBounds(21, 93, 466, 35);
		panel_1FindAcc.add(lblPlsEnter2);
		
		JPanel panelFindEmail = new JPanel();
		panelFindEmail.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 128, 128)));
		panelFindEmail.setBackground(new Color(255, 255, 255));
		panelFindEmail.setBounds(21, 135, 454, 44);
		panel_1FindAcc.add(panelFindEmail);
		panelFindEmail.setLayout(null);
		
		textFindEmail = new JTextField();
		textFindEmail.addFocusListener(new FocusAdapter() {
			@Override
			// When focus is gained, sets the textfield empty
			public void focusGained(FocusEvent e) {
				if (textFindEmail.getText().equals("Email or mobile number")) {
					textFindEmail.setText("");
				}
			}
			@Override
			// When focus is gained, reverts the textfield to default
			public void focusLost(FocusEvent e) {
				if (textFindEmail.getText().equals("")) {
					textFindEmail.setText("Email or mobile number");
				}
			}
		});
		textFindEmail.setBounds(10, 11, 434, 23);
		panelFindEmail.add(textFindEmail);
		textFindEmail.setText("Email or mobile number");
		textFindEmail.setForeground(Color.LIGHT_GRAY);
		textFindEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFindEmail.setColumns(10);
		textFindEmail.setBorder(null);
		
		JLabel lblFacebook = new JLabel("facebook");
		lblFacebook.setForeground(new Color(0, 128, 255));
		lblFacebook.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblFacebook.setBounds(10, 0, 427, 57);
		panelMain.add(lblFacebook);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addMouseListener(new MouseAdapter() {
			@Override
			 // If button is clicked, returns to LogIn Page
			public void mouseClicked(MouseEvent e) {
				LoginPage login = new LoginPage();
				frame.dispose();
				login.main(null);
			}
		});
		btnLogIn.setBounds(1124, 10, 101, 37);
		panelMain.add(btnLogIn);
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setFont(new Font("Segoe UI", Font.BOLD, 19));
		btnLogIn.setBackground(new Color(0, 128, 255));
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(238, 238, 238)));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 575, 1246, 88);
		panelMain.add(panel_4);
		
		JLabel lblOther1 = new JLabel("Services   Voting Information Center   Privacy Policy   Privacy Center   Groups   About   Create Ad   Create Page   Developers   Careers   Cookies   Ad choices");
		lblOther1.setForeground(new Color(114, 114, 114));
		lblOther1.setHorizontalAlignment(SwingConstants.CENTER);
		lblOther1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOther1.setBounds(247, 33, 740, 23);
		panel_4.add(lblOther1);
		
		JLabel lblOthers2 = new JLabel("Terms   Help   Contact Uploading & Non-Users");
		lblOthers2.setForeground(new Color(114, 114, 114));
		lblOthers2.setHorizontalAlignment(SwingConstants.CENTER);
		lblOthers2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOthers2.setBounds(431, 55, 377, 23);
		panel_4.add(lblOthers2);
		
		JLabel lblOthers = new JLabel("Sign Up   Log In   Messenger   Facebook Lite   Watch   Places   Games   Marketplace   Meta Pay   Oculus   Portal   Instagram   Bulletin   Fundraisers");
		lblOthers.setForeground(new Color(114, 114, 114));
		lblOthers.setBounds(266, 10, 703, 23);
		panel_4.add(lblOthers);
		lblOthers.setHorizontalAlignment(SwingConstants.CENTER);
		lblOthers.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		JLabel lblFacebookMeta = new JLabel("Meta © 2023");
		lblFacebookMeta.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		lblFacebookMeta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFacebookMeta.setForeground(new Color(114, 114, 114));
		lblFacebookMeta.setBounds(847, 65, 389, 13);
		panel_4.add(lblFacebookMeta);
		
		JLabel lblLanguages = new JLabel("English (US)   Filipino   Bisaya   Español   日本語   한국어   中文(简体)   العربية   Português (Brasil)   Français (France)   Deutsch");
		lblLanguages.setForeground(new Color(114, 114, 114));
		lblLanguages.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblLanguages.setBounds(318, 546, 598, 23);
		panelMain.add(lblLanguages);
		
		JLabel lblPlus = new JLabel("+");
		lblPlus.setForeground(new Color(78, 78, 78));
		lblPlus.setOpaque(true);
		lblPlus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlus.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlus.setBackground(new Color(238, 238, 238));
		lblPlus.setBounds(915, 547, 18, 18);
		panelMain.add(lblPlus);
	}
}
