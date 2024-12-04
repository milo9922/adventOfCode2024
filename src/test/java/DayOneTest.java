import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.example.DayOne.measureDistance;
import static org.example.DayOne.readInput;
import static org.junit.jupiter.api.Assertions.*;

public class DayOneTest {

    @Test
    void shouldMeasureCorrectDistanceForTwoLists() {
        Path filePath = Path.of("src/main/resources/inputDayOne.txt");
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        readInput(first, second, filePath);

        int result = measureDistance(first, second);

        assertEquals(1320851, result);
    }
}
