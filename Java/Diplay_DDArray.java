import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Array1
{
	public static void main(String[] args)
	{
		int m, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size : ");
	    m = sc.nextInt();
        System.out.print("Enter column size : ");
		n = sc.nextInt();
		int arr[][] = new int[m][n];
		System.out.println("\nEnter Matrix values : ");
		for(int i=0; i<m; i++)
		{
		    for(int j=0; j<n; j++)
		    {
		        arr[i][j] = sc.nextInt();
		    }
		}
		System.out.println("\nMatrix : ");
		for(int i=0; i<m; i++)
		{
		    for(int j=0; j<n; j++)
		    {
		        System.out.print(arr[i][j]+"\t");
		    }
		    System.out.println();
		}
	}
}
