package ru.netology.stats;

public class StatsService {

    public int salesSum(int[] sales) {
        int sum = 0;
        for (int num : sales) {
            sum += num;
        }
        return sum;
    }

    public int salesAvg(int[] sales) {
        return salesSum(sales) / sales.length;
    }

    public int salesMax(int[] sales) {
        int maxMonth = sales[0];
        for (int num : sales) {
            if (num > maxMonth)
                maxMonth = num;
        }
        return maxMonth;
    }

    public int salesMin(int[] sales) {
        int minMonth = sales[0];
        for (int num : sales) {
            if (num < minMonth)
                minMonth = num;
        }
        return minMonth;
    }

    public int belowAvg(int[] sales) {
        int countBelow = 0;
        for (int num : sales) {
            if (num < salesSum(sales) / sales.length)
                countBelow = countBelow + 1;
        }
        return  countBelow;
    }

    public int aboveAvg(int[] sales) {
        int countAbove = 0;
        for (int num : sales) {
            if (num > salesSum(sales) / sales.length)
                countAbove = countAbove + 1;
        }
        return  countAbove;
    }
}
