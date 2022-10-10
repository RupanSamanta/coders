import java.io.*;
import java.lang.*;
import java.util.*;
public class flight_reservation {
	public static void main(String args[]) {
		int fly_from = 0, fly_to = 0, choose_class = 0, tickets = 0, cost = 0, date = 0;
		String flight_from = "", flight_to = "", flight_class = "", flight_date = "", name = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("FLIGHT TICKET RESERVATION SYSTEM\n");
		
		System.out.print("\n\nEnter Full Name: ");
      name = sc.nextLine();

		String airports[] = {"Kolkata - Netaji Subhash Chandra Bose International Airport",
							 "New Delhi - Indira Gandhi International Airport",
							 "Mumbai - Chhatrapati Shivaji Maharaj International Airport",
							 "Chennai - Chennai International Airport",
							 "Bengaluru - Bangalore International Airport",
							 "Hyderabad - Rajiv Gandhi International Airport",
							 "Jaipur - Jaipur International Airport",
							 "Port Blair - Veer Savarkar International Airport",
							 "Gangtok - Pakyong Airport",
							 "Ranchi - Birsa Munda Airport"
		},
		classes[] = {
		   "First", "Business", "Economy"
		},
		dates[] = {
		   "17/10/2022", "18/10/2022", "19/10/2022", "20/10/2022", "21/10/2022", "22/10/2022", "23/10/2022"
		};
		System.out.println("\nCities & Airports\n");
		for (int i = 0; i < airports.length; i++)
			System.out.println((i+1)+". "+airports[i]);
		System.out.println("\nEnter Serial Number to Choose");
		System.out.print("\nEnter Flight from : ");
		fly_from = sc.nextInt();
		for(;;)
			if (fly_from < 1 || fly_from > 10) {
				System.out.print("\nInvalid Option!!\nChoose a Valid Option : ");
				fly_from = sc.nextInt();
			} else
				break;
		
		flight_from = airports[fly_from-1];
		System.out.print("\nEnter Flight to : ");
		fly_to = sc.nextInt();
		while ((fly_to < 1 || fly_to > 10) || fly_to == fly_from) {
			if (fly_to == fly_from) {
				System.out.print("\nDestination must be Different!!\nChoose a Different Destination : ");
				fly_to = sc.nextInt();
			} else if (fly_to < 1 || fly_to > 10) {
				System.out.print("\nInvalid Option!!\nChoose a Valid Option : ");
				fly_to = sc.nextInt();
			} else
				break;
		}
		flight_to = airports[fly_to-1];
		
		System.out.println("\n\nDate");
		for (int i=0; i<dates.length; i++)
		   System.out.println((i+1)+". "+dates[i]);
		System.out.print("\nChoose a Date: ");
		date = sc.nextInt();
		for(;;)
			if (date < 1 || date > 5) {
				System.out.print("\nInvalid Option!!\nChoose a Valid Option : ");
				date = sc.nextInt();
			} 
			else
				break;
		flight_date = dates[date];
		
		System.out.println("\n\nClass\n");
		for(int i=0; i<classes.length; i++)
		   System.out.println((i+1)+". "+classes[i]+" class");
		System.out.print("\nChoose a Class: ");      choose_class = sc.nextInt();
		for(;;)
		   if(choose_class < 1 || choose_class > classes.length){
		      System.out.print("\nInvalid!! Choose a valid option: ");
		      choose_class = sc.nextInt();
		   }
		   else
            break;
      flight_class = classes[choose_class-1];
      
      System.out.print("\n\nTotal Tickets: ");
      tickets = sc.nextInt();
      
      if (tickets > 1)
         System.out.println("\n\nTickets Booked!!!\n");
      else 
         System.out.println("\n\nTicket Booked!!!\n");
      System.out.println("Name: "+name);
      System.out.println("From: "+flight_from);
      System.out.println("Destination: "+flight_to);
      System.out.println("Date: "+flight_date);
      System.out.println("Class: "+flight_class);
      System.out.println("Seat Number: "+((int) (Math.random()*(20-1) +1)));
      if (flight_class == "First")
         cost = tickets*12000;
      else if (flight_class == "Business")
         cost = tickets*10000;
      else cost = tickets*8000;
      System.out.println("Total Costs: Rs. "+cost);
      sc.close();
	}
}
