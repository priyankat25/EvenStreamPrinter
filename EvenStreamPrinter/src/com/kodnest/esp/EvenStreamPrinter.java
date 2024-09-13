package com.kodnest.esp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenStreamPrinter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Integer> numbers = new ArrayList<>();
		
		for(int i=0; i<=n; i++) {
			numbers.add(i);
		}
		
		sc.close();

		List<Integer> evenNumList = findEvenStreamPrinter(n, numbers);

		for(int evenList : evenNumList) {
			System.out.print(evenList + " ");
		}
	}
	public static List<Integer> findEvenStreamPrinter(int n, List<Integer> numbers) {
			
		List<Integer> evenNumList = new ArrayList<>();	
		
		evenNumList = numbers.stream()
				.filter(num -> num%2==0)
					.collect(Collectors.toList());
		
		return evenNumList;
	}
}