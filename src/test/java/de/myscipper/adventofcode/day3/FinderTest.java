package de.myscipper.adventofcode.day3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FinderTest {

    private Finder finder;

    @Before
    public void setUp() {
        finder = new Finder();
    }

    @Test
    public void shouldFindTheLetterAAsSharedItem() {
        String sharedItem = finder.findSharedItem(new ItemGroup("a", "a"));

        assertEquals(sharedItem, "a");
    }

    @Test
    public void shouldFindSharedItemInLongerItemList() {
        String sharedItem = finder.findSharedItem(new ItemGroup("ab", "bc"));

        assertEquals(sharedItem, "b");
    }

}
