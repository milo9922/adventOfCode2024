package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DayThree {

    private static final String INPUT_PATH = "src/main/resources/inputDayThree.txt";

    public static long count(String input) {
        Pattern pattern = Pattern.compile("\\bmul\\(([1-9]\\d{0,2}),([1-9]\\d{0,2})\\)");
        Matcher matcher = pattern.matcher(input);
        long sum = 0;
        while(matcher.find()) {
            String operation = matcher.group();
            String[] numbers = operation.substring(4, operation.length() - 1).split(",");
            int multiplicand = Integer.parseInt(numbers[0]);
            int multiplier = Integer.parseInt(numbers[1]);
            sum += (long) multiplicand * multiplier;
        }
        return sum;
    }

    public static String readInputData() {
        Path filePath = Path.of(INPUT_PATH);
        StringBuilder sb = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                sb.append(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
