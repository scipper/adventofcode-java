package de.myscipper.adventofcode.day3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SplitterTest {

    private Splitter splitter;

    @Before
    public void setUp() {
        splitter = new Splitter();
    }

    @Test
    public void shouldGetFirstCompartmentOfItems() {
        ItemGroup itemGroup = splitter.splitItemsIntoGroup("ab");

        assertEquals(itemGroup.get(0), "a");
    }

    @Test
    public void shouldGetSecondCompartmentOfItems() {
        ItemGroup itemGroup = splitter.splitItemsIntoGroup("ab");

        assertEquals(itemGroup.get(1), "b");
    }

}
