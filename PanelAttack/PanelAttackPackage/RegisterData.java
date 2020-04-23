
package PanelAttackPackage;

import java.io.Serializable;

public class RegisterData implements Serializable{
	public String username;
	public String password;
	public String passwordVerify;
	
	
	public RegisterData(String username, String password, String passwordVerify) {
		this.username = username;
		this.password = password;
		this.passwordVerify = passwordVerify;
	}
	
	public void setPasswordVerify(String passwordVerify) {
		this.passwordVerify = passwordVerify;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPasswordVerify() {
		return this.passwordVerify;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getUsername() {
		return this.username;
	}
}
