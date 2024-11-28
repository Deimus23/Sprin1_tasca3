package Nivel2.Tasca2.Modules;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Restaurant> {
    @Override
    public int compare(Restaurant r1, Restaurant r2) {
        return Double.compare(r2.getScore(), r1.getScore());
    }
}

