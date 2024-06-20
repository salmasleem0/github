import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SUV suvCar = new SUV("Toyota", "Land Cruiser", 2021);
        sedan sedanCar = new sedan("Honda", "Accord", 2020);
        RentalSystem rentalSystem = new RentalSystem(suvCar, sedanCar);
        rentalSystem.rentCar(1);

        while (true) {
            System.out.println("Choose an option (1: Check SUV status, 2: Check Sedan status, 3: Rent SUV, 4: Rent Sedan, 5: Return SUV, 6: Return Sedan, 7: Calculate cost, 0: Exit): ");
            int choice = scanner.nextInt();
            if (choice == 1 || choice == 2) {
                rentalSystem.checkCarStatus(choice);
            } else if (choice == 3 || choice == 4) {
                rentalSystem.rentCar(choice - 2);
            } else if (choice == 5 || choice == 6) {
                rentalSystem.returnCar(choice - 4);
            } else if (choice == 7) {
                System.out.println("Enter car type (1: SUV, 2: Sedan): ");
                int carType = scanner.nextInt();
                System.out.println("Enter number of days: ");
                int days = scanner.nextInt();
                rentalSystem.calculateRentalCost(carType, days);
            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Invalid choice. Please choose again.");
            }
        }

        scanner.close();
    }
}