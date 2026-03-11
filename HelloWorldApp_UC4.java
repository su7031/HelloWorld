/**
 * HelloWorldApp_UC4 - Use Case 4: Display Multiple Names
 * This application extends UC3 by accepting multiple user names
 * as command-line arguments and displaying a personalized greeting
 * for all names. If no names are provided, it defaults to "World".
 *
 * @author Antigravity
 * @version 1.0
 */
public class HelloWorldApp_UC4 {

    /**
     * Main method - the entry point of the application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            System.out.println("Hello " + String.join(" ", args));
        }
    }
}
