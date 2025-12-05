package exam.codereading.q3;

import java.util.HashMap;

public class Part2 {

	public static void main(String[] args) {
		//What will print?
		HashMap < Integer , Integer > map= new HashMap < >();
		map.put(131 , 0);
		map.put(247 , 12);
		map.put(0, 247);
		map.put(15 , 131);
		Integer x = 15;
		while (x!= null) {
			System.out.println(x);
			x = map.get(x);
		}
	}
}
//15
//131
//0
//247
//12