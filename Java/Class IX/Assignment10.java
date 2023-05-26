import java.util.Scanner;
class Assignment10 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: N = ");
		int N = sc.nextInt();
		if (N > 2 && N < 100) {
			int bin = 0;
			int power = 0;
			while (N != 0) {
				int rem = N % 2;
				bin = bin + rem * (int) Math.pow(10, power);
				power = power + 1;
				N = N / 2;
			}
			System.out.println("BINARY EQUIVALENT: " + bin);
			int count = 0;
			while (bin != 0) {
				if (bin % 10 == 1) {
					count = count + 1;
				}
				bin = bin / 10;
			}
			System.out.println("NUMBER OF 1's: " + count);
			if (count % 2 == 0) {
				System.out.println("OUTPUT: EVIL NUMBER");
			}
			else {
				System.out.println("OUTPUT: NOT AN EVIL NUMBER");
			}
		}
		else {
			System.out.println("OUTPUT: NUMBER OUT OF RANGE");
		}
	}
}