/**
 * HelloWorldApp_UC3 - Use Case 3: Display Name Default
 * This application extends UC2 by accepting a user's name
 * as a command-line argument, but uses robust fallback logic
 * to default to "World" if no arguments are provided.
 *
 * @author Antigravity
 * @version 1.0
 */
public class HelloWorldApp_UC3 {

    /**
     * Main method - the entry point of the application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        String name = "World"; // Default value
        
        if (args.length > 0) {
            name = args[0]; // Override with argument if present
        }
        
        System.out.println("Hello " + name);
    }
}
