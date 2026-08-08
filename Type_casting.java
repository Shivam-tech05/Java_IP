public class Type_casting{
    public static void main(String[] args){
        // Example of type casting
        int a = 12;
        double b = a;   // Implicit casting (int to double)
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        //Explicit casting (double to int)
        double c = 9.78;
        int d = (int) c; // Explicit casting
        System.out.println("Value of c: " + c);
        System.out.println("Value of d: " + d); 
    }
}