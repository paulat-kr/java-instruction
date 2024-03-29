package ui;

import java.util.ArrayList;

import util.Console;

public class WizardInventoryApp {

	// could do this
	// private static List<String> items - new ArrayList<>();

	public static void main(String[] args) {

		System.out.println("The Wizard Inventory game");

		String cmd = "";

		ArrayList<String> items = new ArrayList<>();
		items.add("wooden staff");
		items.add("wizard hat");
		items.add("cloth shoes");

		while (!cmd.equalsIgnoreCase("exit")) {

			displayMenu();

			int itemNumber = 0;
			cmd = Console.getString("\nCommand: ");

			switch (cmd.toLowerCase()) { // in case user enters caps
			case "show":
				if (items.size() == 0) {
					System.out.println("No items to show");
				} else {
					showItems(items);
				}
				break;

			case "grab":
				if (items.size() == 4) {
					System.out.println("You can't carry any more items. " + "Drop something first");
				} else {
					String s = Console.getString("Name: ");
					items.add(s);
					System.out.println(s + " was added.");
				}
				break;

			case "edit":
				if (items.size() == 0) {
					System.out.println("No items to edit");
				} else {
					itemNumber = Console.getInt("Number: ", 0, (items.size() + 1));
					String updatedName = Console.getString("Updated name: ");
					items.set(itemNumber - 1, updatedName);
					System.out.println("Item number " + itemNumber + " was updated.");
				}
				break;

			case "drop":
				if (items.size() == 0) {
					System.out.println("No items to drop");
				} else {
					itemNumber = Console.getInt("Number: ", 0, (items.size() + 1));
					String str1 = items.remove(itemNumber - 1);
					System.out.println(str1 + " was dropped.");
				}
				break;
				
			case "exit":
				break;
				
			default:
				System.out.println("Invalid command; try again ");
				break;
			}
		}

		System.out.println("Bye!");
	}

	public static void displayMenu() {

		System.out.println("\nCOMMAND MENU");
		System.out.println("show - Show all items");
		System.out.println("grab - Grab an item");
		System.out.println("edit - Edit an item");
		System.out.println("drop - Drop an item");
		System.out.println("exit - Exit program");
	}

	public static void showItems(ArrayList<String> items) {

		for (int i = 0; i < items.size(); i++) {
			System.out.println((i + 1) + ". " + items.get(i));
		}
	}

}