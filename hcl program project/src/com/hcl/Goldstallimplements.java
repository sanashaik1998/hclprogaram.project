package com.hcl;

public class Goldstallimplements {

		String stallName;
			int cost;
			String ownername;
			int tvset;
			public Goldstallimplements() {
				super();
			}
			
			public Goldstallimplements(String stallName, int cost, String ownername, int tvset) {
				super();
				this.stallName = stallName;
				this.cost = cost;
				this.ownername = ownername;
				this.tvset = tvset;
			}
	
			public String getStallName() {
				return stallName;
			}
	
			public void setStallName(String stallName) {
				this.stallName = stallName;
			}
	
			public int getCost() {
				return cost;
			}
	
			public void setCost(int cost) {
				this.cost = cost;
			}
	
			public String getOwnername() {
				return ownername;
			}
	
			public void setOwnername(String ownername) {
				this.ownername = ownername;
			}
	
			public int getTvset() {
				return tvset;
			}
	
			public void setTvset(int tvset) {
				this.tvset = tvset;
			}
	
			public void display()
			{
				
				System.out.println(stallName+"\t"+cost+"\t"+ownername+"\t"+tvset);
			}
	
}

