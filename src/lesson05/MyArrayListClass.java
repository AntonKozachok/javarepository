package lesson05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> carBrands = new ArrayList<String>();
        carBrands.add("Porsche");
        carBrands.add("Ferrari");
        carBrands.add("BMW");
        carBrands.add("Audi");
        carBrands.add("Honda");
        carBrands.add("Toyota");

        carBrands.remove("Ferrari");
        if (!carBrands.contains("Ferrari"))
        System.out.println("No Ferrari in the list"+carBrands);

        Iterator<String> iterator = carBrands.iterator();
        while (iterator.hasNext()) {
            System.out.println("unsorted list:"+ iterator.next());
        }

        Collections.sort(carBrands);
        while (iterator.hasNext()) System.out.println("sorted list" + iterator.next());
    }
}
