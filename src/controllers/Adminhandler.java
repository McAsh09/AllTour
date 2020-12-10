package controllers;

import java.io.*;
import java.util.Scanner;

public class Adminhandler 
{

	static void addRecord() 
	{
		Scanner sc = new Scanner(System.in);
		int choice1;
		
		System.out.println("------Enter Mode of transportation------");
		System.out.println("1. Airways");
		System.out.println("2. Railways");
		System.out.println("3. Roadways");
		
		choice1 = sc.nextInt();
		switch(choice1)
		{
			case 1: //System.out.println("Enter Source");
			try
			{	
				System.out.println("Enter Source");
				Scanner sc1 = new Scanner(System.in);
				File airways = new File("Airways.txt");
				if(airways.createNewFile())
				{
					System.out.println("BOOKING Through Airways ---->");
				}
				
				Scanner scccc1 = new Scanner(System.in);
				File fileee1 = new File("Airways.txt");
				FileWriter wrrr1 = null;
				String sourceee1;
				sourceee1 = scccc1.nextLine();
				
				wrrr1 = new FileWriter(fileee1,true);
				wrrr1.write(sourceee1+" ");
				wrrr1.close();
				
				
				// I have try catch block 'inside' outer 'try' block
				
				
				try
				{
					System.out.println("Enter Destination");
					Scanner scc1 = new Scanner(System.in);
					File file1 = new File("Airways.txt");
					FileWriter wr1 = null;
					String source1;
					source1 = scc1.nextLine();
					
					wr1 = new FileWriter(file1,true);
					wr1.write(source1+" ");
					wr1.close();
				}
				
				catch(Exception e )
				{
					System.out.println("Error in Airways");
				}
				
				
				try
				{
//					Random rand = new Random();
					System.out.println("Distance: ");
					Scanner sccc1 = new Scanner(System.in);
					File filee1 = new File("Airways.txt");
					FileWriter wrr1 = null;
					String sourcee1;
					sourcee1 = sccc1.nextLine();
//					int randDist1 = rand.nextInt();
					wrr1 = new FileWriter(filee1,true);
					wrr1.write(sourcee1+"\n");
					wrr1.close();
				}
				
				catch(Exception e )
				{
					System.out.println("Error in Airways");
				}
			}
			catch(Exception e)
			{
				System.out.println("Error in creating AIRWAYS File!");
			}
			break;
			
			case 2: System.out.println("Enter Source");
			try
			{	
				Scanner sc2 = new Scanner(System.in);
				File railways = new File("Railways.txt");
				if(railways.createNewFile())
				{
					System.out.println("BOOKING Through Railways ---->");
				}
//				else
//				{
//					System.out.println("Railways Mode already CHOSEN and CREATED");
//				}
				File file = new File("Railways.txt");
				FileWriter wr = null;
				String dest2;
				dest2 = sc2.nextLine();
				wr = new FileWriter(file,true);
				wr.write(dest2+" ");
				wr.close();
				
				try
				{
					System.out.println("Enter Destination");
					Scanner scc2 = new Scanner(System.in);
					File file2 = new File("Railways.txt");
					FileWriter wr2 = null;
					String source2;
					source2 = scc2.nextLine();
					
					wr2 = new FileWriter(file2,true);
					wr2.write(source2+" ");
					wr2.close();
				}
				
				catch(Exception e )
				{
					System.out.println("Error in Railways");
				}
				
				
				try
				{
					System.out.println("Distance");
					Scanner sccc2 = new Scanner(System.in);
					File filee2 = new File("Railways.txt");
					FileWriter wrr2 = null;
					String sourcee2;
					sourcee2 = sccc2.nextLine();
					
					wrr2 = new FileWriter(filee2,true);
					wrr2.write(sourcee2+"\n");
					wrr2.close();
				}
				
				catch(Exception e )
				{
					System.out.println("Error in Railways");
				}
			}
			catch(Exception e)
			{
				System.out.println("Error in creating RAILWAYS File!");
			}
			break;
			
			case 3: System.out.println("Enter Source");
			try
			{	
				Scanner sc3 = new Scanner(System.in);
				File roadways = new File("Roadways.txt");
				if(roadways.createNewFile())
				{
					System.out.println("BOOKING Through Roadways ---->");
				}
//				else
//				{
//					System.out.println("Roadways Mode already CHOSEN and CREATED");
//				}
				File fileee3 = new File("Roadways.txt");
				FileWriter wrr = null;
				String dest3;
				dest3 = sc3.nextLine();
				
				wrr = new FileWriter(fileee3,true);
				wrr.write(dest3+" ");
				wrr.close();
				
				try
				{
					System.out.println("Enter Destination");
					Scanner scc3 = new Scanner(System.in);
					File file3 = new File("Roadways.txt");
					FileWriter wr3 = null;
					String source3;
					source3 = scc3.nextLine();
					
					wr3 = new FileWriter(file3,true);
					wr3.write(source3+" ");
					wr3.close();
				}
				
				catch(Exception e )
				{
					System.out.println("Error in Airways");
				}
				
				
				try
				{
					System.out.println("Enter Distance: ");
					Scanner sccc3 = new Scanner(System.in);
					File filee3 = new File("Roadways.txt");
					FileWriter wrr3 = null;
					String sourcee3;
					sourcee3 = sccc3.nextLine();
					
					wrr3 = new FileWriter(filee3,true);
					wrr3.write(sourcee3+"\n");
					wrr3.close();
				}
				
				catch(Exception e )
				{
					System.out.println("Error in Roadways");
				}
			}
			catch(Exception e)
			{
				System.out.println("Error in creating ROADWAYS File!");
			}
			break;
		}

	

	}
	
