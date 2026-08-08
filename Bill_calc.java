import java.util.Scanner;
public class Bill_calc {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the price of the item:");
            double price = sc.nextDouble();
            System.out.print("Enter the quantity of the item:");
            int quantity = sc.nextInt();
            double total = price * quantity;
            System.out.println("The total bill is: " + total);
            sc.close();
        }
    }
}
