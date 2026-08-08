import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Using_BufferedReader {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine()); // Convert the input string to an integer
        System.out.print("Enter your name: ");
        String name = br.readLine();
        System.out.println("Hello, This is " + name + " and I am " + age + " years old.");
        br.close(); // Close the BufferedReader to prevent resource leaks
    }
}
