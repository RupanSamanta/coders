import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class dd_array_sum
{
	public static void main(String[] args)
	{
		int m, n, ld=0, rd=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Matrix (m×m) size : ");
	    m = sc.nextInt();
	    int arr[][] = new int[m][m];
        System.out.println("\nEnter Matrix values : ");
		for(int i=0; i<m; i++)
		{
		    for(int j=0; j<m; j++)
		    {
		        arr[i][j] = sc.nextInt();
		    }
		}
		System.out.println("\nMatrix : ");
		for(int i=0; i<m; i++)
		{
		    for(int j=0; j<m; j++)
		    {
		        System.out.print(arr[i][j]+"\t");
		    }
		    System.out.println();
		}
		System.out.print("\nSum of Left Diagonal = ");
		for(int i=0; i<m; i++)
		{
		    ld += arr[i][i];
		}
		System.out.print(ld);
		System.out.print("\nSum of Right Diagonal = ");
		for(int i=0, k=m-1; i<m; i++)
		{
		    rd += arr[i][k];
		    k--;
		}
		System.out.print(rd);
	}
}
