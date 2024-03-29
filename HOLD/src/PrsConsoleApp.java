

import java.util.ArrayList;
import java.util.List;

import business.Product;
import business.User;
import util.Console;

public class PrsConsoleApp {

	public static void main(String[] args) {

		int menuOpt = 0;
		System.out.println("Welcome to the PRS Console!");
		
		List<User> users = new ArrayList<>();
		
		// Start with 3 users
		User u1 = new User(1, "ab12345", "pword1", "Amy", "Benson", "513-555-1111", "amy.baker@gmail.com", false, false);
		User u2 = new User(2, "cd67890", "pword2", "Chris", "Daniels", "513-555-2222", "chris.daniels@gmail.com", true, true);
		User u3 = new User(3, "ef12345", "pword3", "Erica", "French", "513-555-333", "erica.french@mail.com", false, true);

		users.add(u1);
		users.add(u2);
		users.add(u3);
				
		while (menuOpt != 6) {
			displayMenu();
			menuOpt = Console.getInt("\nCommand: ", 0, 7);
			int userIndex = 0;
			
			switch (menuOpt) { 
			case 1:		// list users
				if (users.size() == 0) {
					System.out.println("No users available.");
				} else {
					listUsers(users);
				}
				
				break;

			case 2:  	// get a user
				if (users.size() == 0) {
					System.out.println("No users available.");
				} else {
					String s = Console.getString("User Name: ");
					userIndex = getUserNameIndex(s, users);
					if (userIndex == -1) {
						System.out.println("User not found");
					} else {
						System.out.println(users.get(userIndex));
					}
				}
				break;

			case 3:		// add a user
				addNewUser(users);
				break;

			case 4:		// edit a user
				if (users.size() == 0) {
					System.out.println("No users available.");
				} else {
					String s = Console.getString("User Name: ");
					userIndex = getUserNameIndex(s, users);
					
					if (userIndex == -1) {
						System.out.println("User not found");
					} else {
						// UPDATE CODE HERE!!!!!!!!!!!!!!!!!!!!
						System.out.println("DO UPDATE HERE");
					}

				}
				break;
				
			case 5:		// delete a user
				if (users.size() == 0) {
					System.out.println("No users available.");
				} else {
					String s = Console.getString("User Name: ");
					userIndex = getUserNameIndex(s, users);
					
					if (userIndex == -1) {
						System.out.println("User not found");
					} else {
						String userId = users.get(userIndex).getUserName();
						boolean success = users.remove(users.get(userIndex));
						if (success) {
							System.out.println("User " + userId + " deleted successfully");
						}
					}
				}	
				break;
			
			case 6:
				break;
				
			default:
				System.out.println("Invalid selection; try again ");
				break;
			}
		}

		System.out.println("Bye!");
			
	}
	
	public static void displayMenu() {

		System.out.println("\nCOMMAND MENU");
		System.out.println(  "------------");
		System.out.println("1 - List Users");
		System.out.println("2 - Get a User");
		System.out.println("3 - Add a User");
		System.out.println("4 - Edit a User");
		System.out.println("5 - Delete a User");
		System.out.println("6 - Exit");
	}
	
	public static void listUsers(List<User> users) {
		System.out.println("\nUser Name  Name                 Phone        Email Address");
		System.out.println(  "---------- -------------------- ------------ " +
		    "-------------------");
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i));
		}
	}
	
	public static void addNewUser(List<User> users) {
		
		String userName = Console.getString("User Name      : ");
		int userIndex = getUserNameIndex(userName, users);
		if (userIndex == -1) {
			boolean isReviewer;
			boolean isAdmin;
			
			int id             = Console.getInt(   "ID             : ");
			String password    = Console.getString("Password       : ");
			String firstName   = Console.getString("First Name     : ");
			String lastName    = Console.getString("Last Name      : ");
			String phoneNumber = Console.getString("Phone Number   : ");
			String email       = Console.getString("Email          : ");
			
			String reviewer    = Console.getString("Reviewer? (y/n): ", "y", "n");
			if (reviewer.equalsIgnoreCase("y")) {
				isReviewer     = true;
			} else {
				isReviewer     = false;
			}
			
			String admin       = Console.getString("Admin?    (y/n): ", "y", "n");
			if (admin.equalsIgnoreCase("y")) {
				isAdmin = true;
			} else {
				isAdmin = false;
			}
			
			User u1 = new User(id, userName, password, firstName, lastName, 
					phoneNumber, email, isReviewer, isAdmin);
			users.add(u1);
			System.out.println("\nUser " + userName + " added.");
			
		} else {
			System.out.println("User name already exists.");
		}
	}
	
	
	public static int getUserNameIndex(String s, List<User> users) {
		boolean userFound = false;
		int index = 0;

		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUserName().equalsIgnoreCase(s) ) {
	
				userFound = true;
				index = i;
			}
		}
		if (! userFound) {
			index = -1;
		}
		return index;
	}	
}
