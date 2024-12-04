import org.example.DayOne;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.DayOne.measureDistance;
import static org.example.DayOne.readInput;
import static org.junit.jupiter.api.Assertions.*;

public class DayOneTest {

    @Test
    void shouldMeasureCorrectDistanceForTwoLists() {
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        readInput(first, second);

        int result = measureDistance(first, second);

        assertEquals(1320851, result);
    }

    @Test
    void shouldCountCorrectSimilarityScoreForTestInput() {
        List<Integer> first = new ArrayList<>(Arrays.asList(3, 4, 2, 1, 3, 3));
        List<Integer> second = new ArrayList<>(Arrays.asList(4,3,5,3,9,3));

        int result = DayOne.countSimilarityScore(first, second);

        assertEquals(31, result);
    }

    @Test
    void shouldCountCorrectSimilarityScoreForAdventOfCodeFileInput() {
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        readInput(first, second);

        int result = DayOne.countSimilarityScore(first, second);

        assertEquals(26859182, result);
    }
}
