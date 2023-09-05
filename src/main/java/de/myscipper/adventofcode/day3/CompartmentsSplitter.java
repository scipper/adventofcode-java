package de.myscipper.adventofcode.day3;

public class CompartmentsSplitter implements Splitter {
    @Override
    public ItemGroup splitItemsIntoGroup(String items) {
        int length = items.length();
        String first = items.substring(0, length / 2);
        String second = items.substring(length / 2);

        return new ItemGroup(first, second);
    }
}
