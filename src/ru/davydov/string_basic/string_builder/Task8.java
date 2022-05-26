package ru.davydov.string_basic.string_builder;

/*
 * 8. Вводится строка слов, разделенных пробелами.
 * Найти самое длинное слово и вывести его на экран.
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 * */

public class Task8 {

	public static void main(String[] args) {
		
		String str = "1 666666 22 333 7777777 4444 55555 7777777";
		
		maxLength(str);

	}
	
	private static void maxLength(String str) {
		String[] array = str.split("\\s");
		
		String maxLength = "";
		
		for(int i = 0; i < array.length; i++) {
			if(array[i].length() > maxLength.length())
				maxLength = array[i];
		}
		
		int counter = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i].length() == maxLength.length())
				counter++;
		}
		
		if(counter == 1)
			System.out.println("Самое длинное слово: " + maxLength);
	}
}
