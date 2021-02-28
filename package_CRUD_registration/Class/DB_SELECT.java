import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB_SELECT {
	
	public void DB_SELECT_INDIVIDUALS(String id_pf)
	{
		
		DB_CONNECTION obj_db_connection = new DB_CONNECTION();
		Connection connection = obj_db_connection.get_connection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try 
		{
			
			String query = "SELECT * from individuals where ID_PF = ?";
			ps = connection.prepareStatement(query);
			ps.setString(1, id_pf);
			System.out.println(ps);
			
			rs =  ps.executeQuery();
			
			while(rs.next())
			{
				
				System.out.println("#-----------------------------------------------------------#");
				System.out.println("ID: "+rs.getString("id_pf"));
				System.out.println("Full name: "+rs.getString("first_name") +" "+ rs.getString("last_name"));
				System.out.println("CPF: "+rs.getString("cpf"));
				System.out.println("Date of birth: "+rs.getString("date_of_birth"));
				System.out.println("Sex: "+rs.getString("sex"));
				System.out.println("Email: "+rs.getString("email"));
				System.out.println("Password: "+rs.getString("password"));
				System.out.println("#-----------------------------------------------------------#");
			}
		} 
		catch (Exception e) 
		{
			
			System.out.println(e);
		}
		
		
	}
	
	public void DB_SELECT_LEGAL_ENTITY(String id_pj)
	{
		DB_CONNECTION obj_db_connection = new DB_CONNECTION();
		Connection connection = obj_db_connection.get_connection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try 
		{
			String query = "SELECT * FROM LEGAL_ENTITY WHERE ID_PJ = ?";
			ps =  connection.prepareStatement(query);
			ps.setString(1, id_pj);
			System.out.println(ps);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println("#-----------------------------------------------------------#");	
				System.out.println("ID: "+rs.getString("id_pj"));
				System.out.println("CNPJ: "+rs.getString("cnpj"));
				System.out.println("Social reason: "+rs.getString("social_reason"));
				System.out.println("Fancy name: "+rs.getString("fancy_name"));
				System.out.println("Contact: "+rs.getString("contact"));
				System.out.println("#-----------------------------------------------------------#");	

			}
		} 
		
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
