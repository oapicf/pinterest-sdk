package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Currency Codes from ISO 4217
 **/

public enum Currency {

    UNK(String.valueOf("UNK")), USD(String.valueOf("USD")), GBP(String.valueOf("GBP")), CAD(String.valueOf("CAD")), EUR(String.valueOf("EUR")), AUD(String.valueOf("AUD")), NZD(String.valueOf("NZD")), SEK(String.valueOf("SEK")), ILS(String.valueOf("ILS")), CHF(String.valueOf("CHF")), HKD(String.valueOf("HKD")), JPY(String.valueOf("JPY")), SGD(String.valueOf("SGD")), KRW(String.valueOf("KRW")), NOK(String.valueOf("NOK")), DKK(String.valueOf("DKK")), PLN(String.valueOf("PLN")), RON(String.valueOf("RON")), HUF(String.valueOf("HUF")), CZK(String.valueOf("CZK")), BRL(String.valueOf("BRL")), MXN(String.valueOf("MXN")), ARS(String.valueOf("ARS")), CLP(String.valueOf("CLP")), COP(String.valueOf("COP"));


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



