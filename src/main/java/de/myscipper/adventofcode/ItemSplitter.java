package de.myscipper.adventofcode;

public class ItemSplitter {
    public Compartments splitItemsIntoCompartments(String items) {
        int length = items.length();
        String first = items.substring(0, length / 2);
        String second = items.substring(length / 2);

        return new Compartments(first, second);
    }
}
