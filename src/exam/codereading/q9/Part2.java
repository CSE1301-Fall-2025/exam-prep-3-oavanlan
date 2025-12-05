package exam.codereading.q9;

import java.util.HashMap;

public class Part2 {

	public static void main(String[] args) {
		//what will print?
		String [] days = {"sunday", "monday", "tuesday",
			    "wednesday", "thursday", "friday", "saturday"};
			HashMap<String,String> order = new HashMap<>();
			order.put("monday", "hooray");
			order.put("saturday", "ice");
			order.put("friday", "a");
			order.put("wednesday", "meow");

			String x = "start";
			String y = "thursday" ;

			while ( x != null ) {
			    y = days[x.length()];
			    System.out.println(y);
			    x = order.get(y);
			}
	}
}
//friday
//monday
//saturday
//wednesday
//thursday