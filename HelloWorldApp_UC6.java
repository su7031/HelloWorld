/**
 * HelloWorldApp_UC6 - Use Case 6: Substring Method
 * This application accepts zero or more command-line arguments. 
 * If no arguments are provided, it displays "Hello, World!".
 * If arguments are provided, it uses an enhanced for loop to concatenate 
 * all names with a trailing delimiter (", "), and then uses the substring() 
 * method to remove the trailing delimiter before printing the greeting.
 *
 * @author Antigravity
 * @version 1.0
 */
public class HelloWorldApp_UC6 {

    /**
     * Main method - the entry point of the application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String namesList = "";
            
            // Enhanced for loop to process multiple names
            for (String name : args) {
                namesList += name + ", ";
            }
            
            // Use substring method to remove the trailing delimiter (", ")
            namesList = namesList.substring(0, namesList.length() - 2);
            
            System.out.println("Hello " + namesList);
        }
    }
}
