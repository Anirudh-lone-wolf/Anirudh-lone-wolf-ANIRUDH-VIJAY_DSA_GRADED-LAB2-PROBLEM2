package com.greatleaning.main;

import java.util.*;

import com.greatlearning.code.MergeSort;

import com.greatlearning.code.NotesCount;

public class CurrencyDenominationMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of Currency Denominations : ");
		int denominations = sc.nextInt();
		
		int[] currency = new int[denominations];
		System.out.println("Enter the Currency Denominations of the given country: ");
		for(int i = 0; i<denominations; i++)
			currency[i] = sc.nextInt();
		
		System.out.print("The Currency Denominations your entered are : " +Arrays.toString(currency)+ "\n");
		
		MergeSort ms = new MergeSort();
		ms.mergeSort(currency, 0, denominations-1);
		System.out.print("The Currency Denominations in descending order : "+Arrays.toString(currency)+ "\n");
		
		System.out.println("Enter Amount : ");
		int amount = sc.nextInt();
		
		NotesCount nc  = new NotesCount();
		nc.noOfNotes(currency, amount);
		
		sc.close();

	}

}
