package de.myscipper.adventofcode.day3;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class SumPrioritiesTest {

    @Before
    public void setUp() {
    }

    @Test
    public void shouldFindSharedItemInLongerItemList() {
        int priority = 0;
        ArrayList<Rucksack> rucksacks = new ArrayList<>();
        rucksacks.add(new Rucksack("aa"));
        rucksacks.add(new Rucksack("bb"));
        rucksacks.add(new Rucksack("cc"));
        for (Rucksack rucksack : rucksacks) {
            priority += rucksack.getPriorityOfMatchingItem();
        }

        assertEquals(6, priority);
    }

    @Test
    public void shouldSumUpAllItemsFromFile() throws FileNotFoundException {
        String filePath = new File("").getAbsolutePath();
        Scanner in = new Scanner(new FileReader(filePath + "\\src\\test\\java\\de\\myscipper\\adventofcode\\day3\\items.txt"));
        int priority = 0;
        ArrayList<Rucksack> rucksacks = new ArrayList<>();
        while (in.hasNext()) {
            rucksacks.add(new Rucksack(in.next()));
        }

        for (Rucksack rucksack : rucksacks) {
            priority += rucksack.getPriorityOfMatchingItem();
        }

        assertEquals(7428, priority);
    }

}
