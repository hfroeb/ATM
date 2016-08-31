import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static User user = new User();


    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to The Bank of Halley");

        user.chooseName();
        user.chooseOptions();

        System.out.println("Thank you for using the Bank of Halley, have a nice day :)");
    }

    public static Student student = new Student();

}
