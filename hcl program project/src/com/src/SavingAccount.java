package com.src;

public class SavingsAccount extends Account {

    private String orgName;
    private String accName;
    private String accNo;
    private String bankName;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    SavingsAccount(){

    }

    SavingsAccount(String accName, String accNo, String bankName, String orgName){
        super(accName,accNo,bankName);
        this.orgName=orgName;
    }

    @Override
    public String getAccName() {
        return accName;
    }

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public String getAccNo() {
        return accNo;
    }

    @Override
    public String display() {
        return (super.display()+" "+orgName);
    }
}


