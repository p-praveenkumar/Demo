package java8features.com;

import java.util.Arrays;
import java.util.List;

public class ForEachNMethod {
public static void main(String[] args) {
	List<String> movies=Arrays.asList("RRR","K-Ramp","Baahubali","Salaar","Pushpa","OG","Animal","Arjun Reddy");

	//for(String movie:movies) {
//	System.out.println(movie);
//}  
	
	System.out.println("Using lamda inside forEach()");
movies.forEach((movie)->System.out.println(movie));

System.out.println("Using method reerence inside forEach()");
movies.forEach(System.out::println);
}
}
