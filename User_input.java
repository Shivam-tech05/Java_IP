import java.util.Scanner;
public class User_input {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // next reads input until space is encountered, nextLine reads the whole line of input
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); //nextInt() reads the next integer from the input
        System.out.println("Hello, This is " + name + " and I am " + age + " years old.");
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
    // when comparing 2 strings, use the .equals() methods1 s1 ==s2 compares the references of the strings, 
    // not the actual content of the strings. The .equals() method compares the actual content of the strings.
    // scp (String constant pool) is a special memory region in Java where string literals are stored. 
    // When a string literal is created, it is stored in the SCP, and if another string literal with the same value is created,
    //  it will reference the same object in the SCP instead of creating a new object. 
    // This helps to save memory and improve performance.
    // The == operator compares the references of the strings, not the actual content of the strings.
    // why we use scp?
    // Scp is used to optimize memory usage and improve performance by 
    // reusing string literals instead of creating new objects for each string with the same value. 
    // This reduces memory overhead and allows for faster string comparisons, as the JVM can quickly check if two references
    //  point to the same object in the SCP.


}
