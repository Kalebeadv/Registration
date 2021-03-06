import java.sql.Connection;
import java.sql.PreparedStatement;

public class Db_individuals_update {
	
	private Db_connection obj_db_connection;
	private Connection connection;
	private PreparedStatement ps;
	private String query;
	
	public void Update_all_attributes_of_people(String id_pf, String new_first_name, String new_last_name, String new_cpf, String new_date_of_birth, String new_sex, String new_email, String new_password)
	{
		setObj_db_connection(new Db_connection());
		setConnection(getObj_db_connection().GETMYCONNECTION());
		setPs(null);
		
		try 
		{
			setQuery("Update individuals set first_name = ?,last_name = ?, cpf = ?,date_of_birth = ?,sex = ?,email = ?,password = ? where ID_pf = ?");
			setPs(getConnection().prepareStatement(getQuery()));
			getPs().setString(1, new_first_name);
			getPs().setString(2, new_last_name);
			getPs().setString(3, new_cpf);
			getPs().setString(4, new_date_of_birth);
			getPs().setString(5, new_sex);
			getPs().setString(6, new_email);
			getPs().setString(7, new_password);
			getPs().setString(8, id_pf);
			System.out.println(getPs());
			getPs().executeUpdate();
			
		} catch (Exception e) {System.out.println(e);}
	}

	public Db_connection getObj_db_connection() {
		return obj_db_connection;
	}

	public void setObj_db_connection(Db_connection obj_db_connection) {
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

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	
}
