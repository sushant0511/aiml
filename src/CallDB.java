import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CallDB {

	public static void main(String[] args) {
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection connection=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/aiml", "root", "root");
		Statement statement=connection.createStatement();
		ResultSet set=statement.executeQuery("select * from student");
		while(set.next())
		{
			System.out.println(set.getInt(1)+"  "+set.getString(2));
		}
		
		
		
		
		
		
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
