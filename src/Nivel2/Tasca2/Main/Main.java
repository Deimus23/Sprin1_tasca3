
package Nivel2.Tasca2.Main;



import Nivel2.Tasca2.Modules.NameComparator;
import Nivel2.Tasca2.Modules.Restaurant;
import Nivel2.Tasca2.Modules.ScoreComparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Restaurant> restaurantSet = new TreeSet<>(new NameComparator());
        System.out.println("Crear un restaurante ordenado por nombre:");
        newRestaurant(restaurantSet);

        System.out.println("Lista de restaurantes ordenados por nombre:");
        for (Restaurant restaurant : restaurantSet) {
            System.out.println(restaurant.getName() + " - " + restaurant.getScore());
        }

        Set<Restaurant> restaurantSetByScore = new TreeSet<>(new ScoreComparator());
        restaurantSetByScore.addAll(restaurantSet); // Añadir todos los restaurantes al nuevo conjunto

        System.out.println("\nLista de restaurantes ordenados por puntuación (descendente):");
        for (Restaurant restaurant : restaurantSetByScore) {
            System.out.println(restaurant.getName() + " - " + restaurant.getScore());
        }
    }

    public static void newRestaurant(Set<Restaurant> restaurantSet) {
        String name;
        double score;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);

        while (!exit) {
            System.out.println("Indique el nombre del restaurante:");
            name = sc.nextLine();

            System.out.println("Indique la puntuación del restaurante:");
            score = sc.nextDouble();
            sc.nextLine();  // Limpiar el buffer

            Restaurant restaurant = new Restaurant(name, score);
            if (restaurantSet.add(restaurant)) {
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
}

