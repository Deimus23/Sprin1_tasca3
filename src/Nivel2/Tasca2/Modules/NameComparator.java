package Nivel2.Tasca2.Modules;

import java.util.Comparator;

public class NameComparator implements Comparator<Restaurant> {
    @Override
    public int compare(Restaurant r1, Restaurant r2) {
        return r1.getName().compareToIgnoreCase(r2.getName());
    }
}


