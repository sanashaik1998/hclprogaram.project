package delivery;
	import java.util.*;

import com.hcl.Axisbankimplements;
import com.hcl.Hdfcbankimplements;
import com.hcl.Iciciimplements;
	public class Testbank {

		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			System.out.println("enter your choice");
	Scanner s=new Scanner(System.in);
	int ch;
	ch=s.nextInt();
	switch(ch)
	{
	case 1:
		Axisbankimplements a=new Axisbankimplements();
		
		a.duration();
		a.amount();
		
		break;
	case 2:
		Hdfcbankimplements h=new Hdfcbankimplements();
		h.duration();
		h.amount();
		
		
		break;
	case 3:
		Iciciimplements i=new Iciciimplements();
		i.duration();
		i.amount();
		
		
		break;
	}
		}

	}


}
