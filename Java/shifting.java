import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	    int arr1[] = new int[10],
	        arr2[] = new int[10];
        Scanner rs = new Scanner(System.in);
        System.out.println("Enter Matrix Values : ");
        for(int i=0; i<10; i++){
            arr1[i] = rs.nextInt();
            if(i != 9)
                arr2[i+1] = arr1[i];
        }
        arr2[0] = arr1[9];
        System.out.println("Matrix after Shifting : ");
        for(int i=0; i<10; i++)
            System.out.print(arr2[i]+"\t");
	}
}
