import java.util.Scanner;
public class Voting_eligibility {
    public static void main(String[] args){ // main method to check voting eligibility
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.print("Enter your Age:");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        if(age >= 18){
            System.out.println(name + ", you are eligible to vote.");
        }
        else{
            System.out.println(name + ", you are not eligible to vote.");
            sc.close(); // Close the scanner to prevent resource leaks
        }
    }
}
