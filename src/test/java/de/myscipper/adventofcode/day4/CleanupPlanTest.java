package de.myscipper.adventofcode.day4;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CleanupPlanTest {

    private CleanupPlan cleanupPlan;

    @Before
    public void setUp() {
        cleanupPlan = new CleanupPlan();
    }

    @Test
    public void shouldGetCompleteListOfRange() {
        List<Integer> listOfSections = cleanupPlan.getListOfSectionFromRange("1-3");

        assertEquals(Integer.valueOf(1), listOfSections.get(0));
        assertEquals(Integer.valueOf(2), listOfSections.get(1));
        assertEquals(Integer.valueOf(3), listOfSections.get(2));
    }

    @Test
    public void shouldGetOnlyOneNumberForShortRange() {
        List<Integer> listOfSections = cleanupPlan.getListOfSectionFromRange("3-3");

        assertEquals(Integer.valueOf(3), listOfSections.get(0));
        assertEquals(1, listOfSections.size());
    }

    @Test
    public void shouldSplitPair() {
        List<String> pair = cleanupPlan.splitPair("1-3,4-6");

        assertEquals("1-3", pair.get(0));
        assertEquals("4-6", pair.get(1));
    }

}
