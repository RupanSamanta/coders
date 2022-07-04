import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class matrixAddition
{
	public static void main(String[] args)
	{
		int m, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size : ");
	    m = sc.nextInt();
        System.out.print("Enter column size : ");
		n = sc.nextInt();
		int arr1[][] = new int[m][n], arr2[][] = new int[m][n];
		System.out.println("\nEnter 1st Matrix values : ");
		for(int i=0; i<m; i++)
		{
		    for(int j=0; j<n; j++)
		    {
		        arr1[i][j] = sc.nextInt();
		    }
		}
		System.out.println("\nEnter 2nd Matrix values : ");
		for(int i=0; i<m; i++)
		{
		    for(int j=0; j<n; j++)
		    {
		        arr2[i][j] = sc.nextInt();
		    }
		}
		System.out.println("\nMatrix 1 :");
		for(int i=0; i<m; i++)
		{
		    for(int j=0; j<n; j++)
		    {
		        System.out.print(arr1[i][j]+"\t");
		    }
		    System.out.println();
		}
		System.out.println("\nMatrix 2 :");
		for(int i=0; i<m; i++)
		{
		    for(int j=0; j<n; j++)
		    {
		        System.out.print(arr2[i][j]+"\t");
		    }
		    System.out.println();
		}
		System.out.println("\nSum :");
		for(int i=0; i<m; i++)
		{
		    for(int j=0; j<n; j++)
		    {
		        System.out.print(arr1[i][j]+arr2[i][j]+"\t");
		    }
		    System.out.println();
		}
	}
}
