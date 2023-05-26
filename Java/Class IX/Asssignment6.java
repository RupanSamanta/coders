package CLASS_IX;
import java.util.Scanner;
class  Asssignment6 {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input: ");
    System.out.println("Enter 1 for 1st Series");
    System.out.println("Enter 2 for 2nd Series");
    System.out.println("Enter 3 for 3rd Series");
    System.out.print("Enter your choice : ");
    int choice = sc.nextInt();
    int n;
    switch(choice) {
      case 1:
        System.out.print("Enter the value of 'n' : ");
        n = sc.nextInt();
        double sum1 = 0.0;
        for(int i = 1; i <= n; i++) {
          int add = 0;
          float product = 1;
          for(int j = 1; j <= i; j++) {
            add = add + j;
            product = product * j;
          }
          sum1 = sum1 + (add / product);
        }
        System.out.println("Output : ");
        System.out.print("Sum = " + sum1);
        break;
      case 2: 
        System.out.print("Enter the value of 'a' : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of 'n' : ");
        n = sc.nextInt();
        double sum2 = 0.0;
        for(int i = 1; i <= n; i++) {
          double power = Math.pow(a, i);
          sum2 = sum2 + (i / power);
        }
        System.out.println("Output : ");
        System.out.print("Sum = " + sum2);
        break;
      case 3:
        System.out.print("Enter the value of 'n' : ");
        n = sc.nextInt();
        int sum3 = 0;
        for(int i = 1; i <= n; i++) {
          int counter = 1;
          int temp = 0;
          for(int j = 1; j <= i; j++) {
            temp = temp + counter;
            counter = counter + 2;
          }
          sum3 = sum3 + temp;
        }
        System.out.println("Output : ");
        System.out.print("Sum = " + sum3);
        break;
      default:
        System.out.println("Invalid Choice!");
    }
    System.out.println("\n");
  }
}