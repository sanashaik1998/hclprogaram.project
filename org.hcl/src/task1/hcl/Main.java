package task1.hcl;

import java.util.Scanner;

import javax.swing.filechooser.FileSystemView;

import task1.hcl.venue.Venue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,city;
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Venue Name");
		name=sc.nextLine();
		System.out.println("Enter the city Name");
		city=sc.nextLine();
		Venue v=new Venue();
		System.out.println("Venue Details:");
		v.setCity(city);
		System.out.println("City is:"+v.getCity());
		System.out.println("Verify and update Venue Details");
		System.out.println("1.update Venue Name\r\n"+"2.update City Name\r\n"+"3.All informations correct/Exit\r\n"+"Type 1 or 2 or 3");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			String Venue;
			System.out.println("Enter Venue Details:");
			sc.nextLine();
			Venue=sc.nextLine();
			System.out.println("Venue Details:");
			v.setName(Venue);
			System.out.println("Venue is:"+v.getName());
			System.out.println("city is:"+v.getCity());
			break;
		case 2:
			String City;
			System.out.println("Enter the Venue Details:");
			sc.nextLine();
			city=sc.nextLine();
			System.out.println("Venue Details:");
			System.out.println("Venue is:"+v.getName());
			v.setCity(city);
			System.out.println("City is:"+v.getCity());
			break;
		case 3:
			System.out.println("Venue details:");
			System.out.println("Venue is:"+v.getName());
			System.out.println("City is:"+v.getCity());
			break;			
		}
		
	}

}
