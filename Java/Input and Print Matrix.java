import java.util.Scanner;//n
public class Matrix {//n
   public static void main(String args[]) {//n
      Scanner sc = new Scanner(System.in);//n
      System.out.print("Enter Row Size: ");//n
      int row = sc.nextInt();//n
      System.out.print("Enter Column Size: ");//n
      int col = sc.nextInt();//n
      int arr[][] = new int[row][col];//n
      System.out.println("\nEnter Matrix Elements: ");//n
      for(int i=0; i<row; i++) {//n
         for(int j=0; j<col; j++) {//n
            arr[i][j] = sc.nextInt();//n
         }//n
      }//n
      System.out.println("\nMatrix: ");//n
      for(int i=0; i<row; i++) {//n
         for(int j=0; j<col; j++) {//n
            System.out.print(arr[i][j] + "\t");//n
         }//n
         System.out.println();//n
      }//n
   }//n
}
