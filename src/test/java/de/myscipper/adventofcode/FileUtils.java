package de.myscipper.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileUtils {
    public static Scanner getScanner(String file) throws FileNotFoundException {
        String filePath = new File("").getAbsolutePath();
        return new Scanner(new FileReader(filePath + "\\src\\test\\java\\de\\myscipper\\adventofcode\\" + file));
    }
}