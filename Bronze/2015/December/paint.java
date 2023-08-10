// 2015 December Contest
// Bronze Problem 1

import java.io.*;
import java.util.*;
public class paint {
	public static void main(String[] args) throws IOException {
		// initialize file I/O
		BufferedReader br = new BufferedReader(new FileReader("paint.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));

		// read in the first line, store a and b
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		// read in the second line, store c and d
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int amountPainted = 0;
		if ((d <= a) || (c >= b)) {
			amountPainted = (d - c) + (b - a);
		} else if ((d >= a) && (b >= d) && (a <= c)) {
			amountPainted = b - a;
		} else if ((d >= a) && (b >= d) && (a >= c)) {
			amountPainted = b - c;
		} else if ((d >= b) && (c >= a)) {
			amountPainted = d - a;
		} else {
			amountPainted = d - c;
		}

			
		
		// print the answer!
		pw.println(amountPainted);

		// close output stream
		pw.close();
	}
}
