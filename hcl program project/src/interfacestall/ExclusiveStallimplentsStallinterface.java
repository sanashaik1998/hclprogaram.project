package interfacestall;

	public class ExecutiveStall implements StallInterface 
	{
		String stallName;
		int cost;
		String ownername;
		int screen;
		public ExecutiveStall() {
			super();
		}
		public ExecutiveStall(String stallName, int cost, String ownername, int screen) {
			super();
			this.stallName = stallName;
			this.cost = cost;
			this.ownername = ownername;
			this.screen = screen;
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
		public int getScreen() {
			return screen;
		}
		public void setScreen(int screen) {
			this.screen = screen;
		}
		public void display()
		{
			System.out.println(stallName+"\t"+cost+"\t"+ownername+"\t"+screen);
		}
	}

}
