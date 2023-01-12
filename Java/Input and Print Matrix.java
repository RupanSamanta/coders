import java.util.Scanner;
public class Matrix {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Row Size: ");
      int row = sc.nextInt();
      System.out.print("Enter Column Size: ");
      int col = sc.nextInt();
      int arr[][] = new int[row][col];
      System.out.println("\nEnter Matrix Elements: ");
      for(int i=0; i<row; i++) {
         for(int j=0; j<col; j++) {
            arr[i][j] = sc.nextInt();
         }
      }
      System.out.println("\nMatrix: ");
      for(int i=0; i<row; i++) {
         for(int j=0; j<col; j++) {
            System.out.print(arr[i][j] + "\t");
         }
         System.out.println();
      }
   }
}