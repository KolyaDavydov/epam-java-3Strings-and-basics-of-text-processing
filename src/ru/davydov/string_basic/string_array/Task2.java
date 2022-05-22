package ru.davydov.string_basic.string_array;

/*
 * 2. Замените в строке все вхождения 'word' на 'letter'.
 * */

public class Task2 {

	public static void main(String[] args) {
		
		String str = "Word is not world, Word consist word. wordMe";
		System.out.println(str);
		
		str = str.replace("word", "letter");
		System.out.println(str);

	}

}
