
import java.util.Scanner;

import login.*;
import controllers.*;

public class Main {
	
	public void adminController(){
		
		Adminhandler adminhandler = new Adminhandler();
		adminhandler.main();
		 
	}
	
	public void userController() {
		Userhandler userhandler = new Userhandler();
		userhandler.main();
	}
	
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		Admin admin = new Admin();
		Main main = new Main();
		System.out.println("<---------------Welcome To AllTour--------------->\n");
			
		 System.out.println("1.Admin");
		 System.out.println("2.User");
		 int choice = in.nextInt();
		 switch(choice){
	        case 1:
	            admin.auth();
	            break;
	        case 2:
	           //User user = new User();
	            //user.auth();
	        	main.userController();
	            break;
	    }
		 if(admin.logedIn) {
			main.adminController();
		 }
	}
}
