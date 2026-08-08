import java.util.Scanner;
public class User_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // next reads input until space is encountered, nextLine reads the whole line of input
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); //nextInt() reads the next integer from the input
        System.out.println("Hello, This is " + name + " and I am " + age + " years old.");
    }
}
