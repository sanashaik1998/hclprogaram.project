package com.hcl;

	import java.util.*;

	public class Exceptionprogram {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n;
			System.out.println("enter a nuber in integer format");
			Scanner s = new Scanner(System.in);
			try {
				n = s.nextInt();
				System.out.println("Entered number is "+n);
			} catch (Exception ae) {
				System.out.println(ae);
			}
		}

	}



