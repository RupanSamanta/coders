import java.io.*;
import java.lang.*;
import java.util.Scanner;
class fascinating_number {
	public static void main(String args[]) {
		Scanner rs = new Scanner(System.in);
		int num, num2, num3, count = 0,
		numArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		String concatNum;
		boolean flag = true;
		System.out.print("Enter a Integer Number: ");
		num = rs.nextInt();
		num2 = num * 2;
		num3 = num * 3;
		concatNum = "" + num + num2 + num3;
		if (num > 99) {
			for (int i = 0; i < numArr.length; i++) {
				for (int j = 0; j < concatNum.length(); j++) {
					int temp = Integer.parseInt(String.valueOf(concatNum.charAt(j)));
					if (temp == numArr[i])
						count++;
				}
				if (count != 1) {
					flag = false;
					break;
				}
				count = 0;
			}
			System.out.println();
			if (flag)
				System.out.println(num + " is a Fascinating Number");
			else
				System.out.println(num + " is not a Fascinating Number");
		}
	   else
			System.out.println("Must be a 3-digit number");
		rs.close();
	}
}
