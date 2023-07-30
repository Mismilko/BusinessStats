package ru.netology.stats;


public class StatsService {
    long arithmeticMean;

    public long sum(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total = total + sale;
        }
        return total;
    }

    //среднее арифметическое продаж
    public long average(long[] sales) {

        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        long averageSale = totalSale / 12;
        return averageSale;

    }

    //максимальное значение продаж
    public int maxSaleMonth(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;

            }
        }
        return monthMaximum;
    }

    //минимальное значение продаж
    public int minSaleMonth(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = i;
            }
        }
        return monthMinimum;
    }

    // количество месяцев ниже среднего
    public int salesBelowAverage(long[] sales) {
        int counterBelow = 0;
        for (long sale : sales) {

            if (sale < average(sales)) {
                counterBelow++;

            }
        }
        return counterBelow;
    }

    //количество месяцев выше среднего
    public int salesAboveAverage(long[] sales) {
        int counterAbove = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counterAbove++;
            }
        }
        return counterAbove;
    }


}
