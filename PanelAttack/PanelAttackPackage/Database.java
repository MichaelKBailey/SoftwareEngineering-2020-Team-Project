//
package PanelAttackPackage;

import java.sql.*;
import java.io.*;
import java.util.*;

public class Database
{
	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	private final String key = "key";

	public Database() throws IOException
	{
		//Read properties file
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("db.properties");
		prop.load(fis);
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String pass = prop.getProperty("password");    

		try
		{
			con = DriverManager.getConnection(url,user,pass);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		} 
	}

	public ArrayList<String> query(String query)
	{
		ArrayList<String> result = new ArrayList<String>();

		try
		{
			//Create a statement
			stmt = con.createStatement();

			//Execute a query
			rs = stmt.executeQuery(query);

			//Fetch each row and add to the array list
			int i = 0;

			//If the result set is empty, return null. Else, proceed to read into the array list
			//Use do while so not to lose the 1st line of the file
			if (!rs.next())
			{
				System.out.println("Result set is empty.");
				return null;
			}
			else 
			{
				do
				{	
					result.add(rs.getString(i));
					i++;

				} while(rs.next());
			}

			//Close the connection
			con.close();
		}
		catch (SQLException e)
		{
			return null;
		}

		return result;
	}

	public void executeDML(String dml) throws SQLException
	{
		try 
		{
			//Create a statement
			stmt = con.createStatement();
			stmt.execute(dml);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	// Method for verifying a username and password.
	  public boolean verifyAccount(String username, String password)
	  {	    
		try
		{
			//Create a statement
			stmt = con.createStatement();

			//Execute a query
			rs = stmt.executeQuery("select *, aes_decrypt(Password,'" + key + "') from user where username = '"+ username + "';");

			//If the result set is empty, return null. Else, proceed to read into the array list
			//Use do while so not to lose the 1st line of the file
			if (!rs.next())
			{
				System.out.println("Result set is empty.");
				return false;
			}
			else 
			{
				String temp = rs.getString(3);
				
				// Check the username and password.
			    if (temp.equals(password))
			      return true;
			    else
			      return false;
			}

		}
		catch (SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	  }
	  
	// Method for creating a new account.
	  public boolean createNewAccount(String username, String password)
	  {
		  try 
			{
				//Create a statement
				stmt = con.createStatement();
				stmt.execute("INSERT INTO user VALUES ('" + username + "', AES_ENCRYPT('" + password +"', 'key'));");
			}
			catch (SQLException e)
			{
				return false;
			}
		  
		  return true;
	  }
	  
}

