package venue.hcl;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Enter the venue name");
		String name=t.nextLine();
		System.out.println("Enter the city name");
		String city =t.nextLine();
		System.out.println("Enter the venue details:");
		Venue V= new Venue(name,city);
		System.out.println("Venue Name:"+V.name+"\n"+"city Name:"+V.city);		

	}

}
