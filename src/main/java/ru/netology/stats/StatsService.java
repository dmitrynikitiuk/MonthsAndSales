package ru.netology.stats;

public class StatsService {

    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
            i = i + 1;
        }
        return minMonth + 1;

    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
            i = i + 1;
        }
        return maxMonth + 1;


    }

    public int getSum(int[] sales) {
        int sum = 0;
        for (int x : sales) {
            sum += x;
        }
        return sum;


    }

    public int getAverage(int[] sales) {
        int sum = 0;
        for (int x : sales) {
            sum += x;
        }
        return sum / sales.length;

    }

    public int getMonthsMoreThanAverage(int[] sales) {
        int average = getAverage(sales);
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                counter++;
            }
        }
        return counter;
    }

    public int getMonthsLessThanAverage(int[] sales) {
        int average = getAverage(sales);
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                counter++;
            }
        }
        return counter;
    }
}