package exam.codereading.q9;

import java.util.LinkedList;

public class Part1 {

	public static void main(String[] args) {
		//what will print?
		LinkedList<String> words = new LinkedList<>();
		
		words.add("class");
		words.add("inheritance");
		words.add("object");
		words.add("instance");
		words.add("list");

		int base = 10;

		for(int i = 0; i < 5; i++) {
		    String word = words.get(i);
		    int next = base / word.length();
		    System.out.println(next);
		    base = word.length();
		}
	}
}
//2
//0
//1
//0
//2
