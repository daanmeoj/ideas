package com.codewithmosh;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int principal;
        float aRate;
        byte yPeriod;
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        principal=(int)readNumber("Principal($1K-$1M): ",1000,1_000_000);
        aRate=(float)readNumber("Annual Interest mRate: ",1,30);
        yPeriod=(byte)readNumber("Period(Years): ",1,30);
        double mortgage=calculateMortgage(principal,aRate,yPeriod);
        printMortgage(currency, mortgage);
        printPayment(principal, aRate, yPeriod, currency);


    }

    private static void printMortgage(NumberFormat currency, double mortgage) {
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.print("Monthly payments: "+ currency.format(mortgage));
    }

    private static void printPayment(int principal, float aRate, byte yPeriod, NumberFormat currency) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(short month = 1; month<=calculateMPeriod(yPeriod); month++){
            System.out.println(currency.format(obtainPaymentSchedule(principal, aRate, yPeriod,month)));
        }
    }

    public static double obtainPaymentSchedule(
            int L,
            float annualInterest,
            byte years,
            int NumberOfPaymentsMade){
        int n=calculateMPeriod(years);
        float c=calculateMRate(annualInterest);
        double B;
        int p=NumberOfPaymentsMade;
        B=L*(Math.pow(1+c,n)-Math.pow(1+c,p))/(Math.pow(1+c,n)-1);
        return B;
    }

    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years){


        int mPeriod=calculateMPeriod(years);
        float mRate=calculateMRate(annualInterest);
        return principal
                *mRate*Math.pow(1+mRate,mPeriod)
                /(Math.pow(1+mRate,mPeriod)-1);
    }

    public  static double readNumber(String prompt,double min, double max){
        Scanner scanner=new Scanner(System.in);
        double value;
        while(true){
            System.out.print(prompt);
            value=scanner.nextFloat();
            if(value>=min && value<=max){
                return  value;
            }

            System.out.println("Enter a value between "+min+ "and"+max);
        }

    }


    public static int calculateMPeriod(int years){
        final byte MONTHS_IN_YEARS=12;
        return years*MONTHS_IN_YEARS;
    }

    public static float calculateMRate(float annualInterest){
        final byte PERCENT=100;
        final byte MONTHS_IN_YEARS=12;
        return annualInterest/PERCENT/MONTHS_IN_YEARS;
    }
}
