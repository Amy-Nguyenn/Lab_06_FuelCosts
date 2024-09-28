import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallonsInTank = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        String trash = "";
        boolean validInput = false;

        // number of gallons in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
                in.nextLine();
                if (gallonsInTank > 0) {
                    validInput = true;
                } else {
                    System.out.println("The amount of gallons must be greater than 0.");
                    validInput = false;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!validInput);

        validInput = false; // reset for next input

        // get the fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                if (fuelEfficiency > 0) {
                    validInput = true;
                } else {
                    System.out.println("Fuel efficiency must be greater than 0.");
                    validInput = false;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!validInput);

        validInput = false; // reset for next input

        // price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();  // clear buffer
                if (pricePerGallon > 0) {
                    validInput = true;
                } else {
                    System.out.println("Price of gas must be greater than 0.");
                    validInput = false;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!validInput);

        // calculate the cost to drive 100 miles
        double costFor100Miles = (100 / fuelEfficiency) * pricePerGallon;

        // calculate how far the car can go with the gas in the tank
        double maxDistance = gallonsInTank * fuelEfficiency;

        //  output
        System.out.printf("The cost to drive 100 miles is: $%.2f%n", costFor100Miles);
        System.out.printf("The car can go %.2f miles with a full tank of gas.%n", maxDistance);
    }
}