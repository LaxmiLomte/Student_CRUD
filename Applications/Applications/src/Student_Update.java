import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class Student_Update {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ndb","ndb");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter details for update record");
			System.out.println("enter name");
			String Name=sc.next();
			System.out.println("enter roll no");
			int RollNo=sc.nextInt();
			
			String Class=sc.next();
			String Address=sc.next();
			
			PreparedStatement ps=con.prepareStatement("update STUDENT1 set RollNo=?,Class=?,Address=? where Name=?");
			
			
			ps.setInt(1,RollNo);
			ps.setString(2,Class);
			ps.setString(3,Address);
			ps.setString(4,Name);
 
			int i=ps.executeUpdate();
			System.out.println(i+"record updated");
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
	}

}
}