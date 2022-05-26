package ru.davydov.string_basic.string_builder;

/*
 * 6. Из заданной строки получить новую, повторив каждый символ дважды.
 * */

public class Task6 {

	public static void main(String[] args) {
		
		String str = "Снова каракатица";
		
		String strNew = doublingChar(str);
		System.out.println(strNew);

	}
	
	private static String doublingChar(String str) {
		char[] array = str.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			sb.append(array[i]);
		}
		
		return sb.toString();
	}
}
