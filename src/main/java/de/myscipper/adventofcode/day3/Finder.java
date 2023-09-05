package de.myscipper.adventofcode.day3;

public class Finder {
    public String findSharedItem(ItemGroup itemGroup) {
        String[] firstItems = itemGroup.get(0).split("");
        String sharedItem = null;
        for (String item : firstItems) {
            if (itemGroup.get(1).contains(item)) {
                sharedItem = item;

                break;
            }
        }

        return sharedItem;
    }
}
