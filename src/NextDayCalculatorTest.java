import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("Case 1-1-2018")
    void getNextDayCaseJun1st() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2-1-2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case 31-1-2018")
    void getNextDayCase31() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1-2-2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case 30-4-2018")
    void getNextDayCase30April() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1-5-2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case 28-2-2018")
    void getNextDayCase28Fer() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1-3-2018";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case 29-2-2020")
    void getNextDayCase29Fer() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1-3-2020";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case 31-12-2018")
    void getNextDayCase31De() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1-1-2019";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);

    }
}