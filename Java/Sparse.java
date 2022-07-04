import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Sparse
{
	public static void main(String[] args)
	{
		int m, n, z=0, nz=0;
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
		for(int i=0; i<m; i++)
		{
		    for(int j=0; j<n; j++)
		    {
		        if(arr[i][j] == 0)
		            z++;
		        else 
		            nz++;
		    }
		}
		if(z>nz)
		    System.out.println("\nSparse Matrix");
		else
            System.out.println("\nNot a Sparse Matrix");
	}
}
