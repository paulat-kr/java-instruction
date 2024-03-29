package util;

import java.util.Scanner;

public class Console {

	private static Scanner sc = new Scanner(System.in);
	
	// getStrin should not allow an empty string
	public static String getString(String prompt) {
	
		boolean isValid = false;
		String s = null;
	
		while(! isValid) {
			System.out.print(prompt);	
  			
			s = sc.nextLine();		
		//	sc.nextLine();   	// discard any other data entered on the line

		//	if (s.equalsIgnoreCase("")) {
			if (s != null && s.equals("")) {
     			System.out.println("Error! This entry is required. Try again.");
 			} else {
				isValid = true;
			}
		}
		return s;
	}
	
	public static String getString(String prompt, String choice1, String choice2) {
		
		boolean isValid = false;
		String s = null;
		System.out.print(prompt);
		
		while (!isValid) {
			s = sc.next();		// read user entry
			sc.nextLine();   	// discard any other data entered on the line
						
		//	if (s.equalsIgnoreCase("")) {
			if (s != null && s.equalsIgnoreCase(""))  {
     			System.out.println("Error! This entry is required. Try again.");
			 } else if ( ! s.equalsIgnoreCase(choice1) && ! s.equalsIgnoreCase(choice2)) {
				System.out.println("Error! Entry must be '" + choice1 +
						"' or '" + choice2 + "'. Try again.");
			} else {
				isValid = true;
			}
		}	
		return s;
	}
	
    public static int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }
    
    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }
    
    public static double getDouble(String prompt) {
        double d = 0.0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(String prompt, double min, double max) {
        double d = 0.0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
            if (d <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (d >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
    }
    
    public static void println() {
    	System.out.println();
    }
    
 
}
