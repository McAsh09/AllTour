package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import controllers.*;
public class Userhandler
{
    Scanner in = new Scanner(System.in);
    public void main()
    {
     Scanner in = new Scanner(System.in);
     //Userhandler userHandler=new Userhandler();
	 System.out.println("<---------------WELCOME--------------->");
	System.out.println("1. Previous Record");
	System.out.println("2. Book Ticket");
    int choice=in.nextInt();
    switch(choice)
	{
		case 1:
		Userhandler.previousRecord();
		break;
		case 2:
		BookTicket();
		break;
		default:
		System.out.println("Select a Choice");
	}
    }
    static void generateTicket()
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of File(.txt)");
		String filename;
		filename = sc.nextLine();
		try
		{
		FileReader br1 = new FileReader(filename);
		Scanner a = new Scanner(br1);
		while(a.hasNextLine())
		{
			System.out.println(a.nextLine());
		}
		//br1.close();
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
    static void previousRecord()
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of File(.txt)");
		String filename;
		filename = sc.nextLine();
		try
		{
		FileReader br1 = new FileReader(filename);
		Scanner a = new Scanner(br1);
		while(a.hasNextLine())
		{
			System.out.println(a.nextLine());
		}
		//br1.close();
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	    
	}
    static void BookTicket()
	{
		
		String a1,b1,c1;
		int god;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Name(.txt)");			
		String username = in.nextLine();
		try
		{
		
		File user1 = new File(username);
		
		if(user1.createNewFile())
		{
			System.out.println("File Created with Name "+username);
		}
		
		else
			System.out.println("User Already Exists!!");
		
		
		FileWriter use = new FileWriter(username);
		Scanner a = new Scanner(System.in);
		use.write("USERNAME: "+username+"\n");
		use.close();
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		
		try
		{
			System.out.println("Enter Your Age");
			//int age = in.nextInt();
			Scanner h = new Scanner(System.in);				
			File file2 = new File(username);				
			FileWriter u = null;
			String age;
			age = h.nextLine();
			
			u = new FileWriter(file2,true);
			u.write("Age: "+age+"\n");
			u.close();
		}
		
		catch(Exception e)
		{
			System.out.println("Error");
		}
		System.out.println("Enter Mode of transportation");
		System.out.println("1. Roadways");
		System.out.println("2. Railways");
		System.out.println("3. Airways");
	    int  mode = in.nextInt(); 
		switch(mode)
		{
			case 1:
				
				Graph obj = new Graph();
			  //  System.out.println("Road");
				try
				{
					System.out.println("<---------------Welcome to Roadways--------------->");
					//int age = in.nextInt();
					Scanner h = new Scanner(System.in);				
					File file2 = new File(username);				
					FileWriter u = null;
					String transport = "Roadways";
									
					u = new FileWriter(file2,true);
					u.write("Transportation: "+transport+"\n");
					u.close();
				}
				
				catch(Exception e)
				{
					System.out.println("Error");
				}
				
				// newly added
			    try
			    {	
			    	//System.out.println("Try is running");
				    File file = new File("Roadways.txt");
			    	FileReader userR = new FileReader(file);
					BufferedReader br = new BufferedReader(userR);
//					StringBuffer sb = new StringBuffer();
					String line;
//					System.out.println("I m here ----->");
					
					while((line=br.readLine())!=null)
					{
						String[] words = line.split(" ");
						//System.out.println(words[0]+" "+words[1]+" "+words[2]+" ");
						
						int change = Integer.parseInt(words[2]); 
						obj.CreateGraph(words[0],words[1],change);
					}
					obj.DisplayGraph();
					userR.close();
			    }
			    
			    catch(Exception e)
			    {
			    	System.out.println(" ");
			    }
//				newly added file above
			    
			    

				try
				{	
					String input1;
					Scanner p = new Scanner(System.in);
					System.out.println("Enter Source: ");
					input1 = p.nextLine();									
					File file2 = new File(username);				
					FileWriter u = null;
					
					//input1 = p.nextLine();
					
					u = new FileWriter(file2,true);
					u.write("Source of Journey: "+input1+"\n");
					u.close();
					
					String input2;
					Scanner p1 = new Scanner(System.in);
					System.out.println("Enter Destination: ");
					input2 = p1.nextLine();									
					File fileE2 = new File(username);				
					FileWriter u2 = null;
					
					//input1 = p.nextLine();
					
					u2 = new FileWriter(fileE2,true);
					u2.write("Destination: "+input2+"\n");
					u2.close();
					
					obj.shortestPath(input1, input2);
				}
				
				catch(Exception e)
				{
				System.out.println("Error");
				}
				
				try
				{
					//System.out.println("Roadways");
					//int age = in.nextInt();
					Scanner h = new Scanner(System.in);				
					File file2 = new File(username);				
					FileWriter u = null;
					//String cost = "Cost";	
					
					double cost;
					cost = obj.x;
					u = new FileWriter(file2,true);
					u.write("Cost of Journey: "+cost+"\n");
					u.close();
				}
				
				catch(Exception e)
				{
					System.out.println("Error");
				}

			break;
			
			case 2:
				
				Graph obj1 = new Graph();
				try
				{
					System.out.println("<---------------Welcome to Railways--------------->");
					//int age = in.nextInt();
					Scanner h = new Scanner(System.in);				
					File file2 = new File(username);				
					FileWriter u = null;
					String transport = "Railways";
									
					u = new FileWriter(file2,true);
					u.write("Transportation: "+transport+"\n");
					u.close();
				}
				
				catch(Exception e)
				{
					System.out.println("Error");
				}
				
				// newly added
			    try
			    {
				    File file = new File("Railways.txt");
			    	FileReader userR = new FileReader(file);
					BufferedReader br = new BufferedReader(userR);
//					StringBuffer sb = new StringBuffer();
					String line;
					//System.out.println("I m huere ----->");
					
					while((line=br.readLine())!=null)
					{
						String[] words = line.split(" ");
//						System.out.println(words[0]+" ");
						
						int change = Integer.parseInt(words[2]); 
						obj1.CreateGraph(words[0],words[1],change);
					}
					//obj1.DisplayGraph();
					userR.close();
			    }
			    
			    catch(Exception e)
			    {
			    	System.out.println(" ");
			    }
				//newly added file above
			    
			    

				try
				{	
					String input1;
					Scanner p = new Scanner(System.in);
					System.out.println("Enter Source: ");
					input1 = p.nextLine();									
					File file2 = new File(username);				
					FileWriter u = null;
					
					//input1 = p.nextLine();
					
					u = new FileWriter(file2,true);
					u.write("Source of Journey: "+input1+"\n");
					u.close();

					String input2;
					System.out.println("Enter Destination: ");
					input2 = p.nextLine();									
					File filee2 = new File(username);				
					FileWriter u2 = null;
					
					//input1 = p.nextLine();
					
					u = new FileWriter(filee2,true);
					u.write("Destination: "+input2+"\n");
					u.close();
					
					obj1.shortestPath(input1, input2);
				}
				
				catch(Exception e)
				{
				System.out.println("Error");
				}
				
				try
				{
					//System.out.println("Roadways");
					//int age = in.nextInt();
					Scanner h = new Scanner(System.in);				
					File file2 = new File(username);				
					FileWriter u = null;
					//String cost = "Cost";	
					
					double cost;
					cost = obj1.x;
					u = new FileWriter(file2,true);
					u.write("Cost of Journey: "+cost+"\n");
					u.close();
				}
				
				catch(Exception e)
				{
					System.out.println("Error");
				}
				
			break;
			
			
			case 3:
				
				Graph obj22 = new Graph();
				try
				{
					System.out.println("<---------------Welcome To Airways--------------->");
					//int age = in.nextInt();
					Scanner h = new Scanner(System.in);				
					File file2 = new File(username);				
					FileWriter u = null;
					String transport = "Airways";
									
					u = new FileWriter(file2,true);
					u.write("Transportation: "+transport+"\n");
					u.close();
				}
				
				catch(Exception e)
				{
					System.out.println("Error");
				}
				
				// newly added
			    try
			    {
				    File file = new File("Airways.txt");
			    	FileReader userR = new FileReader(file);
					BufferedReader br = new BufferedReader(userR);
//					StringBuffer sb = new StringBuffer();
					String line;
					System.out.println("I m huere ----->");
					
					while((line=br.readLine())!=null)
					{
						String[] words = line.split(" ");
//						System.out.println(words[0]+" ");
						
						int change = Integer.parseInt(words[2]); 
						obj22.CreateGraph(words[0],words[1],change);
						
					}
					//obj22.DisplayGraph();
					userR.close();
			    }
			    
			    catch(Exception e)
			    {
			    	System.out.println(" ");
			    }
				//newly added file above
			    
			    

				try
				{	
					String input1;
					Scanner p = new Scanner(System.in);
					System.out.println("Enter Source: ");
					input1 = p.nextLine();									
					File file2 = new File(username);				
					FileWriter u = null;
					
					//input1 = p.nextLine();
					
					u = new FileWriter(file2,true);
					u.write("Source of Journey: "+input1+"\n");
					u.close();

					String input2;
					System.out.println("Enter Destination: ");
					input2 = p.nextLine();									
					File filee2 = new File(username);				
					FileWriter u2 = null;
					
					//input1 = p.nextLine();
					
					u = new FileWriter(filee2,true);
					u.write("Destination: "+input2+"\n");
					u.close();
					
					obj22.shortestPath(input1, input2);
				}
				
				catch(Exception e)
				{
				System.out.println("Error");
				}
				
				try
				{
					//System.out.println("Roadways");
					//int age = in.nextInt();
					Scanner h = new Scanner(System.in);				
					File file2 = new File(username);				
					FileWriter u = null;
					//String cost = "Cost";	
					
					double cost;
					cost = obj22.x;
					u = new FileWriter(file2,true);
					u.write("Cost of Journey: "+cost+"\n");
					u.close();
				}
				
				catch(Exception e)
				{
					System.out.println("Error");
				}
				
			break;

	}
		//System.out.println("Everything called");
		System.out.println("Do you Wish to Generate Ticket? (1--->Yes | 0--->No)");
		Scanner abc = new Scanner(System.in);
		int ab = abc.nextInt();
		if(ab == 1) {
			generateTicket();
		}else {
			System.out.println("Thank You For Booking!");
		}

	}
    
}