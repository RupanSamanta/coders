import java.io.*;
import java.lang.*;
import java.util.Scanner;
class movie_ticket_reservation_system{

    public static void main(String[] args) {
        String movieList[] = {
                "Jurassic World", "Intestellar", "Titanic", "Avengers : End Game",
                "Spider-Man", "The Martian", "Pirates of the Caribbean"
            },
        theaterNames[] = {
                "Inox", "Cinepolis", "Star Theater", "Cinemax"
            },
        time[] = {
                "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM",
                "2:30 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM",
                "6:30 PM", "7:00 PM", "8:00 PM", "9:00 PM", "10:00 PM"
            }, head = "Sl. No.    Movie Name", date = "";
        int movieSlNo = 1, theaterSlNo = 1, tickets = 1, inpTime;
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

        System.out.print("\n\nEnter Date (dd/mm/yyyy) : ");
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
        int rand = random(5, 1);
        String finalTime[] = new String[rand];
        for (int i = 0; i < rand; i++)
            finalTime[i] = time[random(time.length-1, rand)];
        for (int i = 1; i < finalTime.length; i++) {
            if(finalTime[i].compareTo(finalTime[i-1]) < 0){
                String temp = finalTime[i];
                finalTime[i] = finalTime[i-1];
                finalTime[i-1] = temp;
            }
        }
        for (int i = 0; i < finalTime.length; i++)
            System.out.println((i+1) + ") " + finalTime[i] + "\t");
        System.out.print("\nChoose a Movie Time from above : ");
        inpTime = rs.nextInt();
        System.out.print("\n\nEnter number of tickets to be purchased : ");
        tickets = rs.nextInt();

        System.out.println("\n\nMovie Name : " + movieList[movieSlNo-1]);
        System.out.println("Theater Name : " + theaterNames[theaterSlNo-1]);
        System.out.println("Date : " + date);
        System.out.println("Time : " + finalTime[inpTime-1]);
        System.out.println("Total Tickets : " + tickets);
        System.out.println("Total Amount : Rs. " + (tickets*100));
    }

    public static int random(int max, int min) {
        return (int)(Math.random() * (max - min + 1) + min);
    }
}
