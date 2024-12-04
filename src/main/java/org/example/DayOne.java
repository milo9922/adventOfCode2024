package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class DayOne {

    private static final String INPUT_PATH = "src/main/resources/inputDayOne.txt";

    public static int measureDistance(List<Integer> first, List<Integer> second) {
        Collections.sort(first);
        Collections.sort(second);
        int sum = 0;
        for(int i = 0; i < first.size(); i++) {
            int distance = Math.abs(first.get(i) - second.get(i));
            sum += distance;
        }
        return sum;
    }

    public static int countSimilarityScore(List<Integer> first, List<Integer> second) {
        int score = 0;
        for(int i = 0; i < first.size(); i++) {
            int counter = 0;
            for(int j = 0; j < second.size(); j++) {
                if(first.get(i).equals(second.get(j))) {
                    counter++;
                }
            }
            score += first.get(i) * counter;
        }
        return score;
    }

    public static void readInput(List<Integer> first, List<Integer> second) {
        try {
            List<String> lines = Files.readAllLines(Path.of(INPUT_PATH));
            for(String line : lines) {
                String [] columns = line.split("   ");
                if(columns.length == 2) {
                    first.add(Integer.parseInt(columns[0].trim()));
                    second.add(Integer.parseInt(columns[1].trim()));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
