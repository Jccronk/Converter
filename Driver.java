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
                System.out.println(unit + " kilograms = " + unit * 2.20462 + " pounds");
                break;
            case "pounds":
                System.out.println(unit + " pounds = " + unit / 2.20462 + " kilograms");
                break;
            case "celsius":
                System.out.println(unit + " Celsius = " + (unit * 9 / 5) + 32 + " Fahrenheit");
                break;
            case "fahrenheit":
                System.out.println(unit + " degrees Fahrenheit = " + (unit - 32) * (5.0 / 9.0) + " degrees Celsius");
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
    }
}