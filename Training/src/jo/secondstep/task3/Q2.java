package jo.secondstep.task3;

import java.util.Scanner;

/**
 * Question link: https://www.hackerrank.com/challenges/two-strings/problem two
 * Question name: strings
 */
public class Q2 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		int testCases;
		testCases = cin.nextInt();
		cin.nextLine();

		int[] firstFrequecy = new int[29];
		int[] secondFrequecy = new int[29];

		while (testCases-- > 0) {
			String firstString;
			String secondString;
			firstString = cin.nextLine();
			secondString = cin.nextLine();

			for (int i = 0; i < firstString.length(); i++) {
				firstFrequecy[firstString.charAt(i) - 'a']++;
			}

			for (int i = 0; i < secondString.length(); i++) {
				secondFrequecy[secondString.charAt(i) - 'a']++;
			}

			boolean ok = false;
			for (int i = 0; i < 29; i++) {
				if (firstFrequecy[i] > 0 && secondFrequecy[i] > 0) {
					ok = true;
					break;
				}
			}

			for (int i = 0; i < 29; i++) {
				firstFrequecy[i] = secondFrequecy[i] = 0;
			}

			if (ok) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
