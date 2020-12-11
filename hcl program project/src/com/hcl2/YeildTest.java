package com.hcl2;


public class YeildTest extends Thread {
	public void run() 
	    { 
	        System.out.println("In run "+this.getName()); 
	       yeild();
	        System.out.println("Leaving run"); 
	    }

	public static void main(String[] argv) {
		(new YeildTest()).start();
		(new YeildTest()).start();
		(new YeildTest()).start();
	}
}
