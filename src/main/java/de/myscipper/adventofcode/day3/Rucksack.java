package de.myscipper.adventofcode.day3;

public class Rucksack {
    private final String items;
    private final Splitter splitter;
    private final Finder finder;
    private final Prioritizer prioritizer;

    public Rucksack(String items, Splitter splitter, Finder finder, Prioritizer prioritizer) {
        this.items = items;
        this.splitter = splitter;
        this.finder = finder;
        this.prioritizer = prioritizer;
    }

    public int getPriorityOfMatchingItem() {
        ItemGroup itemGroup = splitter.splitItemsIntoGroup(items);
        String sharedItem = finder.findSharedItem(itemGroup);

        return prioritizer.getPriorityOf(sharedItem);
    }
}
