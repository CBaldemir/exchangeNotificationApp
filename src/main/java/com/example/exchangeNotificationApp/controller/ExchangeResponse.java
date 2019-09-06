package com.example.exchangeNotificationApp.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExchangeResponse {

    @JsonProperty("response")
    private CurrencyResponse currencyResponse;

    public ExchangeResponse() {
    }

    public CurrencyResponse getCurrencyResponse() {
        return currencyResponse;
    }

    public void setCurrencyResponse(CurrencyResponse currencyResponse) {
        this.currencyResponse = currencyResponse;
    }
}
