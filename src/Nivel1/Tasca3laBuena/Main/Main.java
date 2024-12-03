package Nivel1.Tasca3laBuena.Main;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> countriesMap = new HashMap<>();
        String inputFilePath = "src/Nivel1/Tasca3/Files/countries.txt";
        int points = 0;


        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    countriesMap.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Random random = new Random();
        String[] countries = countriesMap.keySet().toArray(new String[0]);


        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(countries.length);
            String country = countries[randomIndex];
            String capital = countriesMap.get(country);

            System.out.println("What is the capital of " + country + "?");
            String choose = sc.nextLine();

            if (choose.equalsIgnoreCase(capital)) {
                System.out.println("Your answer is correct!");
                points++;
            } else {
                System.out.println("Your answer is wrong. The correct answer is " + capital + ".");
            }
        }

        System.out.println("You scored " + points + " points.");
    }
}
