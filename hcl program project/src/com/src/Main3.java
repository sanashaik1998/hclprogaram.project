package com.src;

	import java.util.Scanner;


	public class Main3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Delivery d=new Delivery();
			Scanner sc= new Scanner(System.in);
			String batsman,bowler,nonstricker;
			Long over,ball,runs;
			System.out.println("Enter the over:");
			over = sc.nextLong();
			System.out.println("Enter the ball:");
			ball=sc.nextLong();
			System.out.println("Enter the runs:");
			runs= sc.nextLong();
			System.out.println("Enter the batsman: ");
			batsman=sc.nextLine();
			System.out.println("Enter the bowler:");
			bowler=sc.nextLine();
			System.out.println("Enter the nonstricker:");
			nonstricker=sc.nextLine();
			d.setOver(over);
			d.setBall(ball);
			d.setRuns(runs);
			d.setBatsman(batsman);
			d.setBowler(bowler);
			d.setNonstricker(nonstricker);
			System.out.println("Over:"+d.getOver());
			System.out.println("Ball:"+d.getBall());
			System.out.println("Runs:"+d.getRuns());
			System.out.println("Batsman:"+d.getBatsman());
			System.out.println("Bowler:"+d.getBowler());
			System.out.println("NonStricker:"+d.getNonstricker());
		}

	}


