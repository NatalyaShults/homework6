package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int monthMax = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }

        return  monthMax + 1;
    }
    public int monthMinSale(long[] sales) {
        int monthMin = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }

        return  monthMin + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int months = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                months++;
            }
        }
        return months;
    }

    public int monthsAboveAverage(long[] sales) {
        int months = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                months++;
            }
        }
        return months;
    }


}
