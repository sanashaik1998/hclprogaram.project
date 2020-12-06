package delivery;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Enter the over");
		Long over=t.nextLong();
		System.out.println("Enter the ball");
		Long ball=t.nextLong();
		System.out.println("Enter the runs");
		Long runs =t.nextLong();
		t.nextLine();
		System.out.println("Enter the batsman name");
		String batsman=t.nextLine();
		System.out.println("Enter the bowler name");
		String bowler=t.nextLine();
		System.out.println("Enter the nonStricker name");
		String nonStricker =t.nextLine();
		Delivery s=new Delivery(over,ball,runs,batsman,bowler,nonStricker);
		s.displayDeliveryDetails();
	}

}
