
import java.util.Scanner;
class Assignment7 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("User Menu:");
    System.out.println("1. Special Number");
    System.out.println("2. Harshad Number");
    System.out.print("Enter your choice : ");
    int choice = sc.nextInt();
    switch(choice) {
      case 1:
        System.out.print("Input: ");
        int num1 = sc.nextInt();
        int temp1 = num1;
        int sum1 = 0;
        while(temp1 != 0) {
          int rem = temp1 % 10;
          int fac = 1;
          for(int i=1; i<=rem; i++) {
            fac = fac * i;
          }
          sum1 = sum1 + fac;
          temp1 = temp1 / 10;
        }
        System.out.print("Output: ");
        if(sum1 == num1) {
          System.out.println(num1 + " is a Special Number");
        }
        else {          
          System.out.println(num1 + " is not a Special Number");
        }
      break;
      case 2:
        System.out.print("Input: ");
        int num2 = sc.nextInt();
        int temp2 = num2;
        int sum2 = 0;
        while(temp2 != 0) {
          int rem = temp2 % 10;
          sum2 = sum2 + rem;
          temp2 = temp2 / 10;
        }
        System.out.print("Output: ");
        if(num2 % sum2 == 0) {
          System.out.println(num2 + " is a Harshad Number");
        }
        else {          
          System.out.println(num2 + " is not a Harshad Number");
        }
      break;
      default:
        System.out.println("Invalid Choice!");
    }
  }
}
