package ru.davydov.string_basics.string_array;

/*
 * 5. Удалить в строке все лишние пробелы,
 * то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 * */

public class Task5 {

	public static void main(String[] args) {
		String str = "123     белеет   парус одинокий!!!";
		
		str = str.replaceAll(" +", " ");
		
		System.out.println(str);

	}

}
