package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DayOne {

    public static void run() {
        Path filePath = Path.of("src/main/resources/inputDayOne.txt");
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        readInput(first, second, filePath);
        System.out.println(measureDistance(first, second));
    }

    private static int measureDistance(List<Integer> first, List<Integer> second) {
        Collections.sort(first);
        Collections.sort(second);
        int sum = 0;
        for(int i = 0; i < first.size(); i++) {
            int distance = Math.abs(first.get(i) - second.get(i));
            sum += distance;
        }
        return sum;
    }

    private static void readInput(List<Integer> first, List<Integer> second, Path filePath) {
        try {
            List<String> lines = Files.readAllLines(filePath);
            for(String line : lines) {
                StringBuilder sb = new StringBuilder();
                String [] columns = line.split("   ");
                if(columns.length == 2) {
                    first.add(Integer.parseInt(columns[0].trim()));
                    second.add(Integer.parseInt(columns[1].trim()));
                    sb.append(columns[0].trim());
                    sb.append("\t");
                    sb.append(columns[1].trim());
                    System.out.println(sb.toString());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
