package ru.netology.stats;

public class StatsService {
    public long sum (long[] sales) {
        long total = 0;
        for (long sale:sales) {
            total=total+sale;
        }
        return total;
    }
    public long averageSales(long [] sales) {
        return sum (sales)/sales.length;
    }
    public int maxSaleMonth (long[] sales) {
        int monthMaximum=0;
        for (int i=0; i< sales.length; i++) {
            if (sales [i] >= sales[monthMaximum]) {
                monthMaximum=i;

            }
        }
        return monthMaximum;
    }

    public int minSaleMonth (long [] sales) {
        int monthMinimum =0;
        for ( int i=0; i < sales.length; i++) {
            if (sales [i] <= sales [monthMinimum]) {
                monthMinimum=i;
            }
        }
        return monthMinimum;
    }

     public int salesBelowAverage (long [] sales) {
        int counterBelow = 0;
        for ( long sale:sales){
            if (sale < averageSales (sales)){
                counterBelow++;
            }
        }
        return counterBelow;
     }

     public int salesAboveAverage (long [] sales) {
        int counterAbove = 0;
        for (long sale: sales){
            if ( sale > averageSales(sales)) {
                counterAbove++;
            }
        }
        return counterAbove;
     }


}
