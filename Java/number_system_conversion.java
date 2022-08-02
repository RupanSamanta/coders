import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class number_system_conversion {
	public static void main(String[] args) {
		Scanner rs = new Scanner(System.in);
		String list[] = {
		    "Decimal to Binary",
		    "Binary to Decimal"
		};
		char c = 'a';
		System.out.println("NUMBER SYSTEM CONVERSION MENU");
		for(int i=0; i<list.length; i++)
		    System.out.println(c+++") "+list[i]);
		System.out.print("\nEnter Your Choice : ");
		c = rs.next().charAt(0);
		System.out.println();
		switch(c){
		    case 'a':
		        System.out.print("Enter a Decimal Number : ");
		        long db = rs.nextLong();
		        System.out.println("Binary Equivalent : ("+decimalToBinary(db)+")\u2082");
		    break;
		    case 'b':
		        System.out.print("Enter a Binary Number : ");
		        long bd = rs.nextLong();
		        System.out.print("Decimal Equivalent : ("+binaryToDecimal(bd)+")\u2081\u2080");
		    break;
		}
		rs.close();
	}
	static String decimalToBinary(long d){
	    String r = "", n = "";
	    while(d != 0){
	        r += d%2;
	        d /= 2;
	    }
	    for(int i=r.length()-1; i>=0; i--)
	        n += r.charAt(i);
	    return n;
	}
	static long binaryToDecimal(long b){
	    String d = String.valueOf(b);
	    long n = 0;
	    for(int i=0, j=d.length()-1; i<d.length(); i++, j--){
	        int f = Integer.parseInt(String.valueOf(d.charAt(i)));
	        n += (long)(f * Math.pow(2, j));
	    }
	    return n;
	}
}
