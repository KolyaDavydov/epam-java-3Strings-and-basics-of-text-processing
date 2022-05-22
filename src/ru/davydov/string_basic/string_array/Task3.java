package ru.davydov.string_basic.string_array;

/*
 * 3. В строке найти количество цифр.
 * */

public class Task3 {

	public static void main(String[] args) {
		
		String str = "12 34fj5 6gjdkh7 8,90";
		
		str = str.replaceAll("\\D", "");
		
		int numOfDigit = str.length();
		
		System.out.println("Количество цифр в строке: " + numOfDigit);
	}

}
