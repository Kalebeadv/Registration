import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Db_individuals_select {
	
	private Db_connection obj_db_connection = new Db_connection();
	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;
	private String query;
	
	public static void main(String[] args) {
		
		
	}
	
	public void SELECT_BY_PRIMARY_KEY(String id_pf)
	{
		
		setObj_db_connection(new Db_connection());
		setConnection(getObj_db_connection().GETMYCONNECTION());
		setPs(null);
		setRs(null);
		
		try 
		{
			
			setQuery("SELECT * from individuals where ID_PF = ?");
			setPs(getConnection().prepareStatement(getQuery()));
			getPs().setString(1, id_pf);
			System.out.println(getPs());
			
			setRs(getPs().executeQuery());
			
			while(getRs().next())
			{
				
				System.out.println("#-----------------------------------------------------------#");
				System.out.println("ID: "+ getRs().getString("id_pf"));
				System.out.println("Full name: "+getRs().getString("first_name") +" "+ getRs().getString("last_name"));
				System.out.println("CPF: "+getRs().getString("cpf"));
				System.out.println("Date of birth: "+getRs().getString("date_of_birth"));
				System.out.println("Sex: "+getRs().getString("sex"));
				System.out.println("Email: "+getRs().getString("email"));
				System.out.println("Password: "+getRs().getString("password"));
				System.out.println("#-----------------------------------------------------------#");
			}
		} 
		catch (Exception e) {System.out.println(e);}		
	}

	public void SELECT_ALL_FROM_TABLE()
	{
		setObj_db_connection(new Db_connection());
		setConnection(getObj_db_connection().GETMYCONNECTION());
		setPs(null);
		setRs(null);
		
		try 
		{
			setQuery("SELECT * FROM INDIVIDUALS");
			setPs(getConnection().prepareStatement(getQuery()));
			setRs(getPs().executeQuery());
			
			while(getRs().next())
			{
				System.out.println("#-----------------------------------------------------------#");
				System.out.println("ID: "+ getRs().getString("id_pf"));
				System.out.println("Full name: "+getRs().getString("first_name") +" "+ getRs().getString("last_name"));
				System.out.println("CPF: "+getRs().getString("cpf"));
				System.out.println("Date of birth: "+getRs().getString("date_of_birth"));
				System.out.println("Sex: "+getRs().getString("sex"));
				System.out.println("Email: "+getRs().getString("email"));
				System.out.println("Password: "+getRs().getString("password"));
				System.out.println("#-----------------------------------------------------------#");
			}
			
		} catch (Exception e){System.out.println(e);}
		
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

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
	
	

}
