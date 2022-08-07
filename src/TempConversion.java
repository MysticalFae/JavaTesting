import java.util.Scanner;

public class TempConversion {

    static Scanner userTemp = new Scanner(System.in);

    public static void main(String[] args) {

        double tempC = 0;

        System.out.print("Enter in a temp in Celcius: ");

        if (userTemp.hasNextDouble()) {
            tempC = userTemp.nextDouble();

        }

        double tempF = tempC * 1.8 + 32;

        System.out.println();
        System.out.println("The temp " + tempC + " in Farhiet is " + tempF);

    }
}