import java.sql.Connection;
import java.sql.PreparedStatement;

public class DB_INSERT {
	
	public void DB_INSERT_PF(String id_pf,String first_name,String last_name, String cpf,String date_of_birth,String sex,String email,String password)
	{
		DB_CONNECTION obj_db_connection = new DB_CONNECTION();
		Connection connection = obj_db_connection.get_connection();
		
		PreparedStatement ps = null;
		try 
		{
			String query = "INSERT INTO individuals(id_pf,first_name,last_name,cpf,date_of_birth,sex,email,password) values (?,?,?,?,?,?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, id_pf);
			ps.setString(2, first_name);
			ps.setString(3, last_name);
			ps.setString(4, cpf);
			ps.setString(5, date_of_birth);
			ps.setString(6, sex);
			ps.setString(7, email);
			ps.setString(8, password);
			
			System.out.println(ps);
			
			ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	public void DB_INSERT_PJ(String id_pj,String cnpj, String social_reason,String fancy_name, String contact)
	{
		DB_CONNECTION obj_db_connection = new DB_CONNECTION();
		Connection connection = obj_db_connection.get_connection();
		PreparedStatement ps = null;
		
		try 
		{
			String query = "INSERT INTO legal_entity(id_pj,cnpj,social_reason,fancy_name,contact) values (?,?,?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, id_pj);
			ps.setString(2, cnpj);
			ps.setString(3, social_reason);
			ps.setString(4, fancy_name);
			ps.setString(5, contact);
			
			System.out.println(ps);
			ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}	
	}
}
