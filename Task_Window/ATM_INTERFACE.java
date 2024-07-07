package Task_Window;
import java.util.*;
public class ATM_INTERFACE {
    public static void displayBalance(int balance){
        System.out.println("Current Balance : " + balance);
        System.out.println();
    }
    // Withdraw amount and update the balance
    public static int amountWithdrawing(int balance,int withdrawAmount) {
        System.out.println("Withdrawn Operation:");
        System.out.println("Withdrawing Amount : " + withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("Please collect your money and collect the card");
                    displayBalance(balance);
                }
                else {
                    System.out.println("Sorry! Insufficient Funds");
                    System.out.println();
                }
                return balance;
            }
            // Deposit amount and update the balance
            public static int amountDepositing(int balance,
                                               int depositAmount)
            {
                System.out.println("Deposit Operation:");
                System.out.println("Depositing Amount : "
                        + depositAmount);
                balance = balance + depositAmount;
                System.out.println(
                        "Your Money has been successfully deposited");
                displayBalance(balance);
                return balance;
            }

            public static void main(String args[])
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Required Information: ");
                int balance = 10000;
                System.out.println("Enter Amount to Withdraw:");
                double withdrawAmount = sc.nextDouble();
                System.out.println("Enter mount to Deposit: ");
                double depositAmount = sc.nextDouble();
                // calling display balance
                displayBalance(balance);
                // withdrawing amount
                balance = amountWithdrawing(balance, (int)withdrawAmount);
                // depositing amount
                balance = amountDepositing(balance, (int)depositAmount);
            }
        }
