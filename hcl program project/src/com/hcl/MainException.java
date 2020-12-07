package com.hcl;
	import java.util.*;
	public class MainException {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int cost,n,cpd;
			Scanner s=new Scanner(System.in);
			System.out.println("enter the cost of the item for n days");
			cost=s.nextInt();
			System.out.println("enter n value");
			n=s.nextInt();
			if(n!=0)
			{
				cpd=cost/n;
				System.out.println("Cost per day of the item is"+cpd);
			}
			else
				try
			{
					cpd=cost/n;
			}
			catch(ArithmeticException ae)
			{
				System.out.println(ae);
			}

		}

	}



