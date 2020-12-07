package delivery;

	import java.util.*;

import com.src.ExecutiveStall;
import com.src.Goldstall;
import com.src.PremiumStall;

	public class Testinterface {

		public static void main(String[] args) {

			// TODO Auto-generated method stub
			int ch;
			String stallName;
			int cost;
			String ownername;
			int tvset;
			int projector;
			int screen;
			System.out.println("Choose stall type \n1.Goldstall\n2.Premiumstall\n3.Executivestall");
			Scanner s = new Scanner(System.in);
			ch = s.nextInt();
			String temp="null";
			
			switch (ch) {
			case 1:
				System.out.println(
						"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets");
				 temp=s.next();
				 String temp1[]=temp.split(",");
				stallName=temp1[0];
				cost=Integer.parseInt(temp1[1]);
				ownername=temp1[2];
				Goldstall g=new Goldstall();
				g.display();
				break;
			case 2:
				System.out.println(
						"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets");
				temp=s.next();
				String temp2[]=temp.split(",");
				stallName=temp2[0];
				cost=Integer.parseInt(temp2[1]);
				ownername=temp2[2];
				PremiumStall p=new PremiumStall();
				p.display();
				break;
			case 3:
				System.out.println(
						"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets");
				temp=s.next();
				String temp3[]=temp.split(",");
				stallName=temp3[0];
				cost=Integer.parseInt(temp3[1]);
				ownername=temp3[2];
				ExecutiveStall e=new ExecutiveStall();
				e.display();
				break;	
			}
		}

	}


