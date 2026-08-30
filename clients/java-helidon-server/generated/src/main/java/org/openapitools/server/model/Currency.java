package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Currency Codes from ISO 4217
 */

public enum Currency {

    UNK("UNK"),
    USD("USD"),
    GBP("GBP"),
    CAD("CAD"),
    EUR("EUR"),
    AUD("AUD"),
    NZD("NZD"),
    SEK("SEK"),
    ILS("ILS"),
    CHF("CHF"),
    HKD("HKD"),
    JPY("JPY"),
    SGD("SGD"),
    KRW("KRW"),
    NOK("NOK"),
    DKK("DKK"),
    PLN("PLN"),
    RON("RON"),
    HUF("HUF"),
    CZK("CZK"),
    BRL("BRL"),
    MXN("MXN"),
    ARS("ARS"),
    CLP("CLP"),
    COP("COP"),
    INR("INR"),
    TRY("TRY");

    private String value;

    Currency(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static Currency fromValue(String text) {
        for (Currency b : Currency.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

