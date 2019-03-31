package com.codegym;


import java.sql.Time;

public class Stopwatch3 {
    private long startTime ;
    private long endTime=0;

    public long getStartTime() {
        return startTime;
    }

    long getEndTime() {
        return endTime;
    }

    void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    void setEndTime() {
        this.endTime =System.currentTimeMillis();
    }
    long getElapsedTime(){
        return this.endTime-this.startTime;

    }

}
