package login;


import java.util.*;

public class Admin {
		java.io.Console console = System.console();
	    Scanner in = new Scanner(System.in);
	    public boolean logedIn = false;
	    public void auth() throws Exception {
	    //dummy username and password    
	    String adminUsername = "Admin";
	    String adminPassword = "Password";
	    System.out.println("<---------------Please Authenticate YourSelf--------------->\n");
	    System.out.println("Username: ");
	    String username = in.nextLine(); 
	    //System.out.println("Password: (You not able to see what you enter due to some security reasons)");
	   // String password = new String(console.readPassword("Password: "));
	    System.out.println("Password: ");
	    String password = in.nextLine(); 
	    /*System.out.println("Username " + username);
	    System.out.println("Password " + password);*/
	    
	    if(username.equals(adminUsername) && password.equals(adminPassword)){
	            logedIn = true;
	            return;
	        }
	    else{
	    	System.out.println("<---------------Try Again--------------->");
			auth();
		}	
	}
}
