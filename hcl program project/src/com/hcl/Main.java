package com.hcl;
import java.util.*;
public class Main {

	public static void main(String[] args) {
			System.out.println("1.RajImplements 2.shivImplements 3.MurthyImplements");
	        Scanner ob = new Scanner(System.in);
	        int ch=ob.nextInt();
	        switch(ch){
	            case 1: 
	            	RajImplements o=new RajImplements();
	            o.dis();
	            break;
	            case 2:
	           shivImplements o1=new shivImplements();
	            o1.dis();
	            break;
	            case 3: 
	            	MurthyImplements o2=new MurthyImplements();
	            	o2.dis();
	            	break;
	        }
	}
}