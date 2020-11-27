import java.util.Scanner;

public class BankDriver{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of resources: ");
        int resourceNum = scan.nextInt();
        System.out.println("Enter the number of customers: ");
        int customerNum = scan.nextInt();


        BankImplement bank = new BankImplement(resourceNum,customerNum);



    }
}
