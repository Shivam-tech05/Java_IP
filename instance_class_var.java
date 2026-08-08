public class instance_class_var {
    public int a = 5; //instance variable requires object of class to access
    static int b = 10; //class variable can use directly without creating object of class
    public static void main(String[] args){
        instance_class_var obj = new instance_class_var();
        
        System.out.println("Your value is: " + obj.a);
        System.out.println("Class variable value is: " + b);
        
    }
}
