package Nivel1.Tasca1.Main;

import Nivel1.Tasca1.Modules.Month;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> year = new ArrayList<>();

        year.add(new Month("January"));
        year.add(new Month("February"));
        year.add(new Month("March"));
        year.add(new Month("April"));
        year.add(new Month("May"));
        year.add(new Month("June"));
        year.add(new Month("July"));
        year.add(new Month("September"));
        year.add(new Month("October"));
        year.add(new Month("November"));
        year.add(new Month("December"));
        int size = year.size();

        for (int i = 0; i < size; i++) {
            System.out.println("Year List: " + year.get(i).getName());
        }

        year.add(7, new Month("Agust"));
        size = year.size();

        for (int i = 0; i < size; i++) {
            System.out.println("Updated Year List: " + year.get(i).getName());
        }
        LinkedHashSet<Month> yearHas = new LinkedHashSet<>();
        yearHas.addAll(year);

        Iterator<Month> it = yearHas.iterator();

        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
    }

}