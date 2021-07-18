package com.codewithmosh;

public class MortgageCalculator {

    private static final byte PERCENT=100;
    private static final byte MONTHS_IN_YEARS=12;

    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public  double calculateMortgage(){
        int mPeriod=calculateMPeriod(years);
        float mRate=calculateMRate(annualInterest);
        return principal
                *mRate*Math.pow(1+mRate,mPeriod)
                /(Math.pow(1+mRate,mPeriod)-1);
    }


    public double obtainPaymentSchedule(
            int NumberOfPaymentsMade){
        int n= calculateMPeriod(years);
        float c= calculateMRate(annualInterest);
        double B;
        int p=NumberOfPaymentsMade;
        B=principal*(Math.pow(1+c,n)-Math.pow(1+c,p))/(Math.pow(1+c,n)-1);
        return B;
    }

    public double[] getRemainingBalances(){
        var balances=new double[calculateMPeriod(years)];
        for(short month = 1; month<= calculateMPeriod(years); month++)
            balances[month-1]= obtainPaymentSchedule(month);

        return balances;
    }

    private short getYears() {
        return years;
    }

    private static int calculateMPeriod(int years){
        return years*MONTHS_IN_YEARS;
    }

    private static float calculateMRate(float annualInterest){
        return annualInterest/PERCENT/MONTHS_IN_YEARS;
    }

}
