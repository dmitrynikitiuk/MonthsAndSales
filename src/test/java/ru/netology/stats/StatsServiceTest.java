package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.Provider;

public class StatsServiceTest {
    @Test
    public void shouldFindBetweenEnds() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.getMinMonth(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindBetweenYearEnds() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 6;
        int actualMonth = service.getMaxMonth(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.getSum(sales);
        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.getAverage(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void shouldFindMonthsMoreThanAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthsMoreThanAverage = 5;
        int actualMonthsMoreThanAverage = service.getMonthsMoreThanAverage(sales);
        Assertions.assertEquals(expectedMonthsMoreThanAverage, actualMonthsMoreThanAverage);
    }


    @Test
    public void shouldFindMonthsLessThanAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthsLessThanAverage = 5;
        int actualMonthsLessThanAverage = service.getMonthsLessThanAverage(sales);
        Assertions.assertEquals(expectedMonthsLessThanAverage, actualMonthsLessThanAverage);
    }
}