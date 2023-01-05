package Day7.Task1;
import java.util.Scanner;

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

public class bankBranch extends Bank{
    String branchName;
    int branchId;
    long bankPhno;

    private long branchTotalfound = 5000000;
    private float branchIntrest = 5f;

    void loan(long loanAmount){
        Bank bankObj = new Bank();
        boolean loadApprovalStatus = bankObj.checkloan(loanAmount, branchTotalfound);

        if (loadApprovalStatus) {
            System.out.println("Bank has the required fund!");
            float totalInterest = bankObj.totalInterest(branchIntrest);
            System.out.printf("Our interest rate will be %.0f percent",totalInterest);
        } else {
            System.out.println("We are sorry to inform you that we cannot sanction this loan ammount");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankBranch bankBranchObj = new bankBranch();
        System.out.println("Welcome to "+bankBranchObj.bankName+" Bank");
        System.out.print("\nEnter the loan amount: ");
        long loanAmount = sc.nextLong();
        bankBranchObj.loan(loanAmount);
    }
}
