/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * Currency Codes from ISO 4217
 */

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
        
        COP("COP");

private String value;

Currency(String value) {
this.value = value;
}

@Override
@JsonValue
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


