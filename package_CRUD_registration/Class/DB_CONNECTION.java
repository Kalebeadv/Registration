import java.sql.Connection;
import java.sql.DriverManager;

public class DB_CONNECTION 
{
	private Connection connection;
	
	public Connection GETMYCONNECTION()
	{
		setConnection(null); 
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			setConnection(DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration","root",""));
			
		} 
		
		catch (Exception e) {System.out.println(e);}
		return getConnection();
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	
}
