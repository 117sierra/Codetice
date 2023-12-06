import java.util.Scanner;
import java.util.Random;
interface Bank {
    void withdraw();


    void deposit();

    void checkbalance();
}
public class ATM implements  Bank {
    UserAccount user;

    ATM(UserAccount user) {
        this.user = user;
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void deposit() {
        System.out.println("Enter AccountNumber: ");
        int no = sc.nextInt();
        while(no!=user.accountnumber){
            System.out.println("Wrong AccountNumber!.Try Again");
            System.out.println("Enter AccountNumber again: ");
            no=sc.nextInt();
        }
        System.out.println("Successfully Logged In");
        System.out.println("Welcome! "+this.user.AccounHolderName);
        System.out.println("Current Balance: " + this.user.balance);
        System.out.println("Enter the amount to be deposited: ");
        float dep = sc.nextFloat();
        this.user.balance += dep;
        System.out.println("Current Balance: " + this.user.balance);
    }
    @Override
    public void withdraw() {
        System.out.println("Enter AccountNumber: ");
        int no = sc.nextInt();
        while(no!=user.accountnumber){
            System.out.println("Wrong AccountNumber!.Try Again");
            System.out.println("Enter AccountNumber again: ");
            no=sc.nextInt();
        }
        System.out.println("Successfully Logged In");
        System.out.println("Welcome! "+this.user.AccounHolderName);
        System.out.println("Current Balance: " + this.user.balance);
//            System.out.println("Enter the amount to be deposited: ");
        float with;
        System.out.println("Enter the amount to be withdrawn: ");
        with = sc.nextFloat();
        while (with > this.user.balance) {
            System.out.println("InSufficient Balance.Try Again!");
            System.out.println("Enter the amount to be withdrawn: ");
            with = sc.nextFloat();
//                if (with > this.user.balance) {
//                    System.out.println("InSufficient Balance.Try Again!");
//                }
        }
        this.user.balance-=with;
        System.out.println("Current Balance: " + this.user.balance);
    }
    @Override
    public void checkbalance() {
        System.out.println("Enter AccountNumber: ");
        int no = sc.nextInt();
        while(no!=user.accountnumber){
            System.out.println("Wrong AccountNumber!.Try Again");
            System.out.println("Enter AccountNumber again: ");
            no=sc.nextInt();
        }
        System.out.println("Successfully Logged In");
        System.out.println("Welcome! "+this.user.AccounHolderName);
        System.out.println("Current Balance: " + this.user.balance);
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------WELCOME TO BANKING SYSTEM-------------");
            Random random = new Random();
            System.out.println("Create Account");
            System.out.println("Enter Your Name");
            String name = sc.nextLine();
            System.out.println("Enter amount to be deposited");
            float balance = sc.nextFloat();
            int accno = random.nextInt(1050430, 1678435);
            UserAccount user1 = new UserAccount(name, balance, accno);
            ATM atm = new ATM(user1);
            System.out.println("Account Created. Your account number is- " + accno);
            System.out.println();
            boolean rep= true;
            while (rep){
                System.out.println("1) Deposit\n2) Withdraw\n3) Check Balance");
            int option= sc.nextInt();
            switch (option) {
                case 1:
                    atm.deposit();
                    break;
                case 2:
                    atm.withdraw();
                    break;
                case 3:
                    atm.checkbalance();
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
            System.out.println("Do you want to logout?(Yes/NO)");
            String chose= sc.next();
            if(chose.equals("Yes")){
                rep=false;
            }
        }
            System.out.println("Successfully Logged Out!!");
            System.out.println("Thank You For Coming!!");
    }

    static class UserAccount {
        int accountnumber;
        String AccounHolderName;
        float balance;

        UserAccount(String name, float balance, int accountnumber) {
            this.balance = balance;
            this.AccounHolderName = name;
            this.accountnumber = accountnumber;
        }

    }

}

