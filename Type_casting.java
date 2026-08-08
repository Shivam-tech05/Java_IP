public class Type_casting{
    public static void main(String[] args){
        // Example of type casting
        int a = 12;
        double b = a;   // Widening casting (int to double)
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        //Narrowing casting (double to int)
        double c = 9.78;
        int d = (int) c; // Narrowing casting
        System.out.println("Value of c: " + c);
        System.out.println("Value of d: " + d); 
        // ceiling and floor value of double
        double e = 5.75;
        System.out.println("Ceiling value is:" + (int)Math.ceil(e));
        System.out.println("Floor value is:" + (int)Math.floor(e));
    }
    // Type casting order 
    //widening type casting: byte -> short -> char -> int -> long -> float -> double
    //narrowing type casting: double -> float -> long -> int -> char -> short -> byte

}