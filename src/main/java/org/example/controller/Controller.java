package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

@Slf4j
@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/showMoney")
    public String showMoney() {
        CurrencyUnit usd = Monetary.getCurrency("USD");
        MonetaryAmount amount = Monetary.getDefaultAmountFactory().setCurrency(usd).setNumber(500).create();
        return "Amount: " + amount;
    }
}