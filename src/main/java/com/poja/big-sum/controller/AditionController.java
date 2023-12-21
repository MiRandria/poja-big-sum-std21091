package com.poja.big-sum.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poja.big-sum.service.AditionService;

@RestController
public class AdditionController {

    @PostMapping("/addition")
    public String performAddition(@RequestBody AdditionRequest request) {
        String result = AddLargeNumbers.addLargeNumbers(request.getA(), request.getB());
        return result;
    }
}
