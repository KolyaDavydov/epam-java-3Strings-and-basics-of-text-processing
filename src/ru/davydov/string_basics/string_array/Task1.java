package ru.davydov.string_basics.string_array;

import java.util.Arrays;

/*
 * 1. Дан массив названий переменных в camelCase.
 * Преобразовать названия в snake_case.
 * */

public class Task1 {

	public static void main(String[] args) {
		
		String[] camelCase = {"camelCaseOne", "camelCaseTwo", "camelCaseThree"};
		
		System.out.println("Названия переменых в массиве до трансформации: "
				+ Arrays.toString(camelCase));
		
		System.out.println("Названия переменых в массиве после трансформации: " 
				+ Arrays.toString(transformation(camelCase)));
    }
	
	private static String[] transformation (String[] array) {
		
		for(int i = 0; i < array.length; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(array[i]);
			
			array[i] = sb.replace(0, 9, "snake_case").toString();
		}
		
		return array;
	}
}
