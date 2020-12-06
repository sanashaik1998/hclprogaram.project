package delivery;

public class Delivery {
	Long over,ball,runs;
	String batsman,bowler,nonStricker;
	Delivery(Long over,Long ball,Long runs,String batsman,String bowler,String nonStricker)
	{
	this.over=over;
	this.ball=ball;
	this.runs=runs;
	this.batsman=batsman;
	this.bowler=bowler;
	this.nonStricker=nonStricker;
	}
void displayDeliveryDetails()
{
	System.out.println("Delivery detaails");
	System.out.println("Over:"+over+"\n"+"Ball:"+ball+"\n"+"Runs:"+runs+"\n"+"Batsman:"+batsman+"\n"+"Bowler:"+bowler+"\n"+"nonStricker:"+nonStricker+"\n");	

	}

}


