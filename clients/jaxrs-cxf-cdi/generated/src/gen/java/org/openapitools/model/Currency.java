package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Currency Codes from ISO 4217
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum Currency {

    @JsonProperty("UNK") UNK(String.valueOf("UNK")), @JsonProperty("USD") USD(String.valueOf("USD")), @JsonProperty("GBP") GBP(String.valueOf("GBP")), @JsonProperty("CAD") CAD(String.valueOf("CAD")), @JsonProperty("EUR") EUR(String.valueOf("EUR")), @JsonProperty("AUD") AUD(String.valueOf("AUD")), @JsonProperty("NZD") NZD(String.valueOf("NZD")), @JsonProperty("SEK") SEK(String.valueOf("SEK")), @JsonProperty("ILS") ILS(String.valueOf("ILS")), @JsonProperty("CHF") CHF(String.valueOf("CHF")), @JsonProperty("HKD") HKD(String.valueOf("HKD")), @JsonProperty("JPY") JPY(String.valueOf("JPY")), @JsonProperty("SGD") SGD(String.valueOf("SGD")), @JsonProperty("KRW") KRW(String.valueOf("KRW")), @JsonProperty("NOK") NOK(String.valueOf("NOK")), @JsonProperty("DKK") DKK(String.valueOf("DKK")), @JsonProperty("PLN") PLN(String.valueOf("PLN")), @JsonProperty("RON") RON(String.valueOf("RON")), @JsonProperty("HUF") HUF(String.valueOf("HUF")), @JsonProperty("CZK") CZK(String.valueOf("CZK")), @JsonProperty("BRL") BRL(String.valueOf("BRL")), @JsonProperty("MXN") MXN(String.valueOf("MXN")), @JsonProperty("ARS") ARS(String.valueOf("ARS")), @JsonProperty("CLP") CLP(String.valueOf("CLP")), @JsonProperty("COP") COP(String.valueOf("COP"));


    private String value;

    Currency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static Currency fromValue(String value) {
        for (Currency b : Currency.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



