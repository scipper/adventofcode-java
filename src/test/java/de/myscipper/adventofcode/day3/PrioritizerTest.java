package de.myscipper.adventofcode.day3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrioritizerTest {

    private Prioritizer prioritizer;

    @Before
    public void setUp() {
        prioritizer = new Prioritizer();
    }

    @Test
    public void shouldGetLowestPriorityOfLowerCaseItem() {
        int priority = prioritizer.getPriorityOf("a");

        assertEquals(priority, 1);
    }

    @Test
    public void shouldGetHighestPriorityOfLowerCaseItem() {
        int priority = prioritizer.getPriorityOf("z");

        assertEquals(priority, 26);
    }

    @Test
    public void shouldGetLowestPriorityOfUpperCaseItem() {
        int priority = prioritizer.getPriorityOf("A");

        assertEquals(priority, 27);
    }

    @Test
    public void shouldGetHighestPriorityOfUpperCaseItem() {
        int priority = prioritizer.getPriorityOf("Z");

        assertEquals(priority, 52);
    }

}
