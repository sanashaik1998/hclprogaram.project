package player1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String details;
		player1 p=new player1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name,country,skill:");
		details=sc.nextLine();
		String[] arrOfStr =details.split(",");
		String a=arrOfStr[0];
		String b=arrOfStr[1];
		String c=arrOfStr[2];
		p.Display(a, b, c);
	}

}
