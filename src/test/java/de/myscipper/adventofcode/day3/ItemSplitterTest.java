package de.myscipper.adventofcode.day3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemSplitterTest {

    private ItemSplitter itemSplitter;

    @Before
    public void setUp() {
        itemSplitter = new ItemSplitter();
    }

    @Test
    public void shouldGetFirstCompartmentOfItems() {
        Compartments compartments = itemSplitter.splitItemsIntoCompartments("ab");

        assertEquals(compartments.first(), "a");
    }

    @Test
    public void shouldGetSecondCompartmentOfItems() {
        Compartments compartments = itemSplitter.splitItemsIntoCompartments("ab");

        assertEquals(compartments.second(), "b");
    }

}
