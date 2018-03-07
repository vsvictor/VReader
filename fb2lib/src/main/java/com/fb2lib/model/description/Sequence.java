package com.fb2lib.model.description;

/**
 * Created by victor on 07.03.18.
 */

public class Sequence {
    private String seriesName;
    private int number;

    public Sequence(String seriesName, int numberInSeries){
        this.seriesName = seriesName;
        this.number = numberInSeries;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
