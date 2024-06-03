import java.io.BufferedReader; // Import statement for BufferedReader
import java.io.FileReader; // Import statement fot FileReader
import java.io.IOException; // Import statement for IOException
import java.math.BigDecimal; // Import statement for BigDecimal

public class Seno_RuvicChristian_MidtermReq {
    public static void main(String[] args) {

        // Variables
        double decx = 0; // Variable for asinh(x)
        String stringx; // Variable for the reader

        // Asks the User to Enter the x value and validates the input
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) { // This line of code will read what is inside the input.txt file
            stringx = reader.readLine(); // This will put anything from the input.txt file to stringx variable
            if (stringx != null) { 
                try {
                    decx = Double.parseDouble(stringx); 
                    if (decx <= 0) {
                        System.out.println("Invalid Input. Input must be a positive number.");
                        return; // This will exit the program if the input is not positive number
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Input. Must be a valid number.");
                    return; // This will exit the program when invalid input is detected
                }
            } else {
                System.out.println("Error! No input found in the file.");
                return; // This wiil exit the program if input is missing
            }
        } catch (IOException e) {
            System.out.println("Error! Unable to read from file.");
            e.printStackTrace();
            return; // This will exit the program if there's an error reading from the file
        }

        // Calculates hyperbolic arc sinh function
        BigDecimal answer = new BigDecimal(Math.log(decx + Math.sqrt(decx * decx + 1)));
        System.out.println("asinh(" + decx + ") = " + answer); // Outputs the result
    }
}
