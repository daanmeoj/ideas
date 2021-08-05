package com.codewithmosh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var wis=new WIS();
        int counter=0;
        String s;
        BufferedReader br= null;
        try {
            br = new BufferedReader(
                    new FileReader( "/home/davidmercado/IdeaProjects/WIS/input.txt"));

            while ((s=br.readLine())!=null){
                if (counter==0){
                    wis.size=Integer.valueOf(s);
                    wis.iRecon=Integer.valueOf(s);
                    wis.W.add(Integer.valueOf(0));
                }
                else{
                    wis.W.add(Integer.valueOf(s));
                }
                counter++;
            }

            System.out.println(wis.getMWIS());
            int [] input={1,2,3,4,17,117,517,997};
            int [] output={0,0,0,0,0,0,0,0};
            var recon=wis.reconMWIS();
            counter=0;
            for(var item:input){
                if (recon.contains(wis.W.get(item)))
                    output[counter]=1;
                counter++;
            }
            var bits="";
            for (var item:output)
                bits+=String.valueOf(item);
            System.out.println(bits);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
