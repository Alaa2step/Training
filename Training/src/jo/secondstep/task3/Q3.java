package jo.secondstep.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Question link: https://www.hackerrank.com/challenges/missing-numbers/problem
 * Question name: Missing Numbers
 */
public class Q3 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		int lengthA, lengthB;
		lengthA = cin.nextInt();
		cin.nextLine();
		int[] firstArray = new int[lengthA];
		for (int i = 0; i < lengthA; i++) {
			firstArray[i] = cin.nextInt();
		}

		cin.nextLine();
		lengthB = cin.nextInt();
		cin.nextLine();
		int[] secondArray = new int[lengthB];
		for (int i = 0; i < lengthB; i++) {
			secondArray[i] = cin.nextInt();
		}

		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		boolean[] visited = new boolean[101000];
		for (int i = 0; i < 101000; i++)
			visited[i] = false;
		int i = 0, j = 0;
		while (i < lengthA && j < lengthB) {
			if (firstArray[i] == secondArray[j]) {
				i++;
				j++;
			} else {
				if (firstArray[i] > secondArray[j]) {
					if (!visited[secondArray[j]]) {
						System.out.print(secondArray[j] + " ");
						visited[secondArray[j]] = true;
					}
					j++;
				}

				else {
					if (!visited[firstArray[i]]) {
						System.out.print(firstArray[i] + " ");
						visited[firstArray[i]] = true;
					}
					i++;
				}
			}
		}

		while (j < lengthB) {
			if (!visited[secondArray[j]]) {
				System.out.print(secondArray[j] + " ");
				visited[secondArray[j]] = true;
			}
			j++;
		}

		while (i < lengthA) {
			if (!visited[firstArray[i]]) {
				System.out.print(firstArray[i] + " ");
				visited[firstArray[i]] = true;
			}
			i++;

		}

	}
}
