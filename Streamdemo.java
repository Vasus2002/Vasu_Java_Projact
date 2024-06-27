package lembdaexp;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streamdemo {
		public static void main(String a[]) {
			Stream<Integer> st = Stream.of(34,45,23,45,23);
			System.out.println( st.count());
			
			Integer [] int1 = {78,9,0,2,4,6};
			
			
			Stream sint;
			
			 sint =  Arrays.stream(int1).map(k->k+1);
			 
			 sint.forEach(System.out::println);

		}
}
