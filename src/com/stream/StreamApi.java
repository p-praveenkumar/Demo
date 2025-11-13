package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
public static void main(String[] args) {
	List<Integer> list1=Arrays.asList(2,3,4,5,6,7,8,9);
	Stream<Integer> stream=list1.stream();
	stream.forEach(System.out::println);
	System.out.print("Even Numbers are: ");
	for(Integer i:list1) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}
	
	
	//Predicate interace//
	Predicate<Integer> check=i->(i%2==0);
	System.out.println("\n"+check.test(8));  //returns true or false
	//                              //
	
	// consumer Interface//
	Consumer<String> consume=message->System.out.println("Hello "+message);
	consume.accept("Naresh");
	//                             //
	
	
	
	System.out.println("Using Steam filter() Method");
	System.out.println("Even Numbers are : ");
	list1.stream().filter(i->(i%2==0)).forEach(System.out::println);
	
	System.out.println("Copying from Stream to list");
	List<Integer> evennumbers=list1.stream()
	                               .filter(i->(i%2==0))
	                               .toList();
	evennumbers.forEach(System.out::println);
}
}
