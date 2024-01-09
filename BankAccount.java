import java.util.Scanner;
public class BankAccount
{
	private String acc_holder_name;
	private String acc_no;
    private int balance=0;
    BankAccount(String name,String number, int b)  
    { 
        acc_holder_name=name;
        acc_no=number;
        balance=b;
    }
    public void deposit(){
        System.out.println("Enter the Amount to deposit");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        balance+=amount;
    }
    public void withdrawl(){
        System.out.println("Enter the Amount for withdrawal");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        if(amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient fund");
        }
    }
    public void check_balance(){
        System.out.println("Balance="+balance);
    }
    public static void main(String aregs[]){
        BankAccount ba=new BankAccount("sai","123455677",90);
        while(true){
        System.out.println("1. Deposit 2. Withdrawl 3.CheckBalance  4.Exit");
        System.out.println("Enter an option:");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        switch(option){
            case 1:ba.deposit();
                   break;
            case 2:ba.withdrawl();
                   break;
            case 3:ba.check_balance();
                   break;
            case 4:System.exit(0);
            default: System.out.println("Invalid option");
         }
    }
    }
}
