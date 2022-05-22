package ru.davydov.string_basic.string_builder;

/*
 * 3. Проверить, является ли заданное слово палиндромом.
 * */

public class Task3 {

	public static void main(String[] args) {
		
		String str1 = "Summus";
		
		String str2 = new StringBuilder(str1).reverse().toString();
		
		if(str1.equalsIgnoreCase(str2))
			System.out.println("Данное слово полиндром");
		
		else
			System.out.println("Данное слово НЕ полиндром");

	}

}
