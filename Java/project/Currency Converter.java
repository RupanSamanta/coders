import java.io.*;
import java.lang.*;
import java.util.*;
public class Currency_Converter {
	public static void main(String[] args) {
		double inr, usd, jye, rsb, bre, egp, cnd, asd, sad, pnd;
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("...... Currency Converter ......\n");
		System.out.println("1) Indian Rupee\n2) U. S. Dollar\n3) Japanese Yen\n4) Russian Ruble\n5) Brazilian Real\n6) Egyptian Pound\n7) Canadian Dollar\n8) Autralian Dollar\n9) South African Yand\n10) U. K. Pound Sterling");
		System.out.print("\nEnter your Choice : ");
		choice = sc.nextInt();
		System.out.println();
		switch (choice) {
		case 1:
			System.out.print("Enter amount in Indian Rupee : ");
			inr = sc.nextDouble();
			usd = inr * 0.013;
			System.out.println("\nU. S. Dollar : " + usd);
			jye = inr * 1.71;
			System.out.println("Japanese Yen : " + jye);
			rsb = inr * 0.75;
			System.out.println("Russian Ruble : " + rsb);
			bre = inr * 0.064;
			System.out.println("Brazilian Real : " + bre);
			egp = inr * 0.24;
			System.out.println("Egyptian Pound : " + egp);
			cnd = inr * 0.016;
			System.out.println("Canadian Dollar : " + cnd);
			asd = inr * 0.018;
			System.out.println("Australian Dollar : " + asd);
			sad = inr * 0.21;
			System.out.println("South African Yand : " + sad);
			pnd = inr * 0.011;
			System.out.println("U. K. Pound Sterling : " + pnd);
			break;
		case 2:
			System.out.print("Enter amount in U. S. Dollar : ");
			usd = sc.nextDouble();
			inr = usd * 79.89;
			System.out.println("\nIndian Rupee : " + inr);
			jye = usd * 136.47;
			System.out.println("Japanese Yen : " + jye);
			rsb = usd * 60.15;
			System.out.println("Russian Ruble : " + rsb);
			bre = usd * 5.12;
			System.out.println("Brazilian Real : " + bre);
			egp = usd * 19.19;
			System.out.println("Egyptian Pound : " + egp);
			cnd = usd * 1.29;
			System.out.println("Canadian Dollar : " + cnd);
			asd = usd * 1.43;
			System.out.println("Australian Dollar : " + asd);
			sad = usd * 16.75;
			System.out.println("South African Yand : " + sad);
			pnd = usd * 0.85;
			System.out.println("U. K. Pound Sterling : " + pnd);
			break;
		case 3:
			System.out.print("Enter amount in Japanese Yen : ");
			jye = sc.nextDouble();
			inr = jye * 0.59;
			System.out.println("\nIndian Rupee : " + inr);
			usd = jye * 0.0073;
			System.out.println("U. S. Dollar : " + usd);
			rsb = jye * 0.44;
			System.out.println("Russian Ruble : " + rsb);
			bre = jye * 0.038;
			System.out.println("Brazilian Real : " + bre);
			egp = jye * 0.14;
			System.out.println("Egyptian Pound : " + egp);
			cnd = jye * 0.0095;
			System.out.println("Canadian Dollar : " + cnd);
			asd = jye * 0.011;
			System.out.println("Australian Dollar : " + asd);
			sad = jye * 0.12;
			System.out.println("South African Yand : " + sad);
			pnd = jye * 0.0062;
			System.out.println("U. K. Pound Sterling : " + pnd);
			break;
		case 4:
			System.out.print("Enter amount in Russian Ruble : ");
			rsb = sc.nextDouble();
			inr = rsb * 1.33;
			System.out.println("\nIndian Rupee : " + inr);
			usd = rsb * 0.017;
			System.out.println("U. S. Dollar : " + usd);
			jye = rsb * 2.27;
			System.out.println("Japanese Yen : " + jye);
			bre = rsb * 1.34;
			System.out.println("Brazilian Real : " + bre);
			egp = rsb * 0.32;
			System.out.println("Egyptian Pound : " + egp);
			cnd = rsb * 0.022;
			System.out.println("Canadian Dollar : " + cnd);
			asd = rsb * 0.024;
			System.out.println("Australian Dollar : " + asd);
			sad = rsb * 0.28;
			System.out.println("South African Yand : " + sad);
			pnd = rsb * 0.014;
			System.out.println("U. K. Pound Sterling : " + pnd);
			break;
		case 5:
			System.out.print("Enter amount in Brazilian Real : ");
			bre = sc.nextDouble();
			inr = bre * 15.60;
			System.out.println("\nIndian Rupee : " + inr);
			usd = bre * 0.20;
			System.out.println("U. S. Dollar : " + usd);
			jye = bre * 26.65;
			System.out.println("Japanese Yen : " + jye);
			rsb = bre * 11.75;
			System.out.println("Russian Ruble : " + rsb);
			egp = bre * 3.75;
			System.out.println("Egyptian Pound : " + egp);
			cnd = bre * 0.25;
			System.out.println("Canadian Dollar : " + cnd);
			asd = bre * 0.28;
			System.out.println("Australian Dollar : " + asd);
			sad = bre * 3.27;
			System.out.println("South African Yand : " + sad);
			pnd = bre * 0.327;
			System.out.println("U. K. Pound Sterling : " + pnd);
			break;
		case 6:
			System.out.print("Enter amount in Egyptian Pound : ");
			egp = sc.nextDouble();
			inr = egp * 4.16;
			System.out.println("\nIndian Rupee : " + inr);
			usd = egp * 0.052;
			System.out.println("U. S. Dollar : " + usd);
			jye = egp * 7.11;
			System.out.println("Japanese Yen : " + jye);
			rsb = egp * 3.13;
			System.out.println("Russian Ruble : " + rsb);
			bre = egp * 0.27;
			System.out.println("Brazilian Real : " + bre);
			cnd = egp * 0.067;
			System.out.println("Canadian Dollar : " + cnd);
			asd = egp * 0.075;
			System.out.println("Australian Dollar : " + asd);
			sad = egp * 0.87;
			System.out.println("South African Yand : " + sad);
			pnd = egp * 0.044;
			System.out.println("U. K. Pound Sterling : " + pnd);
			break;
		case 7:
			System.out.print("Enter amount in Canadian Dollar : ");
			cnd = sc.nextDouble();
			inr = cnd * 61.77;
			System.out.println("\nIndian Rupee : " + inr);
			usd = cnd * 0.77;
			System.out.println("U. S. Dollar : " + usd);
			jye = cnd * 105.52;
			System.out.println("Japanese Yen : " + jye);
			rsb = cnd * 46.49;
			System.out.println("Russian Ruble : " + rsb);
			bre = cnd * 3.96;
			System.out.println("Brazilian Real : " + bre);
			egp = cnd * 14.84;
			System.out.println("Egyptian Pound : " + egp);
			asd = cnd * 1.11;
			System.out.println("Australian Dollar : " + asd);
			sad = cnd * 12.94;
			System.out.println("South African Yand : " + sad);
			pnd = cnd * 0.65;
			System.out.println("U. K. Pound Sterling : " + pnd);
			break;
		case 8:
			System.out.print("Enter amount in Australian Dollar : ");
			asd = sc.nextDouble();
			inr = asd * 55.75;
			System.out.println("Indian Rupee : " + inr);
			usd = asd * 0.70;
			System.out.println("U. S. Dollar : " + usd);
			jye = asd * 95.24;
			System.out.println("Japanese Yen : " + jye);
			rsb = asd * 41.96;
			System.out.println("Russian Ruble : " + rsb);
			bre = asd * 3.58;
			System.out.println("Brazilian Real : " + bre);
			egp = asd * 13.39;
			System.out.println("Egyptian Pound : " + egp);
			cnd = asd * 0.90;
			System.out.println("Canadian Dollar : " + cnd);
			sad = asd * 11.68;
			System.out.println("South African Yand : " + sad);
			pnd = asd * 0.59;
			System.out.println("U. K. Pound Sterling : " + pnd);
			break;
		case 9:
			System.out.print("Enter amount in South African Yand : ");
			sad = sc.nextDouble();
			inr = sad * 4.77;
			System.out.println("Indian Rupee : " + inr);
			usd = sad * 0.060;
			System.out.println("U. S. Dollar : " + usd);
			cnd = sad * 0.077;
			System.out.println("Canadian Dollar " + cnd);
			jye = sad * 8.15;
			System.out.println("Japanese Yen : " + jye);
			rsb = sad * 3.59;
			System.out.println("Russian Ruble : " + rsb);
			bre = sad * 0.31;
			System.out.println("Brazilian Real : " + bre);
			egp = sad * 1.15;
			System.out.println("Egyptian Pound : " + egp);
			asd = sad * 0.086;
			System.out.println("Australian Dollar : " + asd);
			pnd = sad * 0.050;
			System.out.println("U. K. Pound Sterling : " + pnd);
			break;
		case 10:
			System.out.print("Enter amount in U. K. Pound Sterling : ");
			pnd = sc.nextDouble();
			inr = pnd * 94.53;
			System.out.println("Indian Rupee : " + inr);
			usd = pnd * 1.18;
			System.out.println("U. S. Dollar : " + usd);
			jye = pnd * 161.47;
			System.out.println("Japanese Yen : " + jye);
			rsb = pnd * 71.15;
			System.out.println("Russian Ruble : " + rsb);
			bre = pnd * 6.06;
			System.out.println("Brazilian Real : " + bre);
			egp = pnd * 22.71;
			System.out.println("Egyptian Pound : " + egp);			
			cnd = pnd * 1.53;
			System.out.println("Canadian Dollar : " + cnd);
			asd = pnd * 1.70;
			System.out.println("Australian Dollar : " + asd);
			sad = pnd * 19.81;
			System.out.println("South African Yand : " + sad);
			break;
		default:
			System.out.println("Invalid Choice!");
		}
	}
        }
