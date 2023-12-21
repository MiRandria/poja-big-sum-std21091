package com.poja.big-sum.service;

import com.poja.big-sum.controller.util.AddLargeNumbers;
import org.springframework.stereotype.Service;

@Service
public class LargeNumberService {

    public String addLargeNumbers(String a, String b) {
        return LargeNumberAddition.addLargeNumbers(a, b);
    }
}
