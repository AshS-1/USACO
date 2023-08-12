import java.util.*;
public class moon {
	public static void main(String[] args){
		
		Scanner first = new Scanner(System.in);
		
		long num = first.nextLong();
		long add = first.nextLong();
		
		long one = first.nextLong();
		long two = 0;

		long total = add + 1;

		for (long i = 0; i < num - 1; i++) {
		 	two = first.nextLong();
			if ((1 + add + total) > (total + two - one)) {
				total = (total + two - one);
			} else {
				total = (1 + add + total);
			}
			one = two;
		}

		System.out.print(total);
	}
}
