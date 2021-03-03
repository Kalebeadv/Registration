import java.sql.Connection;
import java.sql.PreparedStatement;

public class Db_individuals_delete {
	
	private Db_connection obj_db_connection;
	private Connection connection;
	private PreparedStatement ps;
	private String query;
	
	
	public void Delete_one_people(String id_pf)
	{
		setObj_db_connection(new Db_connection());
		setConnection(getObj_db_connection().GETMYCONNECTION());
		setPs(null);
		
		try 
		{
			setQuery("delete from individuals where ID_PF = ?");
			setPs(getConnection().prepareStatement(getQuery()));
			getPs().setString(1, id_pf);
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
