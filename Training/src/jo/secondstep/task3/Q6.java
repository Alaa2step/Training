package jo.secondstep.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import jo.secondstep.task2.Pair;

/**
 * Question link: https://www.hackerrank.com/challenges/minimum-loss/problem
 * Question name: Minimum Loss
 */
public class Q6 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int number;
		number = cin.nextInt();
		cin.nextLine();
		Pair[] prices = new Pair[number];

		for (int i = 0; i < number; i++) {
			int cost = cin.nextInt();
			prices[i] = new Pair(cost, i);
		}

		Arrays.sort(prices, new Comparator<Pair>() {
			@Override
			public int compare(Pair p1, Pair p2) {
				return p1.compareTo(p2);
			}
		});
		long answer = 100000000000000000L;
		Pair first, second;
		for (int i = 0; i < number - 1; i++) {
			first = prices[i];
			second = prices[i + 1];
			if (second.getY() < first.getY()) {
				answer = Math.min(answer, second.getX() - first.getX());
			}
		}

		System.out.println(answer);
	}

}
