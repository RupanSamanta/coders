import java.io.*;

import java.lang.*;

import java.util.Scanner;

class transpose {

  public static void main(String[] args) {

    Scanner rs = new Scanner(System.in);

    System.out.print("Enter the Size of Matrix (mxm) : ");

    int m = rs. nextInt(),

        arr1[][] = new int[m][m],

        arr2[][] = new int[m][m];

        

    System.out.println("\nEnter Matrix Elements :");

    for(int i=0; i<m; i++)

      for(int j=0; j<m; j++)

        arr1[i][j] = rs.nextInt();

        

    System.out.println("\nMatrix before Transpose :");

    for(int i=0; i<m; i++){

      for(int j=0; j<m; j++)

        System.out.print(arr1[i][j]+"\t");

      System.out.println();

    }

    

    for(int i=0; i<m; i++)

      for(int j=0; j<m; j++)

        arr2[i][j] = arr1[j][i];

      

    System.out.println("\nMatrix after Transpose :");

    for(int i=0; i<m; i++){

      for(int j=0; j<m; j++)

        System.out.print(arr2[i][j]+"\t");

      System.out.println();

    }

    

  }

}
