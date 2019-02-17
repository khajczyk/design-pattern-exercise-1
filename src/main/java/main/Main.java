package main;

import chart.BarChart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BarChart barChart = new BarChart.BarChartBuilder()
                .withFontName("Arial")
                .withFontSize(12)
                .withDisplayTitle(true)
                .withTitle("Excercise for Design Patters")
                .build();
    }
}
