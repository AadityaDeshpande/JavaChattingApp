
/*
 * For new client 
 * Localhost and relative ip of database is to be added
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;
public class TestChat {
	//data members
	private String userName;
	
	//getters and setters
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	//member functions
	
	public Connection getCon() {
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL= "jdbc:mysql://192.168.137.104/chatusers";
	    //final String DB_URL = "jdbc:mysql://localhost/chatusers";
		final String USER = "root";
	    final String PASS = "password";
		//final String PASS ="";
		Connection conn=null;
		
		 try {
			 Class.forName(JDBC_DRIVER);
			 conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return conn;
	}
	
	synchronized public void tablewrite(String sendto,String m1) { //db columns
		String msg="";
		
		/*int sturoll=proll;
		int stumark=pmark;*/
		
		  try {
	          Connection conn = getCon();
	          // Execute SQL query
	         String sql = "insert into "+sendto+" (msgfrom,message)values(?,?)"; 
PreparedStatement pst=conn.prepareStatement(sql);
	         pst.setString(1,userName);
	         pst.setString(2, m1);
	         
	         int i= pst.executeUpdate();
	         
	         if(i!=0){
	        	 msg="Message sent successfully";
	             System.out.println(msg); 
	             
	         }
	         else{  
	             msg="Message NOT SENT";
	             System.out.println(msg);
	            }  
	  	          	                   
	           pst.close();
	           conn.close();
	        } catch(SQLException se) {
	           //Handle errors for JDBC
	           se.printStackTrace();
	        } catch(Exception e) {
	           //Handle errors for Class.forName
	           e.printStackTrace();
	        } finally {
	            //finally block used to close resources
	        }	
	}
	
	public void tableread(String tbname) {
		
		  try {
	          Connection conn = getCon();
	          // Execute SQL query
	          
	          Statement stmt = conn.createStatement();
	          String sql;
	          sql = "SELECT id,msgfrom,message FROM "+tbname;
	          ResultSet rs = stmt.executeQuery(sql);
	          
	          while(rs.next()) {
	        	  int id = rs.getInt("id");
	        	  String use1 = rs.getString("msgfrom");
	        	 String msg1 = rs.getString("message");
	        	 //int stumark=rs.getInt("stumark");
	   System.out.println("id: "+id+" Message from: "+use1+" message is: "+msg1);
	          }
	          
	           conn.close();
	        } catch(SQLException se) {
	           //Handle errors for JDBC
	           se.printStackTrace();
	        } catch(Exception e) {
	           //Handle errors for Class.forName
	           e.printStackTrace();
	        } finally {
	            //finally block used to close resources
	        }
	}
	
	synchronized public boolean checkuser(String second) {
								//returns true when user want to chat with valid user
		try {
	          Connection conn = getCon();
	          // Execute SQL query
	          
	          Statement stmt = conn.createStatement();
	          String sql;
	          sql = "SELECT user FROM users";
	          ResultSet rs = stmt.executeQuery(sql);
	          //System.out.println("Available users at " + new Date().toString());
	          while(rs.next()) {
	        	  //int id = rs.getInt("id");
	        	  String use1 = rs.getString("user");
	        	  if(use1.equals(second))
	        		  return true;
	        	  //System.out.println(use1);
	        	 //String msg1 = rs.getString("message");
	        	 //int stumark=rs.getInt("stumark");
	   //System.out.println("id: "+id+" Message from: "+use1+" message is: "+msg1);
	          }
	          
	           conn.close();
	        } catch(SQLException se) {
	           //Handle errors for JDBC
	           se.printStackTrace();
	        } catch(Exception e) {
	           //Handle errors for Class.forName
	           e.printStackTrace();
	        } finally {
	            //finally block used to close resources
	        }
		
		
		return false;
		
	}
	
	public void userread() {
		//for displaying all the users
		  try {
	          Connection conn = getCon();
	          // Execute SQL query
	          
	          Statement stmt = conn.createStatement();
	          String sql;
	          sql = "SELECT user FROM users";
	          ResultSet rs = stmt.executeQuery(sql);
	          System.out.println("\nAvailable users at " + new Date().toString());
	          while(rs.next()) {
	        	  //int id = rs.getInt("id");
	        	  String use1 = rs.getString("user");
	        	  
	        	  System.out.println(use1);
	        	 //String msg1 = rs.getString("message");
	        	 //int stumark=rs.getInt("stumark");
	   //System.out.println("id: "+id+" Message from: "+use1+" message is: "+msg1);
	          }
	          
	           conn.close();
	        } catch(SQLException se) {
	           //Handle errors for JDBC
	           se.printStackTrace();
	        } catch(Exception e) {
	           //Handle errors for Class.forName
	           e.printStackTrace();
	        } finally {
	            //finally block used to close resources
	        }
	}
	
	synchronized public void lastMessage(String tbname) {
		
		  try {
	          Connection conn = getCon();
	          // Execute SQL query
	          
	          Statement stmt = conn.createStatement();
	          String sql;
	          sql = "SELECT id,msgfrom,message FROM "+tbname;
	          ResultSet rs = stmt.executeQuery(sql);
	          
	          int id = 0;
	          String use1 = null , msg1 = null;
	          
	          System.out.flush();
	          
	          while(rs.next()) {
	        	 id = rs.getInt("id");
	        	 use1 = rs.getString("msgfrom");
	        	 msg1 = rs.getString("message");
	        	 //int stumark=rs.getInt("stumark");	   
	          }
	          
	          System.out.println("id: "+id+" Message from: "+use1+" message is: "+msg1);
	           conn.close();
	        } catch(SQLException se) {
	           //Handle errors for JDBC
	           se.printStackTrace();
	        } catch(Exception e) {
	           //Handle errors for Class.forName
	           e.printStackTrace();
	        } finally {
	            //finally block used to close resources
	        }
	}
	
	/*public boolean validateUser(String pUsername , String pPassword) {
		//returns true when user sends valid user_id and password
		try {
		Connection conn = getCon();
		// Execute SQL query
		
		Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT user,password FROM users";
		ResultSet rs = stmt.executeQuery(sql);
		//System.out.println("Available users at " + new Date().toString());
		while(rs.next()) {
		//int id = rs.getInt("id");
		String dUsername = rs.getString("user");
		String dPassword = rs.getString("pass");
		
		if(dUsername.equals(pUsername) && (dPassword.equals(pPassword))) {
			return true;	
		}
		
		//System.out.println(use1);
		//String msg1 = rs.getString("message");
		//int stumark=rs.getInt("stumark");
		//System.out.println("id: "+id+" Message from: "+use1+" message is: "+msg1);
		}
		
		conn.close();
		} catch(SQLException se) {
		//Handle errors for JDBC
		se.printStackTrace();
		} catch(Exception e) {
		//Handle errors for Class.forName
		e.printStackTrace();
		} finally {
		//finally block used to close resources
		}
		
		
		return false;

}*/
	
	
	//Main Method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		try {
		
		TestChat obj = new TestChat();
		Newuser user = new Newuser();
		
		System.out.println("Are you a new user ? (yes/no)");
		String res = sc.nextLine();
		
		//Anand Module called
		if(res.equals("yes"))
		 user.newus();
		
		System.out.println("Hello, please enter your name, ");
		String myname = sc.nextLine();
		if(obj.checkuser(myname)) {
		obj.setUserName(myname);
		obj.tableread(myname);
		}
		else {
		System.out.println("You are not Registered user Register now.");	
		user.newus();
		}
		//System.out.println("your old messages are");		
		//obj.tableread(myname);
		
		
		// Devashish and saish module called
		ThreadClass cl = new ThreadClass(myname);
		
		Thread.sleep(500);
		
		synchronized (cl) {
			obj.userread();
		}
		
		while(true) {
		System.out.println("\nwho do you want to send message");	
			
				//show users && checkinput()
			
		String sendto = sc.nextLine();
		
		if(obj.checkuser(sendto))
		{
		System.out.println("Enter message you want to send");	
		
		String msg = sc.nextLine();
		
		obj.tablewrite(sendto, msg);
		System.out.flush();
		}
		
		else {
			System.out.println("user already exists");
		}
		//obj.tablewrite(sendto,msg);
		}
		
		//obj.tableread();
		}
		catch(Exception e) {
			System.out.println("link re establishment, run again");
			//Connection c = obj.getCon();
		}
		finally {
			sc.close();
		
		}
		
	}

}


