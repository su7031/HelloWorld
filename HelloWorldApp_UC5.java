/**
 * HelloWorldApp_UC5 - Use Case 5: Enhanced For Loop
 * This application extends previous use cases by accepting zero or more 
 * command-line arguments. It uses an enhanced for loop to process multiple 
 * names and print a greeting for each. If no arguments are provided, 
 * it displays the default greeting: "Hello, World!".
 *
 * @author Antigravity
 * @version 1.0
 */
public class HelloWorldApp_UC5 {

    /**
     * Main method - the entry point of the application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Enhanced for loop to process the multiple arguments
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        }
    }
}
