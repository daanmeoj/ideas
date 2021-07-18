package com.codewithmosh;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        int principal;
        float aRate;
        byte yPeriod;
        principal=(int) Console.readNumber("Principal($1K-$1M): ",1000,1_000_000);
        aRate=(float) Console.readNumber("Annual Interest mRate: ",1,30);
        yPeriod=(byte) Console.readNumber("Period(Years): ",1,30);
        var calculator=new MortgageCalculator(principal,aRate,yPeriod);
        var report=new MortgageReport(calculator);
        report.printMortgage();
        report.printPayment();


    }


}
