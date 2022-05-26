package ru.davydov.string_basic.string_builder;

/*
 * 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 * */

public class Task5 {

	public static void main(String[] args) {
		
		String str = "каракатица";
		
		howMuchA(str, 'а');

	}

	private static void howMuchA (String str, char ch) {
		
		char[] array = str.toCharArray();
		
		int counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == ch)
				counter++;
		}
		
		System.out.println("Символ " + ch + " в переданной строке встречается: "
				 + counter + " раз (а).");
	}
}
