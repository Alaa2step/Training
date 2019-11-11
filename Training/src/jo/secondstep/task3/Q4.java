package jo.secondstep.task3;

import java.util.Scanner;

/**
 *Question link: https://www.hackerrank.com/challenges/caesar-cipher-1/problem
 *Question name: Caesar Cipher
 */
public class Q4 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int size,rotation;
		size=cin.nextInt();
		
		cin.nextLine();
		String orginalString =cin.nextLine();
		//System.out.println(orginalString);
		rotation=cin.nextInt();
		char[] answer =new char[size];
		for(int i=0;i<size;i++)
		{
			if(!Character.isAlphabetic( orginalString.charAt(i)))
				answer[i]=orginalString.charAt(i);
			else
			{
				if(Character.isLowerCase(orginalString.charAt(i)))
				{
					answer[i]=(char) (((orginalString.charAt(i)-'a')+rotation)%26 + 'a');

				}
				else {
					answer[i]=(char) (((orginalString.charAt(i)-'A')+rotation)%26 + 'A');

				}
			}
		}
		System.out.println(answer);
	}
}
