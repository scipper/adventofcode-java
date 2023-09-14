package de.myscipper.adventofcode.day3;

import de.myscipper.adventofcode.FileUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class SumPrioritiesTest {

    private CompartmentsSplitter compartmentsSplitter;
    private Finder finder;
    private Prioritizer prioritizer;

    @Before
    public void setUp() {
        compartmentsSplitter = new CompartmentsSplitter();
        finder = new Finder();
        prioritizer = new Prioritizer();
    }

    @Test
    public void shouldFindSharedItemInLongerItemList() {
        int priority = 0;
        ArrayList<Rucksack> rucksacks = new ArrayList<>();
        rucksacks.add(new Rucksack("aa", compartmentsSplitter, finder, prioritizer));
        rucksacks.add(new Rucksack("bb", compartmentsSplitter, finder, prioritizer));
        rucksacks.add(new Rucksack("cc", compartmentsSplitter, finder, prioritizer));
        for (Rucksack rucksack : rucksacks) {
            priority += rucksack.getPriorityOfMatchingItem();
        }

        assertEquals(6, priority);
    }

    @Test
    public void shouldSumUpAllItemsFromFile() throws FileNotFoundException {
        Scanner scanner = FileUtils.getScanner("day3\\items.txt");
        int priority = 0;
        ArrayList<Rucksack> rucksacks = new ArrayList<>();
        while (scanner.hasNext()) {
            rucksacks.add(new Rucksack(scanner.next(), compartmentsSplitter, finder, prioritizer));
        }

        for (Rucksack rucksack : rucksacks) {
            priority += rucksack.getPriorityOfMatchingItem();
        }

        assertEquals(7428, priority);
    }

    @Test
    public void shouldSumUpAllItemsGroupsOfThreeElves() throws FileNotFoundException {
        Scanner scanner = FileUtils.getScanner("day3\\items.txt");
        int priority = 0;
        ArrayList<Rucksack> rucksacks = new ArrayList<>();
        int i = 1;
        StringBuilder currentItemGroup = new StringBuilder();
        while (scanner.hasNext()) {
            currentItemGroup.append(scanner.next());
            currentItemGroup.append("\n");
            if (i % 3 == 0) {
                rucksacks.add(new Rucksack(currentItemGroup.toString(), new RucksackSplitter(), finder, prioritizer));
                currentItemGroup = new StringBuilder();
            }
            i++;
        }

        for (Rucksack rucksack : rucksacks) {
            priority += rucksack.getPriorityOfMatchingItem();
        }

        assertEquals(2650, priority);
    }

}