	static void updateRecord(String filepath,String oldString, String newString)
	{
		File change = new File(filepath);

		String oldContent = "";
		 
        BufferedReader reader = null;
         
        FileWriter writer = null;
        try
        {
            reader = new BufferedReader(new FileReader(change));
             
            //Reading all the lines of input text file into oldContent
             
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            //Replacing oldString with newString in the oldContent
             
            String newContent = oldContent.replaceAll(oldString, newString);
             
            //Rewriting the input text file with newContent
             
            writer = new FileWriter(change);
             
            writer.write(newContent);
          
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        finally
        {
            try
            {
                //Closing the resources
                 
                reader.close();
                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
        System.out.println("EDIT SUCCESSFUL");
		
	}
	
	static void seeRecord(String filepath)
	{
		try
		{
		FileReader cr = new FileReader(filepath);
		Scanner sc = new Scanner(cr);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
	
	static void deleteRecord(String filename)
	{
		try
		{
		FileWriter br = new FileWriter(filename);
		br.write("");
		
		br.close();
		}
		
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
	
	
	static void choiceSelector(int userChoice)
	{	
		 switch(userChoice)
		{
	        case 1:
	        	addRecord();
	            break;
	        case 2:
				Scanner a = new Scanner(System.in);
				String oldWord,newWord,nameOfFile;				
				
				System.out.println("Enter Name of file: ");
				nameOfFile = a.nextLine();
				
				System.out.println("Enter old word: ");				
				oldWord = a.nextLine();
				
				System.out.println("Enter new word: ");
			
				newWord = a.nextLine();
				
				
				updateRecord(nameOfFile,oldWord,newWord);
	        	
	            break;
	            
	        case 3:
	        	Scanner b = new Scanner(System.in);
				String filename;
				System.out.println("Enter name of file to be DELETED");
				filename = b.nextLine();
				deleteRecord(filename);
	        	break;
	        	
	        case 4 : 
	        	System.out.println("Enter name of file");
	        	Scanner c = new Scanner(System.in);
	        	String filepath = c.nextLine();
	        	seeRecord(filepath);
	        	
	      default:
	        		System.out.println("LOGGED OUT OF ADMIN");
	    }
		 Scanner abc = new Scanner(System.in);
		 System.out.println("1. Add a Record");
			System.out.println("2. Update a Record");
			System.out.println("3. Delete a Record");
			System.out.println("4. Print a Record");
			System.out.println("5. EXIT from ADMIN");
			userChoice = abc.nextInt();
			while(userChoice<=5)
			{
				choiceSelector(userChoice);
				
			}
	}
		 
		 
		 public void main() {
			System.out.println("1. Add a Record");
			System.out.println("2. Update a Record");
			System.out.println("3. Delete File");
			System.out.println("4. Print a Record");
			System.out.println("5. EXIT from ADMIN");
			Scanner abc = new Scanner(System.in);
			int userChoice = abc.nextInt();
			switch(userChoice)
			{
			case 1:
			choiceSelector(userChoice);
			break;
			case 2:
				choiceSelector(userChoice);
				break;
			case 3:
				choiceSelector(userChoice);
				break;
			case 4:
				choiceSelector(userChoice);
				break;
			case 5:
				choiceSelector(userChoice);
				break;
				}
		 
	}

}
