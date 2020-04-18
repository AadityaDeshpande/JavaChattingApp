/* 
 * * Username Password and Id is to be added in this module Relative changes is to be done
 * * Users table structure is to be changes  
 */
import java.sql.*;
import java.util.Scanner;
public class Newuser extends TestChat
{

	
	public void newus()
	{
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name = sc.nextLine();
			super.setUserName(name);
			System.out.println( name+ " your name is getting Registered ");
			 try
			 {
		          Connection conn = getCon();		          
		          Statement stmt = conn.createStatement();
		          String sql;
		          sql = "insert into users values('"+ name +"')";
				  @SuppressWarnings("unused")
				int i=stmt.executeUpdate(sql);	          
				  System.out.println(); 
				  String sql1;
				  
				  //sql1 = "CREATE TABLE ? ("
				  
				  sql1="create table " + name + " (id INT(11) AUTO_INCREMENT PRIMARY KEY, msgfrom varchar(10), message varchar(50))";
				  
				  
				  @SuppressWarnings("unused")
				int j=stmt.executeUpdate(sql1);
				  System.out.println(" table '"+ name +"' Registered successfully ");
		          conn.close();
		      } 
			  catch(SQLException se)
			  {
		           //Handle errors for JDBC
		           se.printStackTrace();
		      } 
			  catch(Exception e)
			  {
		           //Handle errors for Class.forName
		           e.printStackTrace();
		      }
		}
}