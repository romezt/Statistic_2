package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldSalesSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.salesSum(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSalesAvg() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.salesAvg(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSalesMax() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 20;

        int actual = service.salesMax(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSalesMin() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;

        int actual = service.salesMin(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldBelowAvg() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.belowAvg(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldAboveAvg() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.aboveAvg(sales);

        assertEquals(expected, actual);
    }
}
