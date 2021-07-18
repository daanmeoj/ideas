package com.codewithmosh.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() throws IOException {
        var account=new Account();
        try {
            account.withDraw(10);
        } catch (AccountException e) {
            e.printStackTrace();
        }
    }


}
