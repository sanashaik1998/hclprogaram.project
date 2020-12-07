package task2.hcl;

public class Delivery {
	private String batsman,bowler,nonstricker;
	private Long over,ball,runs;
	public Delivery() {
		
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonstricker() {
		return nonstricker;
	}
	public void setNonstricker(String nonstricker) {
		this.nonstricker = nonstricker;
	}
	public Long getOver() {
		return over;
	}
	public void setOver(Long over) {
		this.over = over;
	}
	public Long getBall() {
		return ball;
	}
	public void setBall(Long ball) {
		this.ball = ball;
	}
	public Long getRuns() {
		return runs;
	}
	public void setRuns(Long runs) {
		this.runs = runs;
	 }
	public Delivery(String batsman,String bowler,String nonStricker,Long getOver,Long getBall,Long getRuns) {
		super();
	this.batsman=batsman;
	this.bowler=bowler;
	this.nonstricker=nonstricker;
	this.over=over;
	this.ball=ball;
	this.runs=runs;	
	}

}
