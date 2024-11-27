package Nivel1.Tasca2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list2 = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        int size = list2.size();

        for (int i = 0; i < size; i++) {
            int number;
            number = list2.get(size - i);
            list.add(number);
        }

        ListIterator<Integer> listRead = list.listIterator();
        while (listRead.hasNext()) {
            list2.add(listRead.next());
        }

        for(int i =0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(int i =0; i<list2.size();i++){
            System.out.println(list2.get(i));
        }

    }
}
