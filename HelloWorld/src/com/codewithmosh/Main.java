package com.codewithmosh;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int principal;
        float anualRate,monthlyRate;
        int period, monthlyPeriod;
        final byte PERCENT=100;
        final byte MONTHS_IN_YEARS=12;
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        do{
            System.out.print("Principal($1K-$1M): ");
            principal=scanner.nextInt();
            if(principal>=1000 && principal<=1000000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }while(true);

        do{
            System.out.print("Annual Interest anualRate: ");
            monthlyRate=scanner.nextFloat();
            anualRate=monthlyRate/PERCENT/MONTHS_IN_YEARS;
            if(monthlyRate>0 && monthlyRate<=30)
                break;
            System.out.println("Enter a number greater than 0 or less than or equal to 30");
        }while(true);

        do{
            System.out.print("Period(Years): ");
            monthlyPeriod=scanner.nextByte();
            period=monthlyPeriod*MONTHS_IN_YEARS;
            if(monthlyPeriod>=1 && monthlyPeriod<=30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }while(true);

        double mortgagePayment=principal
                *anualRate*Math.pow(1+anualRate,period)
                /(Math.pow(1+anualRate,period)-1);
        System.out.print(currency.format(mortgagePayment));

    }
}
