/**
 * HelloWorldApp_UC7 - Use Case 7: String.join() Method
 * This application accepts zero or more command-line arguments. 
 * If no arguments are provided, it displays "Hello, World!".
 * If arguments are provided, it uses the String.join() method to efficiently
 * concatenate all names with a delimiter (", ") before printing the greeting.
 *
 * @author Antigravity
 * @version 1.0
 */
public class HelloWorldApp_UC7 {

    /**
     * Main method - the entry point of the application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use String.join() to concatenate multiple names with a delimiter
            String joinedNames = String.join(", ", args);
            System.out.println("Hello " + joinedNames);
        }
    }
}
