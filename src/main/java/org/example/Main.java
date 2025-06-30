package org.example;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static float calculatePrice (String status, int age) {
        float price = 0;

        if (status.equalsIgnoreCase("Regular")) {
            if (age < 18) {
                price = 50.00F;
            } else if (age >= 18 && age <= 64) {
                price = 100.00F;
            } else {
                price = 75.00F;
            }
        }else if (status.equalsIgnoreCase("VIP")) {
            if (age < 18) {
                price = 75.00F;
            } else if (age >= 18 && age <= 64) {
                price = 150.00F;
            } else {
                price = 112.50F;
            }
        }else if (status.equalsIgnoreCase("Premium")) {
            if (age < 18) {
                price = 100.00F;
            } else if (age >= 18 && age <= 64) {
                price = 200.00F;
            } else {
                price = 150.00F;
            }
        }

        return price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userAge = 0;

        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String membershipStatus = scanner.next();

        // will not ask for age anymore
        if (!(membershipStatus.equalsIgnoreCase("Regular")
                || membershipStatus.equalsIgnoreCase("VIP")
                || membershipStatus.equalsIgnoreCase("Premium"))) {
            System.out.println("Invalid membership status entered.");
        } else{
            System.out.print("Enter age: ");
            userAge = scanner.nextInt();

            float calculatedPrice = calculatePrice(membershipStatus, userAge);
            System.out.printf("Price: $%.2f%n", calculatedPrice);
        }
    }
}