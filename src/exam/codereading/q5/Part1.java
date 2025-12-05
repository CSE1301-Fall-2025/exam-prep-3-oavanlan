package exam.codereading.q5;

import java.util.LinkedList;
import java.util.List;

public class Part1 {

	public static void main(String[] args) {
		//What will print?
		List <String > letters = new LinkedList < >();
		letters .add("a");
		letters .add("b");
		letters .add("c");
		letters .add("d");
		letters .add("e");
		letters .add("f");
		for ( int i = 2; i < 7; i ++) {
			int index = ((i * 3) / 2) % 6;
			System .out. println (letters.get( index ));
		}
	}
}
//d
//e
//a
//b
//d