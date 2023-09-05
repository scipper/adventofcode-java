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

        assertEquals(1, priority);
    }

    @Test
    public void shouldGetHighestPriorityOfLowerCaseItem() {
        int priority = prioritizer.getPriorityOf("z");

        assertEquals(26, priority);
    }

    @Test
    public void shouldGetLowestPriorityOfUpperCaseItem() {
        int priority = prioritizer.getPriorityOf("A");

        assertEquals(27, priority);
    }

    @Test
    public void shouldGetHighestPriorityOfUpperCaseItem() {
        int priority = prioritizer.getPriorityOf("Z");

        assertEquals(52, priority);
    }

}
