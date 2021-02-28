import java.sql.Connection;
import java.sql.DriverManager;

public class DB_CONNECTION 
{
	
	public Connection get_connection()
	{
		Connection connection= null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration","root","");
			
		} 
		
		catch (Exception e) 
		
		{
			System.out.println(e);
		}
		return connection;
	}

	
}
