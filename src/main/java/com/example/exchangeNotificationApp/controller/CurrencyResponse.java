package com.example.exchangeNotificationApp.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

    public class CurrencyResponse {

    @JsonProperty("currency")
    private List<CurrencyDto> currencyDtos;

    public CurrencyResponse() {
    }

    private CurrencyResponse(Builder builder) {
        currencyDtos = builder.currencyDtos;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public List<CurrencyDto> getCurrencyDtos() {
        return currencyDtos;
    }

    public static final class Builder {
        private List<CurrencyDto> currencyDtos;

        private Builder() {
        }

        public Builder currencyDtos(List<CurrencyDto> currencyDtos) {
            this.currencyDtos = currencyDtos;
            return this;
        }

        public CurrencyResponse build() {
            return new CurrencyResponse(this);
        }
    }
}

