package de.myscipper.adventofcode.day3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompartmentsSplitterTest {

    private CompartmentsSplitter splitter;

    @Before
    public void setUp() {
        splitter = new CompartmentsSplitter();
    }

    @Test
    public void shouldGetFirstItemOfGroup() {
        ItemGroup itemGroup = splitter.splitItemsIntoGroup("ab");

        assertEquals("a", itemGroup.get(0));
    }

    @Test
    public void shouldGetSecondItemOfGroup() {
        ItemGroup itemGroup = splitter.splitItemsIntoGroup("ab");

        assertEquals("b", itemGroup.get(1));
    }

}
