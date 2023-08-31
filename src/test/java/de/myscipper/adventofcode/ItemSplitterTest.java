package de.myscipper.adventofcode;

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

        assertEquals(compartments.getFirst(), "a");
    }

    @Test
    public void shouldGetSecondCompartmentOfItems() {
        Compartments compartments = itemSplitter.splitItemsIntoCompartments("ab");

        assertEquals(compartments.getSecond(), "b");
    }

}
