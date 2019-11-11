package jo.secondstep.task3;

import java.util.Scanner;

/**
 * Question link: https://www.hackerrank.com/challenges/gem-stones/problem
 * Question name: Gemstones
 */
public class Q5 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int number;
		String s;
		number = cin.nextInt();
		cin.nextLine();// ignore line

		int[] frequency = new int[28];
		boolean[] visited = new boolean[28];

		for (int k = 0; k < number; k++) {
			
			// initialize visited for each case 
			for (int j = 0; j < 28; j++) {
				visited[j] = false;
			}
			s = cin.nextLine();

			for (int i = 0; i < s.length(); i++) {
				if (visited[s.charAt(i) - 'a'] == true)
					continue;
				frequency[s.charAt(i) - 'a']++;
				visited[s.charAt(i) - 'a'] = true;
			}
		}

		int answer = 0;
		for (int i = 0; i < 28; i++) {
			if (frequency[i] == number)
				answer++;
		}

		System.out.println(answer);
	}
}
