package com.hcl;

	import java.util.*;
	public class ItemType {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	String name;
	String deposit;
	String cpd;
	try
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the item type details");
	System.out.println("Enter the name");
	name=s.next();
	System.out.println("enter the deposit");
	deposit=s.next();
	Double d=Double.parseDouble(deposit);
	System.out.println("enter the cost per day");
	cpd=s.next();
	Double d1=Double.parseDouble(cpd);
	System.out.println("The details of the item type are:");
	System.out.println("Name:"+name);
	System.out.println("Deposit:"+deposit);
	System.out.println("Cost per day:"+cpd);
	}
	catch(Exception ae)
	{
		System.out.println(ae);
	}
		

		}
	}
	
