package ru.davydov.string_basic.string_builder;

/*
 * 2. В строке вставить после каждого символа 'a' символ 'b'.
 * */

public class Task2 {

	public static void main(String[] args) {
		
		String str = "epam Java";
		
		str = str.replaceAll("a", "ab");
		
		System.out.println(str);

	}

}
