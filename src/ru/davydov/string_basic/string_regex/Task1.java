package ru.davydov.string_basic.string_regex;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 1. Cоздать приложение, разбирающее текст (текст хранится в строке)
 * и позволяющее выполнять с текстом три различных операции:
 * отсортировать абзацы по количеству предложений;
 * в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений
 * заданного символа, а в случае равенства – по алфавиту.
 * */

public class Task1 {

	public static void main(String[] args) {
		
		String str = "1 Однажды гуляла я по лесу. Наступила осень, листва на деревьях окрасилась в яркие цвета. Тревожно гудели птицы на озере: скоро наступят холода, пора бы уже улететь, чтобы в следующем году вернуться сюда вновь.\r\n"
				+ "2 Тишину в лесу прерывали только редкие птичьи голоса и шелест ветра по сухим листам. Внезапно, я остановилась, услышав “тук-тук”.\r\n"
				+ "3 Я обошла дерево по кругу, недоумевая, кто же стал причиной шума?";
		
		String sortParagraph = sortByLengthSentence(str);
		String sortSentenсe = sortWordByLength (str);
		
		
		System.out.println("После сортировки абзацев:\n" + sortParagraph);
		System.out.println("После сортировки слов по длине в каждом предложении:\n" + sortSentenсe);
		
	}
	
	
	
	
	//Сортировка слов по длине в предложении
	private static String sortWordByLength (String str) {
		String[] array = str.split("[.!?]");
						
		for (int i = 0; i < array.length; i++) {
			str = str.replace(array[i], sortByLength(array[i]));
		}
		return str;
	}
	
	private static String sortByLength (String str) { //сортирует для каждого преложения слова в порядке возрастания
		String[] array = str.split("[^A-z0-9А-я]");
		
		Comparator<String> comporator = (o1, o2) -> o1.length() - o2.length();
		
		Arrays.sort(array, comporator);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1)
				sb.append(array[i]).append(" ");
			else
				sb.append(array[i]);
		}
		return sb.toString();
	}
	
	
	//Сортировка абзацев (сортировка выбором) по количеству предложений
	private static String sortByLengthSentence(String str) {
		
		String[] array = str.split("\\r\\n");
		
		for(int i = 0; i < array.length; i++) {
			int min = array[i].split("[.!?]").length;
			String minStr = array[i];
			int index = i;
			
			for (int j = i + 1; j < array.length; j++) {
				if(array[j].split("[.!?]").length < min) {
					minStr = array[j];
					index = j;
				}
			}
			if (i != index) {

				String tempStr = array[i];
				array[i] = array[index];			
				array[index] = tempStr;
			}
		}
				
		String text = "";
		for (String prg : array) {
			text = text + prg + "\r\n";
		}
		System.out.println(text);
		return text;
	}
}
