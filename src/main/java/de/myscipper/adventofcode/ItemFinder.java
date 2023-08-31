package de.myscipper.adventofcode;

public class ItemFinder {
    public String findSharedItem(Compartments compartments) {
        String[] firstItems = compartments.getFirst().split("");
        String sharedItem = null;
        for (String item : firstItems) {
            if (compartments.getSecond().contains(item)) {
                sharedItem = item;

                break;
            }
        }

        return sharedItem;
    }
}
