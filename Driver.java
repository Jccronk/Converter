import java.util.Scanner;

/**
 * Driver
 */
public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer and a string separated by a comma: ");
        System.out.println("Units available are feet, inches, kilograms, pounds, celcius, fahrenheit ");

        double unit = Integer.MIN_VALUE;
        String type = "";

        try {
            String line = scanner.nextLine().trim();
            String[] parts = line.split(",");
            unit = Double.parseDouble(parts[0].trim());
            type = parts[1].trim();
            scanner.close();
            convertAndPrint(unit, type);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter an integer followed by a string.");
        }

    }

    private static void convertAndPrint(Double unit, String type) {
        switch (type) {
            case "feet":
                System.out.println(unit + " feet = " + unit * 12 + " inches");
                break;
            case "inches":
                System.out.println(unit + " inches = " + String.format("%.2f", (double) unit / 12) + " feet");
                break;
            case "kilograms":
                System.out.println(unit + " kilograms = " + String.format("%.2f", unit * 2.20462) + " pounds");
                break;
            case "pounds":
                System.out.println(unit + " pounds = " + String.format("%.2f", unit / 2.20462) + " kilograms");
                break;
            case "celsius":
                System.out.println(unit + " Celsius = " + String.format("%.2f", (unit * 9 / 5) + 32) + " Fahrenheit");
                break;
            case "fahrenheit":
                System.out.println(unit + " degrees Fahrenheit = " + String.format("%.2f", (unit - 32) * (5.0 / 9.0))
                        + " degrees Celsius");
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
    }
}