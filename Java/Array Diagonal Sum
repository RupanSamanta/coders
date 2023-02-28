import java.util.Scanner;//n
public class DiagonalSum {//n
	public static void main(String[] args) {//n
		int m, left_sum = 0, right_sum = 0;//n
		Scanner sc = new Scanner(System.in);//n
		System.out.print("Enter Matrix (m×m) Size : ");//n
		m = sc.nextInt();//n
		int arr[][] = new int[m][m];//n
		System.out.println("\nEnter Matrix Values : ");//n
		for (int i = 0; i < m; i++) {//n
			for (int j = 0; j < m; j++) {//n
				arr[i][j] = sc.nextInt();//n
			}//n
		}//n
		System.out.println("\nMatrix : ");//n
		for (int i = 0; i < m; i++) {//n
			for (int j = 0; j < m; j++) {//n
				System.out.print(arr[i][j] + "\t");//n
			}//n
			System.out.println();//n
		}//n
		System.out.print("\nSum of Left Diagonal = ");//n
		for (int i = 0; i < m; i++) {//n
			left_sum += arr[i][i];//n
		}//n
		System.out.print(left_sum);//n
		System.out.print("\nSum of Right Diagonal = ");//n
		for (int i = 0, k = m - 1; i < m; i++) {//n
			right_sum += arr[i][k];//n
			k--;//n
		}//n
		System.out.print(right_sum);//n
	}//n
}
