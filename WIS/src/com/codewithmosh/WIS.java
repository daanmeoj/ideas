package com.codewithmosh;

import java.util.ArrayList;

public class WIS {
    public int size,iRecon;
    public ArrayList<Integer> A=new ArrayList<>();
    public ArrayList<Integer> W=new ArrayList<>();
    public ArrayList<Integer> S=new ArrayList<>();

    public int getMWIS(){
        A.add(0);
        A.add(W.get(1));
        for(var i=2;i<=size;i++)
            A.add(Math.max(A.get(i-1),A.get(i-2)+W.get(i)));
        return A.get(size);
    }

    public ArrayList<Integer> reconMWIS(){
        while(iRecon>=2){
            if (A.get(iRecon-1)>=A.get(iRecon-2)+W.get(iRecon))
                iRecon=iRecon-1;
            else{
                S.add(W.get(iRecon));iRecon=iRecon-2;

            }
        }
        if (iRecon==1)
            S.add(W.get(1));
        return S;
    }
}
