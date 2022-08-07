import java.util.Scanner;

public class TempConversion {

    static Scanner userTemp = new Scanner(System.in);
    static Scanner userUnit = new Scanner(System.in);

    public static void main(String[] args) {

        double tempC = 0;
        double tempF = 0;
        int unit = 0;

        System.out.print("Enter the units of the orginial temp (1 = C, 2 = F): ");

        if (userUnit.hasNextInt()) {
            unit = userUnit.nextInt();
        }

        if (unit == 1) {

            System.out.print("Enter in a temp in Celcius: ");

            if (userTemp.hasNextDouble()) {
                tempC = userTemp.nextDouble();

            }

            tempF = tempC * 1.8 + 32;

            System.out.println();
            System.out.println("The temp " + tempC + " in Farhiet is " + tempF);

        } else if (unit == 2) {

            System.out.println("Enter the temp in Farhiet: ");

            if (userTemp.hasNextDouble()) {
                tempF = userTemp.nextDouble();
            }

            tempC = (tempF - 32) * .5556;

            System.out.println();
            System.out.println("The temp " + tempF + " in Celcius is " + tempC);

        } else {
            System.out.println("Make sure you enter a 1 or 2!");

        }

    }
}