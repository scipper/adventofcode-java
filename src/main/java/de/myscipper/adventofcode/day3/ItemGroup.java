package de.myscipper.adventofcode.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemGroup {
    private final List<String> items;

    public ItemGroup(String... items) {
        this.items = new ArrayList<>();
        this.items.addAll(Arrays.asList(items));
    }

    public String get(int index) {
        return this.items.get(index);
    }

}
