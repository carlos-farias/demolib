package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your birth date (YYYY-MM-DD): ");
        String birthDateString = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(birthDateString, DateTimeFormatter.ISO_DATE);

        AgeCalculator ageCalculator = new AgeCalculator();
        LifeExpectancyCalculator lifeExpectancyCalculator = new LifeExpectancyCalculator();

        long daysAlive = ageCalculator.calculateAgeInDays(birthDate);
        long daysLeft = lifeExpectancyCalculator.calculateDaysLeft(birthDate);

        System.out.printf("%s, you have been alive for %d days.%n", name, daysAlive);
        System.out.printf("You have %d days left to live (assuming you live 100 years).%n", daysLeft);
    }
}
