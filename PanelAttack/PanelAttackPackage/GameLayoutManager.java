package PanelAttackPackage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;


public class GameLayoutManager implements ItemListener {

	JPanel cards; //a panel that uses CardLayout
	LoginControl lc;
	RegisterControl rc;
	final static String WELCOMEPANEL = "Welcome Screen";
	final static String LOGINPANEL = "Login Panel";
	final static String REGISTERPANEL = "Register Panel";
	final static String MAINMENUPANEL = "Main Menu";
	final static String GAMEPLAYAREAPANEL = "Game Play Area";
	final static String GAMEOVERPANEL = "Game Over";
	private JTextField LoginUsernameTextField;
	private JTextField LoginPasswordTextField;
	private JTextField RegisterConfirmPasswordTextField;
	private JTextField RegisterPasswordTextField;
	private JTextField RegisterUsernameTextField;
	private JPanel LoginPanel;
	private JPanel RegisterPanel;
	private JPanel MainMenuPanel;
	private JPanel GamePlayAreaPanel;
	private JPanel GameOverPanel;
	private GameClient client;
	private GameServer server; // These can be placeholders for now

	public void addComponentToPane(Container pane) {
		//Put the JComboBox in a JPanel to get a nicer look.
		JPanel comboBoxPane = new JPanel(); //use FlowLayout
		String comboBoxItems[] = { WELCOMEPANEL, LOGINPANEL, REGISTERPANEL, MAINMENUPANEL, GAMEPLAYAREAPANEL, GAMEOVERPANEL };
		JComboBox CardSelector = new JComboBox(comboBoxItems);
		CardSelector.setEditable(false);
		CardSelector.addItemListener(this);
		comboBoxPane.add(CardSelector);
		
		

		//Create the "cards".

		JPanel WelcomePanel = new JPanel();
		WelcomePanel.setBounds(0, 0, 125, 100);

		LoginPanel = new JPanel();

		RegisterPanel = new JPanel();

		MainMenuPanel = new JPanel();

		GamePlayAreaPanel = new JPanel();

		GameOverPanel = new JPanel();

		//Create the panel that contains the "cards".
		cards = new JPanel(new CardLayout());
		cards.add(WelcomePanel, WELCOMEPANEL);
		WelcomePanel.setLayout(null);
		
		JLabel WelcomeLabelOne = new JLabel("Welcome To:");
		WelcomeLabelOne.setHorizontalAlignment(SwingConstants.CENTER);
		WelcomeLabelOne.setFont(new Font("Dialog", Font.PLAIN, 25));
		WelcomeLabelOne.setBounds(296, 68, 163, 55);
		WelcomePanel.add(WelcomeLabelOne);
		
		JLabel WelcomeLabelTwo = new JLabel("PANEL ATTACK");
		WelcomeLabelTwo.setHorizontalAlignment(SwingConstants.CENTER);
		WelcomeLabelTwo.setForeground(Color.RED);
		WelcomeLabelTwo.setFont(new Font("Dialog", Font.PLAIN, 44));
		WelcomeLabelTwo.setBounds(198, 191, 359, 80);
		WelcomePanel.add(WelcomeLabelTwo);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards, LOGINPANEL);
			}
		});
		btnLogin.setBounds(198, 318, 98, 26);
		WelcomePanel.add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards, REGISTERPANEL);
			}
		});
		btnRegister.setBounds(459, 318, 98, 26);
		WelcomePanel.add(btnRegister);
		cards.add(LoginPanel, LOGINPANEL);
		LoginPanel.setLayout(null);
		
		LoginControl lc = new LoginControl(LoginPanel, client);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(120, 73, 85, 16);
		LoginPanel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(120, 133, 85, 16);
		LoginPanel.add(lblPassword);
		
		LoginUsernameTextField = new JTextField();
		LoginUsernameTextField.setBounds(223, 69, 275, 20);
		LoginPanel.add(LoginUsernameTextField);
		LoginUsernameTextField.setColumns(10);
		
		LoginPasswordTextField = new JTextField();
		LoginPasswordTextField.setBounds(223, 129, 275, 20);
		LoginPanel.add(LoginPasswordTextField);
		LoginPasswordTextField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(223, 207, 98, 26);
		
		btnSubmit.addActionListener(lc); //Submit action listener
		
		LoginPanel.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards, WELCOMEPANEL);
			}
		});
		
		btnCancel.setBounds(400, 207, 98, 26);
		LoginPanel.add(btnCancel);
		
		cards.add(RegisterPanel, REGISTERPANEL);
		RegisterPanel.setLayout(null);
		
		JLabel lblUsername_1 = new JLabel("Username:");
		lblUsername_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_1.setBounds(61, 50, 133, 16);
		RegisterPanel.add(lblUsername_1);
		
		JLabel lblPassword_1 = new JLabel("Password:");
		lblPassword_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_1.setBounds(61, 95, 133, 16);
		RegisterPanel.add(lblPassword_1);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmPassword.setBounds(61, 135, 133, 16);
		RegisterPanel.add(lblConfirmPassword);
		
		RegisterConfirmPasswordTextField = new JTextField();
		RegisterConfirmPasswordTextField.setBounds(212, 131, 263, 20);
		RegisterPanel.add(RegisterConfirmPasswordTextField);
		RegisterConfirmPasswordTextField.setColumns(10);
		
		RegisterPasswordTextField = new JTextField();
		RegisterPasswordTextField.setColumns(10);
		RegisterPasswordTextField.setBounds(212, 91, 263, 20);
		RegisterPanel.add(RegisterPasswordTextField);
		
		RegisterUsernameTextField = new JTextField();
		RegisterUsernameTextField.setColumns(10);
		RegisterUsernameTextField.setBounds(212, 46, 263, 20);
		RegisterPanel.add(RegisterUsernameTextField);
		
		JButton btnRegisterSubmit = new JButton("Submit");
		btnRegisterSubmit.setBounds(212, 188, 98, 26);
		RegisterPanel.add(btnRegisterSubmit);
		
		JButton btnRegisterCancel_1 = new JButton("Cancel");
		btnRegisterCancel_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards, WELCOMEPANEL);	
			}
		});
		btnRegisterCancel_1.setBounds(377, 188, 98, 26);
		RegisterPanel.add(btnRegisterCancel_1);
		cards.add(MainMenuPanel, MAINMENUPANEL);
		MainMenuPanel.setLayout(null);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards, GAMEPLAYAREAPANEL);
			}
		});
		btnNewGame.setBounds(81, 81, 98, 26);
		MainMenuPanel.add(btnNewGame);
		
		JButton btnFindMatch = new JButton("Find Match");
		btnFindMatch.setBounds(81, 168, 98, 26);
		MainMenuPanel.add(btnFindMatch);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards, WELCOMEPANEL);
			}
		});
		btnLogout.setBounds(301, 391, 98, 26);
		MainMenuPanel.add(btnLogout);
		
		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainMenu.setForeground(Color.BLUE);
		lblMainMenu.setFont(new Font("Dialog", Font.PLAIN, 38));
		lblMainMenu.setBounds(250, 12, 211, 43);
		MainMenuPanel.add(lblMainMenu);
		
		JLabel lblPlayerRecord = new JLabel("Player Record:");
		lblPlayerRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerRecord.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPlayerRecord.setBounds(557, 52, 118, 31);
		MainMenuPanel.add(lblPlayerRecord);
		
		JLabel lblWin = new JLabel("Win:");
		lblWin.setBounds(557, 108, 55, 16);
		MainMenuPanel.add(lblWin);
		
		JLabel lblDraw = new JLabel("Draw:");
		lblDraw.setBounds(557, 183, 55, 16);
		MainMenuPanel.add(lblDraw);
		
		JLabel lblLose = new JLabel("Lose:");
		lblLose.setBounds(557, 266, 55, 16);
		MainMenuPanel.add(lblLose);
		
		JLabel lblWinrate = new JLabel("WinRate");
		lblWinrate.setBounds(557, 136, 55, 16);
		MainMenuPanel.add(lblWinrate);
		
		JLabel lblDrawrate = new JLabel("DrawRate");
		lblDrawrate.setBounds(557, 211, 55, 16);
		MainMenuPanel.add(lblDrawrate);
		
		JLabel lblLoserate = new JLabel("LoseRate");
		lblLoserate.setBounds(557, 294, 55, 16);
		MainMenuPanel.add(lblLoserate);
		cards.add(GamePlayAreaPanel, GAMEPLAYAREAPANEL);
		GamePlayAreaPanel.setLayout(null);
		
		JPanel PlayerOnePanel = new JPanel()
		{
			protected void paintComponent(Graphics g)
			{
				g.setColor( getBackground() );
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};
		PlayerOnePanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 204, 0), new Color(0, 102, 255), new Color(255, 204, 0), new Color(0, 102, 204)));
		PlayerOnePanel.setOpaque(true);
		PlayerOnePanel.setBackground(new Color (10,10,10,20)); //This gives us 20% opacity for the panel
		PlayerOnePanel.setBounds(30, 35, 194, 382);		//If this changes, edit Game.java
		GamePlayAreaPanel.add(PlayerOnePanel);
		PlayerOnePanel.setLayout(null);
		PlayerOnePanel.setVisible(false);
		
		JPanel PlayerTwoPanel = new JPanel()
		{
			protected void paintComponent(Graphics g)
			{
				g.setColor( getBackground() );
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};
		PlayerTwoPanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 204, 0), new Color(0, 102, 255), new Color(255, 204, 0), new Color(0, 102, 204)));
		PlayerTwoPanel.setOpaque(true);
		PlayerTwoPanel.setBackground(new Color (10,10,10,20)); //This gives us 20% opacity for the panel
		PlayerTwoPanel.setBounds(477, 35, 194, 382);	//If this changes, edit Game.java
		GamePlayAreaPanel.add(PlayerTwoPanel);
		PlayerTwoPanel.setLayout(null);
		PlayerTwoPanel.setVisible(false);
		
		JPanel ScoreBoard = new JPanel()
		{
			protected void paintComponent(Graphics g)
			{
				g.setColor( getBackground() );
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};
		ScoreBoard.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 204, 0), new Color(0, 102, 255), new Color(255, 204, 0), new Color(0, 102, 204)));
		ScoreBoard.setOpaque(true);
		ScoreBoard.setBackground(new Color (10,10,10,20)); //This gives us 20% opacity for the panel
		ScoreBoard.setBounds(256, 101, 191, 240);
		GamePlayAreaPanel.add(ScoreBoard);
		ScoreBoard.setLayout(null);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setHorizontalAlignment(SwingConstants.CENTER);
		backgroundLabel.setBounds(0, 0, 701, 452);
		GamePlayAreaPanel.add(backgroundLabel);
		backgroundLabel.setIcon(new ImageIcon("UseThis.jpg"));
		cards.add(GameOverPanel, GAMEOVERPANEL);
		GameOverPanel.setLayout(null);


		JLabel lblGameOver = new JLabel("GAME OVER");
		lblGameOver.setForeground(Color.RED);
		lblGameOver.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblGameOver.setBounds(288, 55, 156, 53);
		GameOverPanel.add(lblGameOver);
		
		JButton btnPlayAgain = new JButton("Play Again");
		btnPlayAgain.setBounds(110, 253, 98, 26);
		GameOverPanel.add(btnPlayAgain);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards, MAINMENUPANEL);
			}
		});
		btnMainMenu.setBounds(318, 253, 98, 26);
		GameOverPanel.add(btnMainMenu);
		
		JButton btnLogout_1 = new JButton("Logout");
		btnLogout_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards, WELCOMEPANEL);
			}
		});
		btnLogout_1.setBounds(526, 253, 98, 26);
		GameOverPanel.add(btnLogout_1);
		
		pane.add(comboBoxPane, BorderLayout.PAGE_START);
		pane.add(cards, BorderLayout.CENTER);
		
	}

	public void itemStateChanged(ItemEvent evt) {
		CardLayout cl = (CardLayout)(cards.getLayout());
		cl.show(cards, (String)evt.getItem());
	}

	/**
	 * Create the GUI and show it.  For thread safety,
	 * this method should be invoked from the
	 * event dispatch thread.
	 */
	private static void createAndShowGUI() {
		//Create and set up the window.
		JFrame frame = new JFrame("CardLayoutDemo");
		frame.setSize(750, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Create and set up the content pane.
		GameLayoutManager demo = new GameLayoutManager();
		demo.addComponentToPane(frame.getContentPane());

		//Display the window.
		//frame.pack();
		
		//LoginControl lc = new LoginControl(demo.LoginPanel, demo.client);
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		/* Use an appropriate Look and Feel */
		try {
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		/* Turn off metal's use of bold fonts */
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		//Schedule a job for the event dispatch thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}

