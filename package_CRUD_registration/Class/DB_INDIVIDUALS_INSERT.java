import java.sql.Connection;
import java.sql.PreparedStatement;

public class DB_INDIVIDUALS_INSERT {
	
	private DB_CONNECTION obj_db_connection;
	private Connection connection;
	private PreparedStatement ps;
	
	public static void main(String[] args) {
		
		DB_INDIVIDUALS_INSERT obj_db_insert = new DB_INDIVIDUALS_INSERT();
		obj_db_insert.DB_INSERT_INDIVIDUALS_BUT_NO_PHONE_AND_ADRESS("1", "kalebe", "Silva", "123456789", "2000-12-03", "M", "kalebe@gmail.com", "12345678");
	}
	
	public void DB_INSERT_INDIVIDUALS_BUT_NO_PHONE_AND_ADRESS(String id_pf,String first_name,String last_name, String cpf,String date_of_birth,String sex,String email,String password)
	{
		setObj_db_connection(new DB_CONNECTION());
		setConnection(getObj_db_connection().GETMYCONNECTION());
		
		setPs(null);
		try 
		{
			String query = "INSERT INTO individuals(id_pf,first_name,last_name,cpf,date_of_birth,sex,email,password) values (?,?,?,?,?,?,?,?)";
			setPs(connection.prepareStatement(query));
			getPs().setString(1, id_pf);
			getPs().setString(2, first_name);
			getPs().setString(3, last_name);
			getPs().setString(4, cpf);
			getPs().setString(5, date_of_birth);
			getPs().setString(6, sex);
			getPs().setString(7, email);
			getPs().setString(8, password);
			System.out.println(getPs());
			getPs().executeUpdate();
		} 
		catch (Exception e){System.out.println(e);}
	}
	
	

	public DB_CONNECTION getObj_db_connection() {
		return obj_db_connection;
	}


	public void setObj_db_connection(DB_CONNECTION obj_db_connection) {
		this.obj_db_connection = obj_db_connection;
	}


	public Connection getConnection() {
		return connection;
	}


	public void setConnection(Connection connection) {
		this.connection = connection;
	}


	public PreparedStatement getPs() {
		return ps;
	}


	public void setPs(PreparedStatement ps) {
		this.ps = ps;
	}
	
	
	
	
}
