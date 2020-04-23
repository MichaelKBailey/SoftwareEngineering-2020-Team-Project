package PanelAttackPackage;

import static org.junit.Assert.*;

import java.awt.CardLayout;

import javax.swing.JPanel;

import org.junit.*;

public class GameClientTest {
	private GameClient gc;
	private JPanel panel;
	private GameLayoutManager gameLayout;
	private GamePlayAreaControl gamePlayAreaControl;
	private LoginControl loginControl;
	private RegisterControl registerControl;

	@Before
	public void setUp() throws Exception 
	{
		gc = new GameClient("localhost", 8300);

		panel = new JPanel();
		panel.setLayout(new CardLayout());

		loginControl = new LoginControl(panel, gc);
		loginControl.setCards(panel);

		registerControl = new RegisterControl(panel, gc);
		registerControl.setCards(panel);

		gamePlayAreaControl = new GamePlayAreaControl(gc);

		gameLayout = new GameLayoutManager();

		gc.setLoginControl(loginControl);
		gc.setRegisterControl(registerControl);
		gc.setGamePlayAreaControl(gamePlayAreaControl);

	}

	@Test
	public void testHandleMessageFromServer0() {

		gc.handleMessageFromServer("Login Successful.");

		assertTrue("Expected loggin to be completed", loginControl.success);
		assertFalse("Expected registration to not be completed", registerControl.success);
		assertFalse("Expected gamePlayAreaControl to not update", gamePlayAreaControl.updateSuccess);
	}

	@Test
	public void testHandleMessageFromServer1() {

		loginControl.success = true;
		
		gc.handleMessageFromServer("The username and password are incorrect.");
		
		assertFalse("Expected loggin to not be completed", loginControl.success);
		assertFalse("Expected registration to not be completed", registerControl.success);
		assertFalse("Expected gamePlayAreaControl to not update", gamePlayAreaControl.updateSuccess);
	}

	@Test
	public void testHandleMessageFromServer2() {

		gc.handleMessageFromServer("Account Registration Successful.");

		
		assertFalse("Expected loggin to not be completed", loginControl.success);
		assertTrue("Expected registration to be completed", registerControl.success);
		assertFalse("Expected gamePlayAreaControl to not update", gamePlayAreaControl.updateSuccess);
		
	}

	@Test
	public void testHandleMessageFromServer3() {
		
		registerControl.success = true;
		
		gc.handleMessageFromServer("The username is already in use.");
		
		assertFalse("Expected loggin to not be completed", loginControl.success);
		assertFalse("Expected registration to not be completed", registerControl.success);
		assertFalse("Expected gamePlayAreaControl to not update", gamePlayAreaControl.updateSuccess);
	}

	@Test
	public void testHandleMessageFromServer4() {
		try {
			gc.handleMessageFromServer(new GameData());
		}catch(NullPointerException e) {

		}

		assertFalse("Expected loggin to not be completed", loginControl.success);
		assertFalse("Expected registration to not be completed", registerControl.success);
		assertTrue("Expected gamePlayAreaControl to update", gamePlayAreaControl.updateSuccess);
	}

}
