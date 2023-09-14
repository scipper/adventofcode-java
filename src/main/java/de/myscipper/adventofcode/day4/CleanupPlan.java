package de.myscipper.adventofcode.day4;

import java.util.ArrayList;
import java.util.List;

public class CleanupPlan {
    public List<Integer> getListOfSectionFromRange(String range) {
        String[] startAndEnd = range.split("-");
        int start = Integer.parseInt(startAndEnd[0]);
        int end = Integer.parseInt(startAndEnd[1]);
        List<Integer> listOfSections = new ArrayList<>();

        for (int section = start; section <= end; section++) {
            listOfSections.add(section);
        }

        return listOfSections;
    }

    public List<String> splitPair(String pair) {
        return List.of(pair.split(","));
    }

}
