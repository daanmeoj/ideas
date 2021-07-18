package com.codewithmosh;

import com.codewithmosh.TextBox;
import com.codewithmosh.UIControl;
import com.codewithmosh.exceptions.Account;
import com.codewithmosh.exceptions.AccountException;
import com.codewithmosh.exceptions.ExceptionsDemo;
import com.codewithmosh.exceptions.InsufficientFundsException;
import com.codewithmosh.generics.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
      var list=new GenericList<String>();
      list.add("a");
      list.add("b");
      for(var item:list)
          System.out.println(item);
    }

}
