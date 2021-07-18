package com.codewithmosh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var hLow=new Heap();
        var hHigh=new MinHeap();
        try {
            BufferedReader br=new BufferedReader(
                    new FileReader( "/home/davidmercado/IdeaProjects/Heap/src/com/codewithmosh/input.txt"));

            String s;
            var media=0;
            int counter=1;
            while ((s=br.readLine())!=null){
                if(counter==1) {
                    hHigh.insert(Integer.valueOf(s),s);
                }
                else{
                    if(Integer.valueOf(s)< hHigh.min())
                        hLow.insert(Integer.valueOf(s));
                    else
                        hHigh.insert(Integer.valueOf(s),s);
                }

                if((hHigh.getSize())- hLow.getSize()==2){
                    hLow.insert(Integer.valueOf(hHigh.remove()));
                }
                else if((hLow.getSize()-hHigh.getSize())==2){
                    int hLowRemovedValue=hLow.remove();
                    hHigh.insert(hLowRemovedValue,String.valueOf(hLowRemovedValue));
                }
                if(counter%2==0)
                    media+=hLow.max();
                else{
                    if(hHigh.getSize()< hLow.getSize())
                        media+= hLow.max();
                    else
                        media+=hHigh.min();
                }
                counter++;
            }
            System.out.println(media%10000);
        }catch(Exception ex){
            System.out.println(ex.getStackTrace()[0]);
            return;
        }
    }
}
