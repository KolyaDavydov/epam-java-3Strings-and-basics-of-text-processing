package ru.davydov.string_basic.string_builder;

/*
 * 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
 * Учитывать только английские буквы.
 * */

public class Task9 {

	public static void main(String[] args) {
		
		String str = "How Much Слов тут находитсR";
		
		counterUppLowLetter (str);

	}
	
	private static void counterUppLowLetter (String str) {
		char[] array = str.toCharArray();
		
		int counterLowCase = 0;
		int counterUpCase = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(Character.valueOf(array[i]).toString().matches("[a-z]"))
				counterLowCase++;
			
			if(Character.valueOf(array[i]).toString().matches("[A-Z]"))
				counterUpCase++;
		}
		
		System.out.println("количесвто строчных букв: " + counterLowCase +
				"\nКоличество прописных букв: " + counterUpCase);
	}
	
}
