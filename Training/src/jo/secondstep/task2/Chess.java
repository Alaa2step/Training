package jo.secondstep.task2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Chess {
	public static int rows = 8;
	public static int columns = 8;
	public static char[][] chess = new char[rows][columns];

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(new BufferedReader(new FileReader(
				"D:\\Users\\ala.hajar\\eclipse-workspace\\Training\\src\\jo\\secondstep\\task2\\input.txt")));

		while (sc.hasNextLine()) {
			for (int i = 0; i < chess.length; i++) {
				String[] line = sc.nextLine().trim().split(" ");
				for (int j = 0; j < line.length; j++) {
					chess[i][j] = line[j].charAt(0);
				}
			}
		}

		Pair startPair = null, endPair = null;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (chess[i][j] == 'S') {
					startPair = new Pair(i, j);
				}

				if (chess[i][j] == 'E') {
					endPair = new Pair(i, j);
				}
			}
		}

		int answer = findSteps(startPair, endPair);
		System.out.println("Shortest path = " + answer);
	}

	public static int findSteps(Pair startPair, Pair endPair) {
		int count = 0;
		int dx[] = { 1, 1, -1, -1, 2, 2, -2, -2 };
		int dy[] = { 2, -2, 2, -2, 1, -1, 1, -1 };

		boolean visited[][] = new boolean[8][8];
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
				visited[i][j] = false;

		Queue<Pair> q = new LinkedList<>();

		q.add(startPair);
		visited[startPair.getX()][startPair.getY()] = true;

		while (!q.isEmpty()) {

			int queueSize = q.size();
			while (queueSize-- > 0) {

				Pair statePair = q.remove();

				int x = statePair.getX();
				int y = statePair.getY();
				int newX, newY;

				for (int i = 0; i < 8; i++) {
					newX = x + dx[i];
					newY = y + dy[i];

					if (newX < 0 || newX >= 8 || newY < 0 || newY >= 8 || visited[newX][newY]
							|| chess[newX][newX] == '1')
						continue;

					if (chess[newX][newY] == 'E')
						return count + 1;

					Pair pair = new Pair(newX, newY);
					q.add(pair);
					visited[newX][newY] = true;
				}

			}
			count++;

		}

		return count;
	}
}
