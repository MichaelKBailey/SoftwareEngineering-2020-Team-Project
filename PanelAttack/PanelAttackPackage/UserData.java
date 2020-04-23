package PanelAttackPackage;

public class UserData {
	private int idNumber;
	private String username, password;
	private GameClient gameClient;
	
	public UserData(String username, String password, int idNumber) {
		this.idNumber = idNumber;
		this.username = username;
		this.password = password;
	}
	
	public String toString() {
		String toString = "Username = " + this.username + ", Password = " + this.password +
				", ID = " + this.idNumber;
		return toString;
	}

	public GameClient getGameClient() {
		return gameClient;
	}

	public void setGameClient(GameClient gameClient) {
		this.gameClient = gameClient;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword() {
		this.password = password;
	}
	
	public int getId() {
		return this.idNumber;
	}
	
	public void setId(int id) {
		this.idNumber = id;
	}
	
	public boolean equals(UserData data) {
		boolean result;
		int id = data.getId();
		String username = data.getUsername();
		String password = data.getPassword();
		if (id == this.idNumber && username.equals(this.username) && password.equals(this.password))
			result = true;
		else
			result = false;
		return result;
	}
	

}
