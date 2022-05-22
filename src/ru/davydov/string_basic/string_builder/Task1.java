package ru.davydov.string_basic.string_builder;

/*
 * 1. Дан текст (строка).
 * Найдите наибольшее количество подряд идущих пробелов в нем.
 * */

public class Task1 {

	public static void main(String[] args) {
		
		String str = " 1  2    40   3";
			
		String[] arraySpaceStr = str.split("\\S");
		
		int counter = 0;
		
		for(String s : arraySpaceStr) {
			if(s.length() > counter)
				counter = s.length();
		}
		
		System.out.println("Максимальное количество подряд идущих пробелов: " + counter);

	}

}
