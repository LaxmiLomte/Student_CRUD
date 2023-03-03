
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class Studdent_Insert {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ndb","ndb");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter student details:");
			System.out.println("enter name");
			String Name=sc.next();
			System.out.println("enter RollNo:");
			int RollNo=sc.nextInt();
			System.out.println("enter class:");
			String Class=sc.next();
			System.out.println("enter Address");
			String Address=sc.next();
			PreparedStatement ps=con.prepareStatement("insert into STUDENT1 values(?,?,?,?)");
			ps.setString(1,Name);
			ps.setInt(2,RollNo);
			ps.setString(3,Class);
			ps.setString(4,Address);
            
			int i=ps.executeUpdate();
			System.out.println(i+"inserted successfully");
			con.close();
		}
catch(Exception ex)
		{
	System.out.println(ex);
		}
	}

}
