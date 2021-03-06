package main.java;

// Constructors for the different asset accounts
class Chequing {

    String accName;
    Double currentBalance;

    public Chequing(String accName, Double currentBalance) {
        this.accName = accName;
        this.currentBalance = currentBalance;
    }

    public String getAccName() {
        return accName;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }
}

class Savings extends Chequing {

    public Double interest;

    public Savings(String accName, Double currentBalance, Double interest) {
        super(accName, currentBalance);
        this.interest = interest;
    }

    public Double getInterest() {
        return interest;
    }
}

class GIC extends Savings {

    public Double fixedTermLength;

    public GIC(String accName, Double currentBalance, Double interest, Double fixedTermLength) {
        super(accName, currentBalance, interest);
        this.fixedTermLength = fixedTermLength;
    }

    public Double getFixedTermLength() {
        return fixedTermLength;
    }
}

class TFSA extends Savings {
    public Double amtWithdrawn;
    public Double amtDeposited;
    public Double TFSAROR;

    public TFSA(String accName, Double currentBalance, Double interest, Double amtDeposited, Double amtWithdrawn, Double amtROR) {
        super(accName, currentBalance, interest);
        this.amtDeposited = amtDeposited;
        this.amtWithdrawn = amtWithdrawn;
        this.TFSAROR = amtROR;
    }

    public Double getAmtDeposited() {
        return amtDeposited;
    }

    public Double getAmtWithdrawn() {
        return amtWithdrawn;
    }

    public Double getTFSAROR() {
        return TFSAROR;
    }
}

class RRSP extends Chequing{
    public Double RRSPROR;

    public RRSP(String accName, Double currentBalance, Double RRSPROR){
        super(accName, currentBalance);
        this.RRSPROR = RRSPROR;
    }

    public Double getRRSPROR(){
        return RRSPROR;
    }
}

class OSAP extends Savings{
    public OSAP (String accName, Double currentBalance, Double interest){
        super(accName, currentBalance, interest);
    }
}