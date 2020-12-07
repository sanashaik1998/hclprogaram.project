package com.src;
public class PremiumStall implements StallInterface {
	String stallName;
	int cost;
	String ownername;
	int projector;
	public PremiumStall() {
		super();
	}
	public PremiumStall(String stallName, int cost, String ownername, int projector) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownername = ownername;
		this.projector = projector;
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
	public int getProjector() {
		return projector;
	}
	public void setProjector(int projector) {
		this.projector = projector;
	}
	public void display()
	{
		System.out.println(stallName+"\t"+cost+"\t"+ownername+"\t"+projector);
	}

}
