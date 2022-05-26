package ru.davydov.string_basic.string_builder;

/*
 * 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 * */

public class Task7 {

	public static void main(String[] args) {
		
		String str = "и снова каракатица";
		
		String strNew = delRepeatAndSpace(str);
		
		System.out.println(strNew);

	}
	
	private static String delRepeatAndSpace(String str) {
		
		char[] array = str.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < array.length; i++) {
			
			boolean flag = false;
			
			for(int j = 0; j < i; j++) {
				if((array[i] == array[j] && j != i) || array[i] == ' ')
					flag = true;
			}
			
			if(!flag) {
				sb.append(array[i]);
			}
		}
		
		return sb.toString();
	}
	
}
