package ganiu_project;

import java.util.Scanner;

public class Flight_Assignment {

	public static void main(String[] args) {
	
		boolean[] seat = new boolean[10];
		int economyClass = 1;
		int firstClass = 1;
		boolean proceed;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please type 1 for First-class and 2 for Economyclass enter 0 to quit");
			int reply = input.nextInt();
			if(reply == 0) {break;
			}
			if(reply == 1) {
				for(int i = 0;i < 5;i ++) {
					if(seat[i] == false) {
						seat[i] = true;
						firstClass++;
						System.out.println("You are in the first class section and your seat number is " + (i + 1));
						break;
					}
					if(firstClass > 5){
						System.out.print("First section is full.Enter 1 to be placed in a economy class section");
						break;
					}
				}
			}
			else if(reply == 2) {
				for(int j = 5;j < 10;j++) {
					if(seat[j] == false) {
						seat[j] = true;
						economyClass ++;
						System.out.println("You are in the economy class section and your seat number is " + (j + 1));
						break;
					}
					if(economyClass > 5){
						System.out.print("Economy section is full.Enter 1 to be placed in a first class section");
						break;
					}
				}
				
				}
			if(economyClass > 5 && firstClass > 5 ) {
				System.out.println("All sections are full");
				break;
			}
			for(boolean seats : seat) {
			
				
			}
		}
	}
		
	

	}


