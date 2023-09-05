package de.myscipper.adventofcode.day3;

public class Finder {
    public String findSharedItem(ItemGroup itemGroup) {
        String[] firstItems = itemGroup.get(0).split("");
        String sharedItem = null;
        String second = itemGroup.get(1);
        String third = itemGroup.get(2);
        for (String item : firstItems) {
            if (third != null) {
                if (second.contains(item) && third.contains(item)) {
                    sharedItem = item;

                    break;
                }
            } else {
                if (second.contains(item)) {
                    sharedItem = item;

                    break;
                }
            }

        }

        return sharedItem;
    }
}
