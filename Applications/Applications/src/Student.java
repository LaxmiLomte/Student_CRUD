import java.sql.*;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ndb","ndb");
			Scanner sc=new Scanner(System.in);
          
            PreparedStatement ps=con.prepareStatement("create table STUDENT1(name varchar2(38),Rollno number(38),Class varchar2(38),Address varchar2(38))");
            int i=ps.executeUpdate();
            System.out.println("table is created");
            con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
