package de.myscipper.adventofcode.day3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompartmentsSplitterTest {

    private CompartmentsSplitter compartmentsSplitter;

    @Before
    public void setUp() {
        compartmentsSplitter = new CompartmentsSplitter();
    }

    @Test
    public void shouldGetFirstItemOfGroup() {
        ItemGroup itemGroup = compartmentsSplitter.splitItemsIntoGroup("ab");

        assertEquals("a", itemGroup.get(0));
    }

    @Test
    public void shouldGetSecondItemOfGroup() {
        ItemGroup itemGroup = compartmentsSplitter.splitItemsIntoGroup("ab");

        assertEquals("b", itemGroup.get(1));
    }

}
