package de.myscipper.adventofcode.day3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RucksackSplitterTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldSplitItemsByNewline() {
        RucksackSplitter splitter = new RucksackSplitter();

        ItemGroup itemGroup = splitter.splitItemsIntoGroup("ab\ncd\nef\n");

        assertEquals("ab", itemGroup.get(0));
        assertEquals("cd", itemGroup.get(1));
        assertEquals("ef", itemGroup.get(2));
    }

}
