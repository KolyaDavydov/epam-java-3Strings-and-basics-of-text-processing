package ru.davydov.string_basics.string_array;

/*
 * 4. В строке найти количество чисел.
 * */

public class Task4 {

	public static void main(String[] args) {
		
		String str = "11hjjh22 hjjh333 444 5 6 b bh77?888";
		str = str.replaceAll("\\D+", " "); // заменяем все символы кроме цифр, которые повторяются один или олее раз на пробел
		
		System.out.println(str);
		String[] array = str.split(" ");
		
		System.out.println("количество чисел в строке: " + array.length);

	}

}
