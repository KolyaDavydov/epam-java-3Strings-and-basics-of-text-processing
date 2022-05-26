package ru.davydov.string_basic.string_builder;

/*
 * 10. Строка X состоит из нескольких предложений,
 * каждое из которых кончается точкой, восклицательным или вопросительным знаком.
 * Определить количество предложений в строке X.
 * */

public class Task10 {

	public static void main(String[] args) {

		String pushkin = "Печален ты; признайся, что с тобой».\r\n"
				+ "— Люблю, мой друг! — «Но кто ж тебя пленила?»\r\n"
				+ "— Она.— «Да кто ж? Глидера ль, Хлоя, Лила?";
		
		counterSentence(pushkin);
	}
	
	private static void counterSentence(String str) {
		String[] array = str.split("[.!?]");
		
		System.out.println("Количество предложений в тексте: " + array.length);
	}
}
