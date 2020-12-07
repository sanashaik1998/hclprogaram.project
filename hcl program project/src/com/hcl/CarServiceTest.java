package com.hcl;

	public class CarServiceTest {
		
	    int sum=0,d;
	    String k="Maruti";
	     public void sum(int cnum){
	        while(cnum!=0)
	        {
	            d=cnum%10;
	            sum=sum+d;
	            cnum=cnum/10;
	        }
	        if (sum%2!=0)
	        {
	            System.out.println("You can go for servicing on mon,wed,fri");
	        }
	        else{
	            System.out.println("You can go for servicing on tue,thrus,sat");
	        }
	        
	     }
	    public void years(int old)
	    {
	        if(old > 5)
	        {
	            System.out.println("Car washing is free");
	        } 
	        else
	        {
	            System.out.println("Not eligible for car washing");
	        }
	     }
	     
	     public void brand(String bra)
	     {
	        if( bra.equals(k))
	        { 
	         System.out.println("Your servicing charges is 4750");
	        }
	     }
}

