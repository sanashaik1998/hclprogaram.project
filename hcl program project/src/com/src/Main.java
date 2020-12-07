package com.src;

	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner t= new Scanner(System.in);
		    System.out.println("Enter the Player name");
			String name=t.nextLine();
			System.out.println("Enter the country name");
			String country =t.nextLine();
			System.out.println("Enter the skill");
			String skill =t.nextLine();
			System.out.println("Player details");
			Player s=new Player(name,country,skill);
			System.out.println("Player Name:"+s.name+"\n"+"country Name:");
		

	}
	}

