import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class Student_Delete {

	public static void main(String[] args) {
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ndb","ndb");
			Scanner sc=new Scanner(System.in);
			String Name=sc.next();
			PreparedStatement ps=con.prepareStatement("delete from STUDENT1 where Name=?");
			ps.setString(1,Name);
			int i=ps.executeUpdate();
			System.out.println(i+"record deleted successfully");
			

		con.close();
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}

	}

}
