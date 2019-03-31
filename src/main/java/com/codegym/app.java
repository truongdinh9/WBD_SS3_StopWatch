package com.codegym;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Stopwatch3 stopwatch =new Stopwatch3();
        Scanner scanner=new Scanner(System.in);
        stopwatch.setStartTime();
        do {
            System.out.println("Press 1 to set Endtime");
            int keypress=scanner.nextInt();
            if (keypress ==1){
                stopwatch.setEndTime();}

        } while (stopwatch.getEndTime()==0);
        System.out.println("Elapsed Time : "+ stopwatch.getElapsedTime()+" miliseconds= "+stopwatch.getElapsedTime()/1000.0+" Seconds");
    }
}
