package com.greatlearning.code;

public class NotesCount {
	
	public void noOfNotes(int[] currency, int amount) {
		
		int[] notesCount = new int[currency.length];
		int sumoFreqofNotes = 0; 
		
		for(int m = 0; m < currency.length; m++) {
			notesCount[m] = amount/currency[m]; //frequency of the notes
			amount = amount %currency[m]; //balance left
			sumoFreqofNotes += notesCount[m]; //adding frequency of all used notes to get total number notes
		}
		
		System.out.println("Your payment approach in order to give the minimum number of notes will be : ");
		for(int n = 0; n < currency.length; n++) {
			System.out.println(currency[n]+" X "+notesCount[n]);
		}
		
		System.out.println("The total number of notes used : "+sumoFreqofNotes);
	}
}
