package task4.hcl;

public class Account {

	    public Account(){

	    }

	    public Account(String accName, String accNo, String bankName) {
	        this.accName = accName;
	        this.accNo = accNo;
	        this.bankName = bankName;
	    }

	    public String getAccName() {
	        return accName;
	    }

	    public void setAccName(String accName) {
	        this.accName = accName;
	    }

	    public String getAccNo() {
	        return accNo;
	    }

	    public void setAccNo(String accNo) {
	        this.accNo = accNo;
	    }

	    public String getBankName() {
	        return bankName;
	    }

	    public void setBankName(String bankName) {
	        this.bankName = bankName;
	    }

	    private String accName;
	    private String accNo;
	    private String bankName;

	    public String display(){
	        return accName+" "+accNo+" "+bankName;
	    }



	}