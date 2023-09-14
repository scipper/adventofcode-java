package de.myscipper.adventofcode.day4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AssignmentsAnalyserTest {

    private AssignmentsAnalyser assignmentsAnalyser;

    @Before
    public void setUp() {
        assignmentsAnalyser = new AssignmentsAnalyser(new CleanupPlan());
    }

    @Test
    public void shouldDetectCoverageWhenSecondListIsBigger() {
        boolean completeCover = assignmentsAnalyser.hasOneRangeFullyCoveredTheOther("2-3,1-4");

        assertTrue(completeCover);
    }

    @Test
    public void shouldDetectCoverageWhenFirstListIsBigger() {
        boolean completeCover = assignmentsAnalyser.hasOneRangeFullyCoveredTheOther("1-4,2-3");

        assertTrue(completeCover);
    }

    @Test
    public void shouldDetectCoverageWhenListsEndWithTheSameNumber() {
        boolean completeCover = assignmentsAnalyser.hasOneRangeFullyCoveredTheOther("3-3,2-3");

        assertTrue(completeCover);
    }

    @Test
    public void shouldDetectCoverageWhenListsStartWithTheSameNumber() {
        boolean completeCover = assignmentsAnalyser.hasOneRangeFullyCoveredTheOther("1-4,1-3");

        assertTrue(completeCover);
    }

    @Test
    public void shouldNotDetectCoverage() {
        boolean completeCover = assignmentsAnalyser.hasOneRangeFullyCoveredTheOther("51-80,50-51");

        assertFalse(completeCover);
    }

}
