package ru.davydov.string_basic.string_builder;

/*
 * 4. С помощью функции копирования и операции конкатенации
 * составить из частей слова “информатика” слово “торт”.
 * */

public class Task4 {

	public static void main(String[] args) {

		String strOld = "информатика";
		String strNew = "торт";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < strNew.length(); i++) {
			sb.append(String.copyValueOf(strOld.toCharArray(), strOld.indexOf(strNew.charAt(i)), 1));
		}
		
		System.out.println(sb.toString());
	}

}
