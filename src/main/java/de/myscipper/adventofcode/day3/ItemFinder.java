package de.myscipper.adventofcode.day3;

public class ItemFinder {
    public String findSharedItem(Compartments compartments) {
        String[] firstItems = compartments.first().split("");
        String sharedItem = null;
        for (String item : firstItems) {
            if (compartments.second().contains(item)) {
                sharedItem = item;

                break;
            }
        }

        return sharedItem;
    }
}
