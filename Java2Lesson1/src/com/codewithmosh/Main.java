package com.codewithmosh;

import com.codewithmosh.TextBox;
import com.codewithmosh.UIControl;
import com.codewithmosh.collections.CollectionsDemo;
import com.codewithmosh.collections.Customer;
import com.codewithmosh.exceptions.Account;
import com.codewithmosh.exceptions.AccountException;
import com.codewithmosh.exceptions.ExceptionsDemo;
import com.codewithmosh.exceptions.InsufficientFundsException;
import com.codewithmosh.generics.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> customers=new ArrayList<>();
        customers.add(new Customer("b"));
        customers.add(new Customer("a"));
        customers.add(new Customer("c"));
        Collections.sort(customers);
        System.out.println(customers);
}}
