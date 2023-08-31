package de.myscipper.adventofcode;

public class Rucksack {
    private final String items;
    private final ItemSplitter itemSplitter;
    private final ItemFinder itemFinder;
    private final ItemPrioritizer itemPrioritizer;

    public Rucksack(String items) {
        this.items = items;
        itemSplitter = new ItemSplitter();
        itemFinder = new ItemFinder();
        itemPrioritizer = new ItemPrioritizer();
    }

    public int getPriorityOfMatchingItem() {
        Compartments compartments = itemSplitter.splitItemsIntoCompartments(items);
        String sharedItem = itemFinder.findSharedItem(compartments);

        return itemPrioritizer.getPriorityOf(sharedItem);
    }
}
