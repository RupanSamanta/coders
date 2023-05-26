import java.util.Scanner;
class Assignment9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:");
		System.out.println("Enter 1 for Floyd's Triangle");
		System.out.println("Enter 2 for Binary Triangle");
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		System.out.print("Enter Height of Triangle : ");
		int height = sc.nextInt();
		System.out.println("Output: ");
		switch (choice) {
		case 1:
			int n = 1;
			System.out.println("The Floyd's Triangle : ");
			for (int i = 1; i <= height; i++) {
				for (int j = 1; j <= i; j++) {
			  	System.out.print(n + "  ");
			  	n = n + 1;
				}
				System.out.println();
			}
			break;
		case 2:
		   int b;
			System.out.println("Binary Triangle : ");
		   for (int i = 1; i <= height; i++) {
		   	b = i;
		   	for (int j = 1; j <= i; j++) {
					System.out.print(b % 2 + "  ");
					b = b + 1;
		   	}
		   	System.out.println();
			}
			break;
		default:
			System.out.println("Invalid Choice!");
		}
	}
}