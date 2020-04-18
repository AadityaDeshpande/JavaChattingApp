/*
 * No synchronization is required as only read operation is performing
 * 
 * only newMessage is need to be printed not the complete table
 */

import java.sql.*;

public class ThreadClass extends TestChat implements  Runnable 
{
	String name;
	Thread b;
	TestChat tb;
	
	ThreadClass(String name)
	{
		this.name=name;
		tb=new TestChat();
		
		b=new Thread(this);
		b.start();
		/*//r1=new Thread(this);
		tb.start();
		//r1.start();

		/*System.out.println(b);
		System.out.println("constructor called");*/
	}
	public void run()
	{
		Connection c=tb.getCon();
		//System.out.println("in RUN");
		int id=0,temp=0;
		
		try
		{
			
			
			while(true)
			{
				Statement st=c.createStatement();
				String str;
				str="select id from "+this.name;
				//Resultset rs=st.executeQuery(str);
				//System.out.println(id+"id selected");
				//pst.setString(1,this.name);
				ResultSet rs=st.executeQuery(str);
				
				while(rs.next())
					id=rs.getInt("id");
				
				//System.out.println(id);
				if(id!=temp)
				{
					/*System.out.print("\033[H\033[2J");
					System.out.flush();*/
					System.out.println("your old messages are");
					//tb.tableread(name);
					tb.lastMessage(name);
				}
				temp=id;
				Thread.sleep(500);
				
			}
			
			
		} 
		catch (Exception e)
		{
			System.out.println("Exception caught in ThreadClass");
			//e.printStackTrace();
		}
		

		
		
		//Thread t=new 
	}
}
