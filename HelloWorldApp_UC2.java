/**
 * HelloWorldApp_UC2 - Use Case 2: Display Name
 * This application extends UC1 by accepting a user's name 
 * as a command-line argument to display a personalized greeting.
 *
 * @author Antigravity
 * @version 1.0
 */
public class HelloWorldApp_UC2 {

    /**
     * Main method - the entry point of the application.
     * 
     * @param args Command line arguments, where args[0] is expected to be a name
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello " + name);
        } else {
            System.out.println("Hello World");
        }
    }
}
