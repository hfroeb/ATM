/**
 * Created by halleyfroeb on 8/31/16. User Interface of an ATM Machine
 */
public class User {
    String name;
    int options;
    int withdraw;
    int balance;


    public void chooseName() throws Exception {
        System.out.println("Please enter your name");
        name = Main.scanner.nextLine();
        if (name.isEmpty()) {
            throw new Exception("You must enter a name to continue");
        } else {
            System.out.println("Welcome, " + name);
        }
    }

    public void chooseOptions() throws Exception {
        balance = (100);
        do {
            System.out.println("Would you like to...[1.Check my balance/ 2.Withdraw funds/ 3.Cancel]");
            options = Main.scanner.nextInt();
            if (options == 1) {
                System.out.println("Your balance is $" + balance);

            } else if (options == 2) {
                System.out.println("How much money would you like to withdraw?");
                withdraw = Main.scanner.nextInt();
                if (withdraw > 1000) {
                    throw new Exception("You have exceeded the amount of money that you can withdraw at one time");
                } else if (balance < withdraw) {
                    throw new Exception("Insufficient Funds, your balance is $" + balance);
                } else if (withdraw < 1000 && withdraw > 0) {
                    balance= balance-withdraw;
                    System.out.println("Please take your cash, your remaining balance is $" + (balance));
                } else {
                    throw new Exception("Invalid Withdraw");
                }
            } else if (options == 3) {
                System.out.println("Thank you, please come again!");
            } else {
                throw new Exception("Invalid option" + options);
            }

        } while (options != 3) ;
    }
}



