package lesson05;

import java.util.ArrayList;
import java.util.Collections;

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

        System.out.println("unsorted list:");
        for (String carBrand : carBrands) {
            System.out.println("-"+carBrand);
        }

        Collections.sort(carBrands);
        System.out.println("sorted list");
        for (String brand:carBrands) {
            System.out.println("-"+brand);
        }
    }
}
