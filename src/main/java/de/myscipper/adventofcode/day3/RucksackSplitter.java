package de.myscipper.adventofcode.day3;

public class RucksackSplitter implements Splitter {
    @Override
    public ItemGroup splitItemsIntoGroup(String items) {
        String[] itemGroups = items.split("\n");
        return new ItemGroup(itemGroups);
    }
}
