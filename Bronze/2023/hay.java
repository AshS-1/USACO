// 2023 Bronze #1 February Contest

import java.util.*;
public class hay {
	public static void main(String[] args){
		
		Scanner first = new Scanner(System.in);
		long loop = first.nextLong();
		long days = first.nextLong();
		
		long when = first.nextLong();
		long hay = first.nextLong();

		long whennow = 0;
		long haynow = 0;

		long total = 0;

		for (long i = 0; i < loop; i++) {
			if (first.hasNext()){
				whennow = first.nextLong();
				haynow = first.nextLong();
			} else {
				whennow = days + 1;
				haynow = hay;
			} 
			

			long whenchange = whennow - when;

			if (whenchange > hay) {
				total = total + hay;
				hay = haynow;
			} else {
				total = total + whenchange;
				hay = haynow + hay - whenchange;
			}

			when = whennow;
			
		}

		System.out.print(total);
	}
}
