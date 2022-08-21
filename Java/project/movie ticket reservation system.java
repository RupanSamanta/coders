import java.io.*;
import java.lang.*;
import java.util.Scanner;
class movie_ticket_reservation_system{
    public static Scanner rs = new Scanner (System.in);
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
        movieSlNo = handleException(movieList.length);
        System.out.print("\n\nEnter Date (dd/mm/yyyy) : ");
        date = dateException();
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
        theaterSlNo = handleException(theaterNames.length);

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
        inpTime = handleException(finalTime.length);
        System.out.print("\n\nEnter number of tickets to be purchased : ");
        tickets = rs.nextInt();
        while(tickets < 1){
            if(tickets == 0)
                System.out.print("Need to purchase a Ticket\nEnter number of tickets to be purchased ");
            else if(tickets < 0)
                System.out.print("Quantity cannot be negative\nEnter number of tickets to be purchased");
            tickets = rs.nextInt();
        }
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
    public static int handleException(int range){
        int input = rs.nextInt();
        while(input > range || input < 1){
            System.out.print("\nInvalid Option!\nEnter a Valid Serial Number : ");
            input = rs.nextInt();
        }
        return input;
    }
    public static String dateException (){
        String date = rs.next();
        for(;;){
            if(date.length()>=8 && date.length()<=10){
                int c=0;
                for(int i=0; i<date.length(); i++)
                    if(date.charAt(i) == '/')
                        c++;
                if(c==2){
                    int d = Integer.parseInt(date.substring(0, date.indexOf('/'))),
                    m = Integer.parseInt(date.substring(date.indexOf('/')+1, date.lastIndexOf('/'))),
                    y = Integer.parseInt(date.substring(date.lastIndexOf('/')+1, date.length()));
                    if((((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&(d<32&&d>0)) || ((m==4||m==6||m==9||m==11 && (d<31&&d>0))) || (m==2 && d<29)) && (m>0 || m<13) && y==2022){
                 date = (d<10?"0"+d:d)+"/"+(m<10?"0"+m:m)+"/"+y;
                 break;
                }
                else{
                        System.out.print("Invalid Date Format\nEnter Date (dd/mm/yyyy) : ");
                        date = rs.next();
                    }
                }
                else{
                    System.out.print("\nInvalid Date Format\nEnter Date (dd/mm/yyyy) : ");
                    date = rs.next();
                }
            }
            else{
                System.out.print("\nInvalid Date Format\nEnter Date (dd/mm/yyyy) : ");
                date = rs.next();
            }
        }
        return date;
    }
}
