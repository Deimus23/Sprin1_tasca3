package Nivel2.Tasca1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashSet<Restaurant> hashSet = new HashSet<>();
        System.out.println("Crear un restaurante");
        newRestaurant(hashSet);

        // Ejemplo de uso de searchRestaurant
        String name = "Nombre del Restaurante";
        String result = searchRestaurant(hashSet, name);
        System.out.println(result != null ? "Restaurante encontrado: " + result : "Restaurante no encontrado");
    }

    public static void newRestaurant(HashSet<Restaurant> hashSet) {
        String name;
        double score;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);

        while (!exit) {
            System.out.println("Indique el nombre del restaurante:");
            name = sc.nextLine();

            System.out.println("Indique la puntuación del restaurante:");
            score = sc.nextDouble();
            sc.nextLine();

            Restaurant restaurant = new Restaurant(name, score);
            if (hashSet.add(restaurant)) {
                System.out.println("Restaurante agregado.");
            } else {
                System.out.println("El restaurante ya existe.");
            }

            System.out.println("¿Desea agregar otro restaurante? (si/no):");
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("no")) {
                exit = true;
            }
        }
    }

    public static String searchRestaurant(HashSet<Restaurant> hashSet, String name) {
        for (Restaurant restaurant : hashSet) {
            if (name.equalsIgnoreCase(restaurant.getName())) {
                return restaurant.getName();
            }
        }
        return null;
    }
}


