package com.codewithmosh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, BigInteger> items=new HashMap<>();
        try {
            BufferedReader br=new BufferedReader(
                    new FileReader( "/home/davidmercado/IdeaProjects/twoSumAlgorithm/src/com/codewithmosh/algo1-programming_prob-2sum.txt"));

            String s;
            int counter=0;
            while ((s=br.readLine())!=null){
                s=s.trim();
                items.putIfAbsent(s,new BigInteger(s));
            }

            BigInteger target=new BigInteger("0");
            BigInteger searchValue=new BigInteger("0");
            for(var i=-10000;i<=10000;i++){
                System.out.println(i);
                target=new BigInteger(String.valueOf(i));
                for (var x:items.keySet()){
                    searchValue=target.subtract(new BigInteger(x));
                    if(!searchValue.equals(new BigInteger(x))){
                        if (items.containsKey(String.valueOf(searchValue))){
                            counter++;
                            break;
                        }
                    }
                }
                System.out.println("counter: "+counter);
            }


            System.out.println("counter: "+counter);
        }catch(Exception ex){
            System.out.println(ex.getStackTrace()[0]);
            return;
        }
    }
}
