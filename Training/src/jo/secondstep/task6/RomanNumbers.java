package jo.secondstep.task6;

import java.util.Scanner;

public class RomanNumbers {
	static int decimalvalues[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	static String romanCharacters[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public static String converFromDecimalToRoman(int decimal) {
		String roman = "";
		int index = 0;
		while (decimal > 0) {
			while (decimal >= decimalvalues[index]) {
				roman += romanCharacters[index];
				decimal -= decimalvalues[index];
			}
			index++;
		}
		return roman;
	}

	public static int convertFromRomanToDecimal(String romanNumber) {
		int index = 0;
		String subString;
		int decimal = 0;
		while (romanNumber.length() > 0) {
			subString = romanCharacters[index];
			while (romanNumber.indexOf(subString) == 0) {
				decimal += decimalvalues[index];
				romanNumber = romanNumber.replaceFirst(subString, "");
			}
			index++;
		}
		return decimal;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Please enter the number of test cases");
		int testCases;
		testCases = cin.nextInt();
		while (testCases-- > 0) {
			System.out.println("Enter Decimal or Roman");
			String input = cin.next();
			if (input.matches("\\d+")) {
				System.out.println(converFromDecimalToRoman(Integer.parseInt(input)));
			} else {
				System.out.println(convertFromRomanToDecimal(input));
			}
		}
		cin.close();
	}
}
