import java.io.BufferedReader; // Import statement for BufferedReader
import java.io.FileReader; // Import statement fot FileReader
import java.io.IOException; // Import statement for IOException
import java.math.BigDecimal; // Import statement for BigDecimal

// [Standard] Camel method with an uppercase is used for naming class
public class SenoRuvicChristianMidtermReq {

    /*[Standard] Used 4 spaces for indentation instead of using tabs 
      [Standard] Line length limits to 80 characters only */ 
    public static void main(String[] args) {
        
        /* [Standard] Camel method with a lowercase 
        is used for naming variables */ 
        
        // Variables
        double decX = 0; // Variable for asinh(x)
        String stringX; // Variable for the reader

        // Asks the User to Enter the x value and validates the input
        /* This line of code will read what 
        is inside the input.txt file */ 
        try (BufferedReader reader = new BufferedReader
        (new FileReader("input.txt"))) {
            
            /* [Standard] Add spaces after key 
               words like if, for, and while 
               [Standard] using try-with-resources to 
               ensure resources are closed properly */

            /* This will put anything from the 
            input.txt file to stringx variable */
            stringX = reader.readLine(); 
            if (stringX != null) {

                /* [Standard] Error handling, Catching specific 
                exceptions rather than general exception */
                try {
                    decX = Double.parseDouble(stringX); 
                    if (decX <= 0) {
                        System.out.println
                        ("Invalid Input. Input must be a positive number.");
                        
                        /* This will exit the program if the 
                        input is not positive number */ 
                        return; 
                    }
                } catch (NumberFormatException e) {
                    System.out.println
                    ("Invalid Input. Must be a valid number.");
                    
                    /* This will exit the program when 
                    invalid input is detected */ 
                    return; 
                }
            } else {
                System.out.println("Error! No input found in the file.");
                return; // This will exit the program if input is missing
            }
        } catch (IOException e) {
            System.out.println("Error! Unable to read from file.");
            e.printStackTrace();
            
            /* This will exit the program if there's 
            an error reading from the file */ 
            return; 
        }

        // Calculates hyperbolic arc sinh function
        BigDecimal answer = new BigDecimal(Math.log(decX + Math.sqrt
        (decX * decX + 1)));

        // Outputs the result
        System.out.println("asinh(" + decX + ") = " + answer); 
    }
}