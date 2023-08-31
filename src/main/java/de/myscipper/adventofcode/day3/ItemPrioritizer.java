package de.myscipper.adventofcode.day3;

import java.nio.charset.StandardCharsets;

public class ItemPrioritizer {
    public int getPriorityOf(String item) {
        int priority = item.getBytes(StandardCharsets.UTF_8)[0] - 96;
        if (priority < 0) {
            priority += 58;
        }
        return priority;
    }
}
