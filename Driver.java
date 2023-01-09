import java.util.Scanner;

/**
 * Driver
 */
public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer and a string separated by a comma: ");
        System.out.println("Units available are feet, inches, kilograms, pounds, celcius, fahrenheit ");

        int unit = -1;
        String type = "";

        try {
            String line = scanner.nextLine().trim();
            String[] parts = line.split(",");
            unit = Integer.parseInt(parts[0].trim());
            type = parts[1].trim();
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter an integer followed by a string.");
        }

        if (unit == -1) {
            throw new IllegalArgumentException("Invalid value for 'unit': " + unit);
        }

        convertAndPrint(unit, type);
    }

    private static void convertAndPrint(int unit, String type) {
        switch (type) {
            case "feet":
                System.out.println(unit + " feet = " + unit * 12 + " inches");
                break;
            case "inches":
                System.out.println(unit + " inches = " + (double) unit / 12 + " feet");
                break;
            case "kilograms":
                // Code to handle "kilograms" goes here
                break;
            case "pounds":
                // Code to handle "pounds" goes here
                break;
            case "celsius":
                // Code to handle "celsius" goes here
                break;
            case "fahrenheit":
                // Code to handle "fahrenheit" goes here
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
    }
}