package de.myscipper.adventofcode.day3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemFinderTest {

    private ItemFinder itemFinder;

    @Before
    public void setUp() {
        itemFinder = new ItemFinder();
    }

    @Test
    public void shouldFindTheLetterAInBothCompartments() {
        String sharedItem = itemFinder.findSharedItem(new Compartments("a", "a"));

        assertEquals(sharedItem, "a");
    }

    @Test
    public void shouldFindSharedItemInLongerItemList() {
        String sharedItem = itemFinder.findSharedItem(new Compartments("ab", "bc"));

        assertEquals(sharedItem, "b");
    }

}
