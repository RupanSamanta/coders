package CLASS_IX;
import java.util.Scanner;
class Assignment8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Menu:");
        System.out.println("1. Fibonacci Series");
        System.out.println("2. Pell Series");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
            System.out.print("Enter the value of n: ");
            int n1 = sc.nextInt();
            int a = 0;
            int b = 1;
            int sum1 = 0;
            System.out.println("Output:");
            System.out.println("The Fibonacci Series upto term no " + n1 + ":");
            if(n1 == 0){
                System.out.println(a);
            }
            else if(n1 == 1){
                System.out.println(b);
            }
            else {
                System.out.print(a + "," + b);
                for(int i = 2; i < n1; i++) {
                    sum1 = a + b;
                    System.out.print("," + sum1);
                    a = b;
                    b = sum1;
                }
            }
            break;
            case 2:
            System.out.print("Enter the value of n: ");
            int n2 = sc.nextInt();
            int x = 1;
            int y = 2;
            int sum2 = 0;
            System.out.println("Output:");
            System.out.println("The Pell Series upto term no " + n2 + ":");
            if(n2 == 0){
                System.out.println(x);
            }
            else if(n2 == 1){
                System.out.println(y);
            }
            else {
                System.out.print(x + "," + y);
                for(int i = 2; i < n2; i++) {
                    sum2 = x + y * 2;
                    System.out.print("," + sum2);
                    x = y;
                    y = sum2;
                }
            }
            break;
            default:
            System.out.println("Invalid Choice!");
        }
    }
}