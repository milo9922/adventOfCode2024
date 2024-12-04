package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class DayTwo {

    private static final String INPUT_PATH =  "src/main/resources/inputDayTwo.txt";

    public static int countSafeReports(List<List<Integer>> allReports) {
       return (int) allReports.stream()
               .filter(DayTwo::isReportSafe)
               .count();
    }

    private static boolean isReportSafe(List<Integer> report) {
        int firstDiff = report.get(1) - report.get(0);
        if (firstDiff == 0) {
            return false;
        }

        for (int i = 0; i < report.size() - 1; i++) {
            int diff = report.get(i + 1) - report.get(i);
            boolean isDiffSafe = Math.abs(diff) <= 3;
            if(!isDiffSafe) {
                return false;
            }
            if (diff > 0 && firstDiff < 0) {
                return false;
            } else if (diff < 0 && firstDiff > 0) {
                return false;
            } else if (diff == 0) {
                return false;
            }
        }
        return true;
    }

    public static void insertInputData(List<List<Integer>> reports) {
        Path filePath = Path.of(INPUT_PATH);
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                String[] columns = line.split(" ");
                List<Integer> report = Stream.of(columns).map((Integer::parseInt)).toList();
                reports.add(report);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
