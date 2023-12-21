package com.poja.big-sum.controller.util;

import java.math.BigInteger;

public class AddLargeNumbers{

    public static String addLargeNumbers(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);

        BigInteger sum = numA.add(numB);

        return sum.toString();
    }
}
