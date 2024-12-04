import org.example.DayTwo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DayTwoTest {

    @Test
    void shouldReturnZeroForReportsWithLevelsDecreasingByMoreThanThree() {
        List<List<Integer>> reports = new ArrayList<>();
        reports.add(Arrays.asList(9,7,6,2,1));
        reports.add(Arrays.asList(9,8,4,2,1));
        reports.add(Arrays.asList(55,42,33,22,11));

        int result = DayTwo.countSafeReports(reports);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnZeroForReportsWithLevelsIncreasingByMoreThanThree() {
        List<List<Integer>> reports = new ArrayList<>();
        reports.add(Arrays.asList(1,2,6,8,11));
        reports.add(Arrays.asList(3,55,66,69,70));
        reports.add(Arrays.asList(2,12,15,16,17));
        reports.add(Arrays.asList(2,4,5,6,17));

        int result = DayTwo.countSafeReports(reports);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnNumberOfCorrectIncreasingReportsForOnlyCorrectInput() {
        List<List<Integer>> reports = new ArrayList<>();
        reports.add(Arrays.asList(1,2,5,6,8));
        reports.add(Arrays.asList(3,5,6,8,9));
        reports.add(Arrays.asList(23,24,25,26,27));
        reports.add(Arrays.asList(2,5,6,8,10));
        reports.add(Arrays.asList(2,4,5,6,7));

        int result = DayTwo.countSafeReports(reports);

        assertEquals(5, result);
    }

    @Test
    void shouldReturnNumberOfCorrectDecreasingReportsForOnlyCorrectInput() {
        List<List<Integer>> reports = new ArrayList<>();
        reports.add(Arrays.asList(1,2,5,6,8));
        reports.add(Arrays.asList(3,5,6,8,9));
        reports.add(Arrays.asList(23,24,25,26,27));
        reports.add(Arrays.asList(2,5,6,8,10));
        reports.add(Arrays.asList(2,4,5,6,7));

        int result = DayTwo.countSafeReports(reports);

        assertEquals(5, result);
    }

    @Test
    void shouldCountOnlyCorrectReportsFromMixedInput() {
        List<List<Integer>> reports = new ArrayList<>();
        reports.add(Arrays.asList(1,2,5,6,8));
        reports.add(Arrays.asList(10,9,8,7,6));
        reports.add(Arrays.asList(23,24,25,26,27,29,31));
        reports.add(Arrays.asList(2,5,6,6,7));
        reports.add(Arrays.asList(2,3,6,5,4,2));
        reports.add(Arrays.asList(2,4,5,6,7,7, 9, 9, 10, 11));
        reports.add(Arrays.asList(1, 1, 1, 1, 1, 1));
        reports.add(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        int result = DayTwo.countSafeReports(reports);

        assertEquals(4, result);
    }

    @Test
    void shouldCountAndReturnNumberOfSafeReportsFromAdventOfCodeFileInput() {
        List<List<Integer>> reports = new ArrayList<>();

        DayTwo.insertInputData(reports);
        int result = DayTwo.countSafeReports(reports);

        assertEquals(549, result);
    }

}
