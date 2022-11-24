package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int countBelowAvg(int[] sales) {
        int amountMonths = 0;
        int avg = calculateAvg(sales);
        for (int sale : sales) {
            if (sale < avg) {
                amountMonths += 1;
            }
        }
        return amountMonths;
    }

    public int countAboveAvg(int[] sales) {
        int amountMonths = 0;
        int avg = calculateAvg(sales);
        for (int sale : sales) {
            if (sale > avg) {
                amountMonths += 1;
            }
        }
        return amountMonths;
    }
}

