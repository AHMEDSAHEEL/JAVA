import java.text.DecimalFormat;

public class formatInJava{
    public static void main(String[] args) {

        //method 1: 
        // double number = 3.455;

        // // Use DecimalFormat
        // DecimalFormat df = new DecimalFormat("0.00");

        // // Format as a String
        // String formatted = df.format(number);

        // // Convert back to double
        // double formattedNumber = Double.parseDouble(formatted);

        // System.out.println(formattedNumber); // Output: 3.46

        
        //method 2:

        double number = 3.455;

        // Format to 2 decimal places as a String
        String formatted = String.format("%.2f", number);

        // Convert back to double
        double formattedNumber = Double.parseDouble(formatted);

        System.out.println(formattedNumber); // Output: 3.46

    }
}
