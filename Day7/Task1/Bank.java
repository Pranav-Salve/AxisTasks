package Day7.Task1;

/* 
create class Mainbank parent
    name
    id
    phno
    private bankTotalfound
    private bankIntrest
    checkloan(loan){
        loan<bankTotalfound
    }
    totalintreat(branchIntrest){
        return bankIntrest+branchIntrest
    }
create banckbranch child
    name
    id
    phno
    private branchTotalfound
    private branchIntrest

    method loan{
        checkloan(100000)
        loan is approved;
        totalintreat(branchIntrest);
        totalintreat
    }
 */

public class Bank {
    String bankName = "Axis";
    int bankId = 123;
    long bankPhno = 9876543210l;

    private long bankTotalfound = 10000000;
    private float bankIntrest = 1f;

    Bank(){

    }

    boolean checkloan(long loanAmount, long branchTotalfound){
        if (loanAmount<(bankTotalfound+branchTotalfound)) {
            return true;
        } else {
            return false;
        }
    }
    float totalInterest(float branchIntrest){
        float totalInterest = bankIntrest+branchIntrest;
        return totalInterest;
    }
}