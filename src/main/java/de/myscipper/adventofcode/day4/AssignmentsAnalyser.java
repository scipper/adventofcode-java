package de.myscipper.adventofcode.day4;

import java.util.List;

public class AssignmentsAnalyser {

    private final CleanupPlan cleanupPlan;

    public AssignmentsAnalyser(CleanupPlan cleanupPlan) {
        this.cleanupPlan = cleanupPlan;
    }

    public boolean hasOneRangeFullyCoveredTheOther(String pair) {
        List<String> sectionAssignments = cleanupPlan.splitPair(pair);
        List<Integer> firstList = cleanupPlan.getListOfSectionFromRange(sectionAssignments.get(0));
        List<Integer> secondList = cleanupPlan.getListOfSectionFromRange(sectionAssignments.get(1));

        if (firstList.size() > secondList.size()) {
            List<Integer> tempList = firstList;
            firstList = secondList;
            secondList = tempList;
        }

        boolean overlap = true;

        for (Integer section : firstList) {
            if (!secondList.contains(section)) {
                overlap = false;

                break;
            }
        }

        return overlap;
    }
}
