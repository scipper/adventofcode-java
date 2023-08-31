package de.myscipper.adventofcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemPrioritizerTest {

    private ItemPrioritizer itemPrioritizer;

    @Before
    public void setUp() {
        itemPrioritizer = new ItemPrioritizer();
    }

    @Test
    public void shouldGetLowestPriorityOfLowerCaseItem() {
        int priority = itemPrioritizer.getPriorityOf("a");

        assertEquals(priority, 1);
    }

    @Test
    public void shouldGetHighestPriorityOfLowerCaseItem() {
        int priority = itemPrioritizer.getPriorityOf("z");

        assertEquals(priority, 26);
    }

    @Test
    public void shouldGetLowestPriorityOfUpperCaseItem() {
        int priority = itemPrioritizer.getPriorityOf("A");

        assertEquals(priority, 27);
    }

    @Test
    public void shouldGetHighestPriorityOfUpperCaseItem() {
        int priority = itemPrioritizer.getPriorityOf("Z");

        assertEquals(priority, 52);
    }

}
