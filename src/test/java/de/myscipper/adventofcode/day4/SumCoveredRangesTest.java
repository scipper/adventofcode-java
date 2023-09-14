package de.myscipper.adventofcode.day4;

import de.myscipper.adventofcode.FileUtils;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class SumCoveredRangesTest {

    @Test
    public void shouldSumUpAllCoveredRanges() throws FileNotFoundException {
        AssignmentsAnalyser assignmentsAnalyser = new AssignmentsAnalyser(new CleanupPlan());
        Scanner scanner = FileUtils.getScanner("day4\\input.txt");
        int sum = 0;
        while (scanner.hasNext()) {
            if (assignmentsAnalyser.hasOneRangeFullyCoveredTheOther(scanner.next())) {
                sum++;
            }
        }

        assertEquals(582, sum);
    }

}
