import java.io.*;
import java.lang.*;
import java.util.Scanner;
class movie_ticket_reservation_system{
    
    public static String movieList[] = {
        "Jurassic World", "Intestellar", "Titanic", "Avengers : End Game"
    },
    theaterNames[] = {
        "Inox", "Cinepolis", "Star Theater", "Cinemax"
    },
    time[] = {
        "11:00", "12:00", "12:30", "1:00", "1:30", "2:00", "2:30", "3:30",
        "4:00", "4:30", "5:00", "5:30", "6:00", "6:30", "7:00", "8:00",
        "9:00", "10:00"
    },
    head = "Sl. No.    Movie Name", date = "", inpTime= "";
    public static int movieSlNo = 1, theaterSlNo = 1, tickets = 1;

    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);

        System.out.println("MOVIE TICKET RESERVATION SYSTEM\n");
        System.out.println("\nList of Movies:- \n\n" + head);

        for (int i = 0; i < movieList.length; i++){
            System.out.print(i+1);
            for (int j = 0; i < head.length(); j++)
                if(head.indexOf('M')-1 == j){
                    System.out.println(movieList[i]);
                    break;
                }
                else System.out.print(" ");
        }

        System.out.print("\nEnter Serial Number to Choose a Movie : ");
        movieSlNo = rs.nextInt();

        System.out.print("\nEnter Date (dd/mm/yyyy) : ");
        date = rs.next();

        head = "Sl. No.         Theater";
        System.out.println("\n\nList of Movie Theaters\n\n" + head);
        for (int i = 0; i < theaterNames.length; i++){
            System.out.print(i+1);
            for (int j = 0; j < head.length(); j++)
                if(head.indexOf('T')-1 == j){
                    System.out.print(theaterNames[i]);
                    break;
                }
                else System.out.print(" ");
            System.out.println();
        }

        System.out.print("\nEnter Serial Number to Choose a Theater : ");
        theaterSlNo = rs.nextInt();

        System.out.println("\n\nMovie Time at " + theaterNames[theaterSlNo]);
        for (int i = 0, rand = random(5, 1); i < rand; i++)
            System.out.print(time[random(time.length-1, 1)] + "\t");
        System.out.print("\nChoose a Movie Time from above : ");
        inpTime = rs.next();
        System.out.println("\n\nEnter number of tickets to be purchased : ");
        tickets = rs.nextInt();
        receipt();
    }
    public static int random(int max, int min) {
        return (int)(Math.random() * (max - min + 1) + min);
    }
    public static void receipt(){
        System.out.println("\n\nMovie Name : " + movieList[movieSlNo-1]);
        System.out.println("Theater Name : " + theaterNames[theaterSlNo-1]);
        System.out.println("Date : " + date);
        System.out.println("Time : " + inpTime);
        System.out.println("Total Tickets : " + tickets);
        System.out.println("Total Cost : \u20B9" + (tickets*120));
    }
}
