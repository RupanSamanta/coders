import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner rs = new Scanner (System.in);
		int m, n;
		System.out.print("Enter row size : ");
	    m = rs.nextInt();
        System.out.print("Enter column size : ");
		n = rs.nextInt();
		int arr[][] = new int[m][n];
		System.out.println("\nEnter Matrix values : ");
		for(int i=0; i<m; i++)
		    for(int j=0; j<n; j++)
		        arr[i][j] = rs.nextInt();
		int xarr[][] = new int[m][n];
		System.out.println("\nMatrix : ");
		for(int i=0; i<m; i++){
		    for(int j=0; j<n; j++)
		    {
		        System.out.print(arr[i][j]+"\t");
		        xarr[i][j] = arr[i][j];
		    }
		    System.out.println();
		}
		for(int i=0; i<m; i++) {
		    for(int j=0; j<n; j++) {
		        for(int k=0; k<n; k++)
		        if(xarr[i][j] > xarr[i][k]) {
		            int temp = xarr[i][k];
		            xarr[i][k] = xarr[i][j];
		            xarr[i][j] = temp;
		        }
		    }
		    System.out.println("\nMax of "+(i+1)+" row = "+xarr[i][0]);
		    System.out.println("Min of "+(i+1)+" row = "+xarr[i][n-1]);
		}
		for(int i=0; i<n; i++) {
		    for(int j=0; j<m; j++) {
		        for(int k=0; k<m; k++)
		            if(arr[j][i] > arr[k][i]) {
		                int temp = arr[k][i];
		                arr[k][i] = arr[j][i];
		                arr[j][i] = temp;
		        }
		    }
		    System.out.println("\nMax of "+(i+1)+" column = "+arr[0][i]);
		    System.out.println("Min of "+(i+1)+" column = "+arr[m-1][i]);
		}
	}
}
