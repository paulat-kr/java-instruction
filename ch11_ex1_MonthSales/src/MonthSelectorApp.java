import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays

        String[] monthName = {"Jaunary", "February", "March", "April", "May", "June",
        		"July", "August", "September", "October", "November", "December"};
        Double[] monthSales = {1000.00, 2000.00, 3000.00, 4000.00, 5000.00, 6000.00, 
        		7000.00, 8000.00, 9000.00, 10000.00, 11000.00, 12000.00};

        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthName.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            // get the index number for the month
            // and display the month name and sales            

            monthNumber -- ;
            System.out.println("Sales for " + monthName[monthNumber] + " = " + 
            		currency.format(monthSales[monthNumber]) );
            
            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        // display the total sales for the year
        
        double sum = 0;
        for (int i = 0; i < 12; i++) {
        	sum += monthSales[i];
        }
        System.out.println("Total Sales: " + currency.format(sum) );
        
        sum = 0;
		for (double d1: monthSales) {
			sum += d1;
		}
		System.out.println("Total Sales: " + currency.format(sum) );
        
        
        
        
        Console.displayLine();
    }    

}
