package com.example.exchangeNotificationApp.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CurrencyDto implements Serializable {

    @JsonProperty("buying")
    private String buying;
    @JsonProperty("change_rate")
    private String changeRate;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("latest")
    private String latest;
    @JsonProperty("min")
    private String minValue;
    @JsonProperty("max")
    private String maxValue;
    @JsonProperty("selling")
    private String selling;
    @JsonProperty("utime")
    private String uTime;

    public CurrencyDto() {
    }

    private CurrencyDto(Builder builder) {
        buying = builder.buying;
        changeRate = builder.changeRate;
        fullName = builder.fullName;
        latest = builder.latest;
        minValue = builder.minValue;
        maxValue = builder.maxValue;
        selling = builder.selling;
        uTime = builder.uTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBuying() {
        return buying;
    }

    public String getChangeRate() {
        return changeRate;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLatest() {
        return latest;
    }

    public String getMinValue() {
        return minValue;
    }

    public String getMaxValue() {
        return maxValue;
    }

    public String getSelling() {
        return selling;
    }

    public String getuTime() {
        return uTime;
    }

    public static final class Builder {
        private String buying;
        private String changeRate;
        private String fullName;
        private String latest;
        private String minValue;
        private String maxValue;
        private String selling;
        private String uTime;

        private Builder() {
        }

        public Builder buying(String buying) {
            this.buying = buying;
            return this;
        }

        public Builder changeRate(String changeRate) {
            this.changeRate = changeRate;
            return this;
        }

        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder latest(String latest) {
            this.latest = latest;
            return this;
        }

        public Builder minValue(String minValue) {
            this.minValue = minValue;
            return this;
        }

        public Builder maxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }

        public Builder selling(String selling) {
            this.selling = selling;
            return this;
        }

        public Builder uTime(String uTime) {
            this.uTime = uTime;
            return this;
        }

        public CurrencyDto build() {
            return new CurrencyDto(this);
        }
    }
}
